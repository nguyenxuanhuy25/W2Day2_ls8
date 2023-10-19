package src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> classSet = new TreeSet<>(Comparator.comparing(Student::getScore));
        Random random = new Random();

        // Add random students to the set
        for (int i = 0; i < 10; i++) {
            Student student = new Student("Student "+i , 18+ random.nextInt(5), 10 + random.nextDouble(10));
            classSet.add(student);
        }

        System.out.println("Class set: ");
        for (Student student : classSet) {
            System.out.println(student);
        }

    }
}


