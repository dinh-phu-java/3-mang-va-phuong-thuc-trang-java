package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập chiều dài cho mảng: ");
            n=in.nextInt();
            if(n>20){
                System.out.println("Chiều dài không được quá 20!");
            }
        }while(n>20);

        double[] arr= new double[n];
        for (int i=0;i<n;i++){
            System.out.printf("Nhập giá trị cho vị trí thứ %d trong mảng: ",i);
            arr[i]=in.nextDouble();
        }
        System.out.println("mảng vừa nhập là:");
        System.out.println(Arrays.toString(arr));
        double max=0;
        for (int i=0;i<n;i++){
            if(max < arr[i]){
                max =arr[i];
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là %.2f",max);
    }
}
