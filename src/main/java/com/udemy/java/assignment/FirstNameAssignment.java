package com.udemy.java.assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNameAssignment {

    public static void main(String[] args) throws IOException {

        // /home/qa/Downloads/udemy-java/first-names.txt
        Path path = Paths.get("/home/qa/Downloads/udemy-java/first-names.txt");
        List<String> list = Files.readAllLines(path);

        // print the count of names which start with B
        System.out.println(

                list.stream()
                        .filter(name -> name.startsWith("B"))
                        .count()

        );

        // create a list of names which start with C and contains 's' in it
        List<String> names = list.stream()
                                    .filter(name -> name.startsWith("C"))
                                    .filter(name -> name.toLowerCase().contains("s"))
                                    .collect(Collectors.toList());

        System.out.println(names.size());


        // print the total number of chars for all the names starting with M
        System.out.println(

                list.stream()
                    .filter(name -> name.startsWith("M"))
                    .map(String::trim)
                    .map(String::length)
                    .mapToInt(i -> i)
                    .sum()


        );


        // Jo-Ann => Jo Ann
        // find the names containing - in it and replace it with a space; collect them into a list
        System.out.println(

                list.stream()
                    .filter(name -> name.contains("-"))
                    .map(name -> name.replaceAll("-", " "))
                    .collect(Collectors.toList())


        );


        // find the name which has more number of chars

        System.out.println(

                list.stream()
                    .max(Comparator.comparing(s -> s.length()))
                    .get()

        );

    }

}
