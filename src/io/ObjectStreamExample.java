package io;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ObjectStreamExample {
    public static void main(String[] args) {
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/io/person.ser"));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/io/person.ser"));

            objectOutputStream.writeObject(new Person("Marufur Rahman Remon", 25));
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
