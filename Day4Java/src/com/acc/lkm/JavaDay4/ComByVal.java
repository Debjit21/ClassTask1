package com.acc.lkm.JavaDay4;

import java.util.*;

public class ComByVal {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("ABC", 50);
        hashMap.put("GHF", 35);
        hashMap.put("IOL", 77);
        hashMap.put("RTF", 89);
        hashMap.put("WSD", 46);
        
        
        System.out.println("Original HashMap:");
        System.out.println(hashMap);

        
        
        hashMap.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .sorted(Map.Entry.comparingByValue())
            .forEach(System.out::println);

    }
}

