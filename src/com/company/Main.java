package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(set2);

        symmetricSetDifference(set, set2);


    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set, Set<Integer> set2) {
        Set<Integer> newSet = new HashSet<Integer>(set);
        newSet.removeAll(set2);
        set2.removeAll(set);
        newSet.addAll(set2);
        System.out.println(newSet);
        return newSet;
    }

}

