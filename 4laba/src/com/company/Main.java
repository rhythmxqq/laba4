package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int MinElem(int[] gg){
        int min = gg[0];
        for(int i = 0; i< gg.length;i++){
            if (gg[i]< min){
                min = gg[i];
            }
        }
        return min;
    }
    static double Sred(int[] myArr){
        int zxc = 0;
        for(int i = 0; i< myArr.length;i++){
            zxc += myArr[i];
        }
        zxc = zxc/myArr.length;
        return zxc;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во эл-ов массива: ");
        int kol = scan.nextInt();
        int[] qq = new int[kol];
        for (int i = 0; i < qq.length; i++){
            System.out.println("введите элемент массива " + i);
            qq[i]= scan.nextInt();
        }
        for (int i : qq) {
            System.out.print(i + " ");
        }
        System.out.println();
        int min = MinElem(qq);
        double sred = Sred(qq);
        double summa = min + sred;
        System.out.println("Минимальный элемент = " + min + " среднее арифметическое = " + sred + " сумма = " + summa);
    }

}

