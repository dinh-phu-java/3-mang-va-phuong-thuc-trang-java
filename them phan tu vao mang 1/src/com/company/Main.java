package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArr={2,2,6,5,15,9,10};

        int insert_elm=16;
        int insert_index=0;

        myArr=insertElmInArr(myArr,insert_elm,insert_index);
        System.out.println(Arrays.toString(myArr));
    }
    public static int[] insertElmInArr(int[] arr , int elm, int index){
        int[] newArr=new int[arr.length+1];

        boolean inserted=false;
        for (int i=0;i<arr.length+1;i++){

            if (i == index){
                newArr[i]=elm;
                inserted=true;
            }else{
                if (inserted){
                    newArr[i]=arr[i-1];
                }else{
                    newArr[i]=arr[i];
                }
            }

        }

        return newArr;
    }
}
