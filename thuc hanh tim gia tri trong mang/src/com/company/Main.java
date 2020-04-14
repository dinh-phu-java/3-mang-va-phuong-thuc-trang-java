package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập vào tên sinh viên cần tìm kiếm: ");
        String name=in.nextLine();
        boolean check_name=false;
        int pos=0;
        for (int i=0;i<students.length;i++){
            if(students[i].equals(name) ){
                check_name=true;
                pos=i;
                break;
            }
        }
        if (check_name){
            System.out.printf("Vị trí của %s trong mảng students là %d",name,pos);
        }else{
            System.out.println("không tìm thấy");
        }
    }
}
