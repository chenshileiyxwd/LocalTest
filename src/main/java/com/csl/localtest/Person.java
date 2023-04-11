package com.csl.localtest;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @ClassName Student
 * @Description TODO
 * @Author mrlei
 * @Date 2021/10/11 0:07
 * @Version 1.0
 **/
public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class PersonBuilder {
        private Person person;

        private PersonBuilder() {
            person = new Person();
        }

        public static PersonBuilder aPerson() {
            return new PersonBuilder();
        }

        public PersonBuilder withName(String name) {
            person.setName(name);
            return this;
        }

        public PersonBuilder withAge(int age) {
            person.setAge(age);
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
