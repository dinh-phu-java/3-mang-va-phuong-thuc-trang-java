package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArr = {2,4,5,4,23,6,-1};
        int min =0;
        for (int i =0;i<myArr.length;i++){
            if (min>myArr[i]){
                min = myArr[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng là %d",min);
    }
}
