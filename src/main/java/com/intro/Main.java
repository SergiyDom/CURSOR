package com.intro;

public class Main {
    public static void main(String[] args) {
        byte b = 8;
        short s = 16;
        long l = 300;
        double d = 28.8;
        float f = 288.8f;

        System.out.println("b + s = " + (b + s));
        System.out.println("l + d = " + (l + d));
        System.out.println("d + f = " + (d + f));

        System.out.println("b - s = " + (b - s));
        System.out.println("l - d = " + (l - d));
        System.out.println("d - f = " + (d - f));

        System.out.println("b * s = " + b * s);
        System.out.println("l * d = " + l * d);
        System.out.println("d * f = " + d * f);

        System.out.println("b / s = " + (b*1.0) / s);
        System.out.println("l / d = " + l / d);
        System.out.println("d / f = " + d / f);
    }
}
