package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("1. Convert from C to F");
            System.out.println("2. Convert from F to C");
            System.out.println("3. Exit");
            System.out.println("Số bạn chọn là : ");
            n= in.nextInt();
            double doC;
            double doF;

            switch(n){
                case 1:
                    System.out.println("nhập độ C:");
                    doC= in.nextDouble();
                    doF= ((9*doC)/5)+32;
                    System.out.printf("Độ F là %.2f",doF);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("NHập độ F:");
                    doF=in.nextDouble();
                    doC=(5.0/9.0)*(doF-32);
                    System.out.printf("Độ C là %.2f",doC);
                    System.out.println();
                    break;
            }

        }while(n !=3);
    }
}
