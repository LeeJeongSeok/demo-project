package com.lee.week;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("1-1", "1");
        map1.put("1-2", "2");
        map1.put("1-3", "3");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("2-1", "4");
        map2.put("2-2", "5");
        map2.put("2-3", "6");

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("3-1", "7");
        map3.put("3-2", "8");
        map3.put("3-3", "9");

        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("4-1", "10");
        map4.put("4-2", "11");
        map4.put("4-3", "12");

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("5-1", "13");
        map5.put("5-2", "14");
        map5.put("5-3", "15");

        Map<String, String> map6 = new HashMap<String, String>();
        map6.put("6-1", "16");
        map6.put("6-2", "17");
        map6.put("6-3", "18");

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);


        List<Map<String, String>> list2 = new ArrayList<>();
        list2.add(map4);
        list2.add(map5);
        list2.add(map6);

        map1.putAll(map2);


        System.out.println("List Size : " + list.size());
        System.out.println("List2 Size : " + list2.size());


        for (Map<String, String> map : list2) {
            list.add(map);
        }


        System.out.println("list = " + list);

        for (Map<String, String> printMap : list) {
            System.out.println("printMap.toString() = " + printMap.toString());
        }

        System.out.println("===============================================================");

        for (Map<String, String> printMap2 : list2) {
            System.out.println("printMap2.toString() = " + printMap2.toString());
        }

//        List<String> list1 = new ArrayList<>();
//        list1.add("a1");
//        list1.add("a2");
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("b1");
//        list2.add("b2");
//
//        List<String> joined = new ArrayList<>();
//        joined.addAll(list1);
//        joined.addAll(list2);
//
//        System.out.println(joined);

    }
}
