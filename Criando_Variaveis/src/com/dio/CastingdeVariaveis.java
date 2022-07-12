package com.dio;

public class CastingdeVariaveis {

    public static void main(String[] args) {

        //downcast precisa informar o tipo
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;


        //upcast
        long l1;
        int i1 = 10000;
        l1 = i1;

        //upcast
        double d1;
        float f1 = 18.9f;
        d1 = f1;

        System.out.println(i1);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(d1);
        System.out.println(f1);

    }
}
