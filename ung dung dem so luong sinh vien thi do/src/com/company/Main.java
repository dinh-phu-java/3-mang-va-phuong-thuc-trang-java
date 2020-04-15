package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng sinh viên tối đa 30 sinh viên: ");
            n =in.nextInt();
        }while(n>30);

        int[] students=new int[n];
        int count= 0;
         for (int i =0;i<students.length;i++){
             System.out.printf("Nhập điểm cho sinh viên thứ "+i+": ");
             students[i]=in.nextInt();
         }

        for (int i =0;i<students.length;i++){
            if (students[i]>=5){
                count++;
            }
        }

        System.out.println("Danh sách sinh viên có số sinh viên qua là "+count);


    }
}
