package com.example.helloworld;

import java.util.Scanner;

public class Test {
    public void passwordTest(){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        while(!str.equals("abc")){
            System.out.println("password is wrong");
            str = in.nextLine();
        }
        System.out.println("great!!");
    }
    public void calc_double(){
        System.out.println("2の16乗まで計算します!!!!!");
        int num = 1;

        for(int i = 1 ;i <= 16; i++){
            num *= 2;
            System.out.println("2の" + i + "乗は" + num + "です！");
        }
    }

    public void while_test(){
        int num = 1;
        int cnt = 0;
        while(1000000000 > num){
            System.out.println(cnt + "回目"+ num +"：まだループは終わりません!?!!?");
            num *= 2;
            cnt++;
        }
    }
}
