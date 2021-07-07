package com.example.helloworld;

import java.time.LocalDateTime;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        //Test pass = new Test();
        //pass.while_test();

        //Student aa = new Student("aa",10);
        //aa.printScore();

        Student okada = new Student("okada");
        okada.printScore();

        final int STATUS_NOTHING = 0;
        final int STATUS_VENOM = 1;
        final int STATUS_STAN = 2;
        final int STATUS_DEATH = 3;

        Hero suga = new Hero("Suga",9999,9999,999,999,999,STATUS_NOTHING);
        suga.printStatus();


    }


}
