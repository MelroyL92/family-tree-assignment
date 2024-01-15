package org.example;
import java.util.List;
import java.util.ArrayList;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private String age;
    private Person mother;
    private Person father;



    private List<Person>children = new ArrayList<>();
    private List<Person>siblings = new ArrayList<>();
    private List<Pets>pets = new ArrayList<>();



public Person(String name, String lastName, String sex, String age) {
    this.name = name;
    this.lastName = lastName;
    this.sex = sex;
    this.age = age;
}

public Person(String name,String middleName, String lastName, String sex, String age){
    this.name = name;
    this.middleName = middleName;
    this.lastName = lastName;
    this.sex = sex;
    this.age = age;
}

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addParents(Person father, Person mother){
    setFather(father);
    setMother(mother);
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addPet(Pets pet){
        pets.add(pet);
    }

    public void addSibling(Person sibling){
    siblings.add(sibling);
    }

    public void addGrandchild(Person grandchild) {
        for (Person child : children) {
            child.addChild(grandchild);
        }
    }

    public List<Person>getGrandChildren(){
        List<Person>grandchildren= new ArrayList<>();
        for(Person child: children){
            for(Person grandchild:child.getChildren()){
                grandchildren.add(grandchild);
            }
    }
        return grandchildren;
    }

}
