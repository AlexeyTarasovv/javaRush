package com.company.stackTraceAndExceptions.task931;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);

        String str = "Я не хочу изучать Java, я хочу большую зарплату";

        int i = 432;

        String s = Integer.toString(i);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> result = new HashMap<>();

        result.put("васька", new Cat("васька"));
        result.put("мурка", new Cat("мурка"));
        result.put("дымка", new Cat("дымка"));
        result.put("рыжик", new Cat("рыжик"));
        result.put("серый", new Cat("серый"));
        result.put("снежок", new Cat("снежок"));
        result.put("босс", new Cat("босс"));
        result.put("борис", new Cat("борис"));
        result.put("барсик", new Cat("барсик"));
        result.put("гарфи", new Cat("гарфи"));

        return result;
    }

    public static HashSet convertMapToSet(Map<String, Cat> map) {
        return new HashSet(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}



