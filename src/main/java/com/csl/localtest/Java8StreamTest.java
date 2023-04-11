package com.csl.localtest;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName Java8StreamTest
 * @Description TODO
 * @Author mrlei
 * @Date 2023/2/10 1:05
 * @Version 1.0
 **/
public class Java8StreamTest {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        JSONArray put = jsonArray.put(new JSONObject());
        
        Person per1 = Person.PersonBuilder.aPerson().withName("csl").withAge(18).build();
        Person per2 = Person.PersonBuilder.aPerson().withName("csc").withAge(17).build();
        Person per3 = Person.PersonBuilder.aPerson().withName("csm").withAge(19).build();
        Person per4 = Person.PersonBuilder.aPerson().withName("csl").withAge(22).build();
        ArrayList<Person> list = new ArrayList<>();
        list.add(per1);
        list.add(per2);
        list.add(per3);
        list.add(per4);

        List<Person> collect1 = list.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
        List<Person> collect2 = list.stream().sorted(Comparator.comparing(Person::getAge,Comparator.reverseOrder())).collect(Collectors.toList());
        Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getName));
        System.out.println("collect = " + collect);

    }
}
