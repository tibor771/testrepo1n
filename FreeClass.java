package sk.itsovy.sestak.other;

import javax.swing.*;

public class FreeClass {
    public void sayHello() {
        System.out.println("Hi");
    }

    public void sayNHello(int n) {
        int i = 1;
        while (i < n) {
            System.out.print("Hi ");
            i++;
        }
    }

    public int getEven(int number) {
        if (number % 2 == 0)
            return number;
        else
            return number = number + 1;
        //number + 1; number++; number += 1;
    }

}

