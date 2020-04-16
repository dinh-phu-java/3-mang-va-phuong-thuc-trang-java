package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String java= "Java is the best language in the world. Please learn it carefully";

        Scanner in = new Scanner(System.in);
        System.out.println("nhập từ cần tìm");
        String letter= in.nextLine();
        int count_letter= 0;
        //Cách 1
//        for (int i =0; i< java.length();i++){
//            if(letter.equals(String.valueOf(java.charAt(i))) ){
//                count_letter++;
//            }
//        }
        // Cách 2
        int[] arr= java.codePoints().toArray();
        int lett_cp =letter.codePointAt(0);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==lett_cp){
                count_letter++;
            }
        }


        System.out.printf("Có tổng số chữ %s trong chuỗi java",count_letter);
    }
}
