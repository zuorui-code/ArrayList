package com.java.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author zuorui
 * @creat 2020-09-23-21:08
 */
public class Demo2 {

    public static void main(String[] args) {
        Set blist = new TreeSet();
        blist.add(-1);
        blist.add(8);
        blist.add(89);
        blist.add(874);
        blist.add(12);
        blist.add(-9);

        blist.forEach(x-> System.out.println(x));

    }
}
