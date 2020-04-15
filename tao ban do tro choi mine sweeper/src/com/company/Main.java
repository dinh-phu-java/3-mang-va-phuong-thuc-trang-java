package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] map = {
                {"*",".",".",".","*",".","*","*"},
                {".","*",".","*",".",".",".","*"},
                {".",".","*",".","*",".","*","."},
                {".","*",".","*",".",".","*","*"}
        };
        final int WIDTH=map[0].length;
        final int HEIGHT=map.length;

        String[][] map_result=new String[HEIGHT][WIDTH];
        for (int i=0;i<HEIGHT;i++){
            for (int j=0 ; j<WIDTH;j++){
                if(map[i][j].equals(".")){
                    int count=0;
                    if(i==0){
                        if(map[i+1][j].equals("*")){
                            count++;
                        }
                    }else if(i==HEIGHT-1) {
                        if (map[i - 1][j].equals("*")) {
                            count++;
                        }
                    }else{
                        if(map[i+1][j].equals("*")){
                            count++;
                        }
                        if(map[i-1][j].equals("*")){
                            count++;
                        }
                    }
                    //đầu mảng
                    if(j==0){
                        if(map[i][j+1].equals("*")){
                            count=1;

                        }
                    }else if(j==WIDTH-1){
                        if (map[i][j-1].equals("*")){
                            count=1;
                           
                        }
                    }else{

                        if(map[i][j-1].equals("*")){
                            count++;
                        }

                        if(map[i][j+1].equals("*")){
                            count++;
                        }
                    }
                    map_result[i][j]=String.valueOf(count);
                }else{
                    map_result[i][j]="*";
                }
            }

        }

        for (int i=0;i<HEIGHT;i++){
            System.out.print("[");
            for (int j=0;j<WIDTH;j++){
                System.out.print(map_result[i][j]);
                if (j<WIDTH-1){
                    System.out.print(" , ");
                }

            }
            System.out.print("]");
            System.out.println();
        }
    }
}
