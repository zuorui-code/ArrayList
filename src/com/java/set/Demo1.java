package com.java.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zuorui
 * @creat 2020-09-23-20:52
 */
public class Demo1 {
    public static void main(String[] args) {

        Set<String> aSet = new HashSet<>();
        aSet.add("88");
        aSet.add("18");
        aSet.add("55");
        aSet.add("9");
        aSet.add("88");

        aSet.remove("88");
        boolean flag = aSet.contains("88");
        System.out.println(flag);
        boolean empty = aSet.isEmpty();
        System.out.println(empty);

        for (Object x : aSet) {
            System.out.println(x);

        }
    }


}
