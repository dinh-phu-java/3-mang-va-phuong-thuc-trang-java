package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] myArr ={
                {2,5,3},
                {36,2,35},
                {23,7,101}
        };
        int max = 0;
        for (int[] row : myArr){
            for (int value : row){
                if (max < value ){
                    max=value;
                }
            }
        }

        System.out.printf("Giá trị lớn nhất trong mảng 2 chiều là %d",max);
    }
}
