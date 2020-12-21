package lesson9.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class students {
    static class Person {
        enum Course {
            JAVA, QA, PRODUCTM;
        }
        private String name;
        private int age;
        private Course сourse;

        public Person(String name, int age, Course сourse) {
            this.name = name;
            this.age = age;
            this.сourse = сourse;
        }

        public int getAge() {
            return age; }
    }
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 35, Person.Course.JAVA),
                new Person("Bob2", 44, Person.Course.JAVA),
                new Person("Bob3", 25, Person.Course.JAVA),
                new Person("Bob4", 42, Person.Course.QA),
                new Person("Bob5", 55, Person.Course.QA),
                new Person("Bob6", 19, Person.Course.QA),
                new Person("Bob7", 33, Person.Course.PRODUCTM),
                new Person("Bob8", 37, Person.Course.PRODUCTM)
        ));
        List<String> productmsName = (List<String>) persons.stream()
                .filter(person -> person.сourse == Person.Course.PRODUCTM)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map((Function<Person, String>) person -> person.name)
                .collect(Collectors.toList());
        System.out.println(productmsName);
    }
}

