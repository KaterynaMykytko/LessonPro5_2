package org.courses.ex5_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name:");
        String name = scanner.next();
        Class<?> aClass = Class.forName(name);
        System.out.println(aClass);

        for (Method declaredMethod : aClass.getDeclaredMethods()) {
            System.out.println(declaredMethod);
        }
        for (Constructor<?> constructor : aClass.getConstructors()) {
            System.out.println(constructor);
        }
    }
}
