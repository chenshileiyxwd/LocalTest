package com.csl.localtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class LocalTestApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(1111);

    }

    @Test
    public void test123() {
        Student csl = Student.StudentBuilder.aStudent().withName("csl").withAge(32).withHeight(1.73).build();
        Student csc = Student.StudentBuilder.aStudent().withName("csc").withAge(34).withHeight(1.74).build();
        Student csm = Student.StudentBuilder.aStudent().withName("csm").withAge(22).withHeight(1.76).build();
        Student csg = Student.StudentBuilder.aStudent().withName("csg").withAge(38).withHeight(1.70).build();
        ArrayList<Student> students = new ArrayList<>();

        students.add(csl);
        students.add(csc);
        students.add(csm);
        students.add(csg);

        List<Student> collect = students.stream().sorted(Comparator.comparing(Student::getAge).reversed())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<Student> collect1 = students.stream()
                .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getHeight)).collect(
                        Collectors.toList());
        collect1.forEach(System.out::println);
    }

}
