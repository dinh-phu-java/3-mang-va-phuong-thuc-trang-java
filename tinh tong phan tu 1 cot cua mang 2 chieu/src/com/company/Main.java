package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("nhập chiều dài cho mảng 2 chiều");
        int n= in.nextInt();
         int[][] myArr= new int[n][n];
         for (int i =0;i<n;i++){
             for (int j=0;j<n;j++){
                 System.out.printf("nhập giá trị thứ %d - %d ",i,j);
                 myArr[i][j]= in.nextInt();
             }
         }



        System.out.println("Nhập cột muốn tính tổng phải nhở hơn n: ");
        int column = in.nextInt();


//                int[][] myArr= {
//                {2,5,6},
//                {6,12,7},
//                {9,3,1}
//        };
    int sum=0;
          for (int i =0; i<myArr.length;i++){
              sum+=myArr[i][column-1];
          }
        System.out.println("Mảng vừa nhập là: ");
          for (int i =0;i<n;i++){
              System.out.print("[");
              for (int j=0;j<n;j++){
                  System.out.print(myArr[i][j]);
                  if(j<n-1){
                      System.out.print(" , ");
                  }
              }
              System.out.println("]");
          }
        System.out.printf("Tổng column %d là %d",column,sum);
    }
}
