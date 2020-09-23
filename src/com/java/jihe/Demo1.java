package com.java.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.DeflaterOutputStream;

/**
 * @author zuorui
 * @creat 2020-09-23-19:54
 */
public class Demo1 {

    public static void main(String[] args) {

        List alist = new LinkedList();

        alist.add(true);
        alist.add(78.2);
        alist.add("好");
        alist.add(15);
        alist.add(true);
        alist.add("好");
        alist.add(12);
        alist.add(2.2F);
        alist.add(false);

        Object o1 = alist.get(0);
        System.out.println("o1="+o1);
        System.out.println("-----------");


        for (int i = 0; i < alist.size(); i++) {

            System.out.println(alist.get(i));


        }
        System.out.println("----------");

        for(Object temp:alist){
            System.out.println(temp);
        }
        System.out.println("---------");

        alist.forEach(x -> System.out.println(x));



    }
}
