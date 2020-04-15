package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArr = {1,2,3,4};
        int[] otherArr={5,6,7,8};
        int[] newArr=new int[myArr.length + otherArr.length];

        System.out.println(newArr.length);

        for (int i=0;i<myArr.length;i++){
            newArr[i]=myArr[i];
        }

        for (int j=0;j<otherArr.length;j++){
            newArr[j+myArr.length]=otherArr[j];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
