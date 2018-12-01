package ue3;

import javax.swing.*;

public class Aufgabe4 {
    public static void main(String [] args){
        System.out.println(fibonaccirekursiv(Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"))));
        System.out.println(fibonacciiterativ(Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"))));
    }

    public static int fibonaccirekursiv(int zahl) {
        if (zahl==0){
            return 0;
        }
        else if (zahl==1){
            return 1;
        }
        else {
            return fibonaccirekursiv (zahl-2) + fibonaccirekursiv(zahl-1);
        }
    }

    public static int fibonacciiterativ(int zahl) {
        //Muss mit -1 starten da 0 benötigt wird um die zweite 1 zu berechnen
        int prev = -1, next = 1, result =0;
        for(int i = 0; i <= zahl; i++)
        {
            result = prev+next;
            prev = next;
            next = result;
        }
        return result;
    }
}

