package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void addParents() {

        // arrange
        Person person = new Person("base line", "n.v.t.", "bullshit", "500");
        Person mother = new Person("karen", "woman", "female", "50");
        Person father = new Person("john", "doe", "male", "55");

        // act
        person.addParents(father, mother);


        // assert
        assertEquals(father, person.getFather());
        assertEquals(mother, person.getMother());
    }

    @Test
    void addChild() {
        // arrange
        Person parent = new Person("John", "Doe", "Male", "35");
        Person child1 = new Person("john", "doe junior", "male", "10");
        Person child2 = new Person("woman","no inspiration", "female","8");
        // act
        parent.addChild(child1);
        parent.addChild(child2);

        // assert
        assertTrue(parent.getChildren().contains(child1));
        assertTrue(parent.getChildren().contains(child2));

    }

    @Test
    void getGrandChildren() {
        // arrange
        Person parent = new Person("John", "Doe", "Male", "60");
        Person child1 = new Person("john", "doe junior", "male", "30");
        Person child2 = new Person("woman","no inspiration", "female","35");
        Person grandchild1 = new Person("gc1","whatever","male", "5");
        Person grandchild2 = new Person("gc2", "whatever", "female","7");

        // act
        parent.addChild(child1);
        parent.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        // assert
        List<Person> grandchildren = parent.getGrandChildren();

        assertEquals(2, grandchildren.size());
    }

    @Test
    void addPet() {
        // arrange
        Pets cat = new Pets("vlad", "blue russian");
        Pets dog = new Pets("romy", "yorkshire");
        // act

        // assert
    }

    @Test
    void addSibling() {
        // arrange
        Person child1 = new Person("John", "Doe", "Male", "20");
        Person brother = new Person("john", "doe junior", "male", "10");
        Person sister = new Person("woman","no inspiration", "female","8");
        // act
        child1.addSibling(brother);
        child1.addSibling(sister);

        // assert
        assertTrue(child1.getSiblings().contains(brother));
        assertTrue(child1.getSiblings().contains(sister));
    }
}
