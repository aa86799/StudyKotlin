package com.stone.clazzobj.generic;

import java.util.*;

/**
 * desc  :
 * author: stone
 * email : aa86799@163.com
 * time  : 12/06/2017 12 28
 */


public class Tes {

    public ASA  covariant(List<? extends ASA> list) {
        ASA t = list.get(0);
//        list.add(new ASA());
        return t;
    }

    public void  contravariant(List<? super BSB> list, ASA ta, BSB tb) {
//        list.add(ta); //只能add  BSB或其子类
        list.add(tb);

    }

    void test() {
        add(new java.util.ArrayList<Number>());
    }

    void add(List<? super Integer> foo) {
        foo.add(3); //只能是integer
//        foo.add(3.3f);//报错， 只能是integer
    }

//    void origin() {
//        List<String> strs = new ArrayList<>();
//        List<Object> objs = strs;// Java禁止
//
//        String[] ar = null;
//        Object[] ary = ar;  //java 允许
//
//    }

    public static void main(String[] args) {
        List<String>[] ary = new List[1];
//        ary[0] = new ArrayList<>();
        List<Integer> intList = Arrays.asList(3);
        Object[] objects = ary;
        objects[0] = intList;
        String s = ary[0].get(0);

        List<List<String>> l = new ArrayList<>();
//        List<Object> lo = l;
        l.toArray();

        /*
        数组是协变的，  即  声明类型 是一个 超类型， =后跟一个  子类型   即 extends 超类型
        数组协变，用于 赋值的语句， 是可以通过编译的， 但运行会异常

        泛型 协变是可以声明的， 但赋值是不能通过编译的。

        其它泛型  PECS原则：
        生产者（Producer）使用extends，  (对应kotlin中的  <out T>)
        消费者（Consumer）使用super。    (对应kotlin中的  <in T>)
         */

        List<? extends Number> foo3 = new ArrayList<Double>();
        List<? extends Number> foo4 = new ArrayList<Number>();
//        foo3.addAll(foo4);
    }
}

