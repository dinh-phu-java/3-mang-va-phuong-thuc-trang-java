package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n= in.nextInt();
        int[] mang={2,5,75,4,2,6,-2};
        int min = minArr(mang);
        System.out.println(min);
    }
    public static int minArr(int[] arr){
        int min =0;
        int min_index=0;
        for (int i=0;i<arr.length;i++){
            if(min > arr[i]){
                arr[i]=min;
                min_index=i;
            }
        }
        return min_index;
    }
}
