package com.java.map;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zuorui
 * @creat 2020-09-23-21:22
 */
public class Demo1 {

    public static void main(String[] args) {

        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("1", "java大白");
        String v1 = bookMap.put("1", "钢铁是怎样炼成的");
        bookMap.put("2", "疯狂java");
        bookMap.put("3", "java从入门到精通");
        System.out.println(v1);

        bookMap.forEach((k, v) -> System.out.println(k + "=" + v));


    }
}
