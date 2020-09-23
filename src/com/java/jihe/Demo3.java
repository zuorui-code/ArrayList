package com.java.jihe;

import org.omg.CORBA.ContextList;

import javax.swing.text.html.parser.AttributeList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zuorui
 * @creat 2020-09-23-20:42
 */
public class Demo3 {

    public static void main(String[] args) {

        List alist = new LinkedList();
        alist.add("tre");
        alist.add("java从入门到精通");
        alist.add(19);

        alist.set(0,12);
       Object o = alist.get(1);
        System.out.println("o="+ o);

        alist.forEach(x-> System.out.println(x));
    }




}
