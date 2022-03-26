package com.csl.localtest;

/**
 * @ClassName Student
 * @Description TODO
 * @Author mrlei
 * @Date 2021/10/11 0:07
 * @Version 1.0
 **/
public class Student {
    String name;
    int age;
    double height;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static final class StudentBuilder {
        String name;
        int age;
        double height;

        private StudentBuilder() {
        }

        public static StudentBuilder aStudent() {
            return new StudentBuilder();
        }

        public StudentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder withHeight(double height) {
            this.height = height;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            student.setHeight(height);
            return student;
        }
    }
}
