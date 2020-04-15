package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int[] myArr = {2,3,5,15,6,8};
        //int[] newArr= new int[myArr.length-1];
        int delete_elm=3;
//        for (int i=0;i < myArr.length;i++){
//            if (myArr[i] == delete_elm){
//                for (int j=0;j<i ;j++){
//                    newArr[j]=myArr[j];
//                }
//                for (int j=i;j<myArr.length-1;j++){
//                    newArr[j]=myArr[j+1];
//                }
//            }
//        }
         myArr= removeElmInArr(myArr,delete_elm);
        System.out.println(Arrays.toString(myArr));
    }
    public static int[] removeElmInArr(int[] arr,int removeElm){
        int[] newArr= new int[arr.length-1];

        for (int i=0;i < arr.length;i++){
            if (arr[i] == removeElm){
                for (int j=0;j<i ;j++){
                    newArr[j]=arr[j];
                }
                for (int j=i;j<arr.length-1;j++){
                    newArr[j]=arr[j+1];
                }
            }
        }

        return newArr;
    }
}
