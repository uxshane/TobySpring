package com.minkyu.hellospring;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<String> scores = Arrays.asList("a", "c", "aa", "b", "bb");
        scores.sort((o1, o2) -> o2.length() - o1.length());

        scores.forEach(System.out::println);

    }
}
