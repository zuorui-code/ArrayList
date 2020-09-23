package com.java.jihe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zuorui
 * @creat 2020-09-23-20:22
 */
public class Demo2 {

    public static void main(String[] args) {

        List<String> alist = new ArrayList<String>();
        alist.add("左锐");
        alist.add("张希栋");
        alist.add("苏大");
        alist.add("蚌院");
        alist.add("锐锐大宝贝");

        alist.remove(3);

        alist.set(2, "北大");
        alist.forEach(System.out::println);


       /* alist.remove("蚌院");
        alist.forEach(x -> System.out.println(x));
*/
    }

}

