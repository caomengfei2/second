package com.myFirst.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJava {

    public static void main(String[] args) {
        System.out.println("null".isEmpty());
        Map map =new HashMap();
        char a = 'a';
        switch (a) {
            case '1': {
                System.out.println("1");
            }
            case 'a': {
                System.out.println("1");
            }
            default:
                System.out.println("dd");

        }
        List<Map> list = new ArrayList<>();
        for (Map map1 : list) {

        }
        for (int i = 0; i < 10; i++) {
            map = new HashMap();
            map.put("first", "first");
            map.put("hundred", "hundred");
            list.add(map);
        }
        list.forEach(System.out::println);
        list.forEach(t -> System.out.println("集合元素是：" + t));
        FirstMapper lam = () -> {
            return 666;
        };
}


}
