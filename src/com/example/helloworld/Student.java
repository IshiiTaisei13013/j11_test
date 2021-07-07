package com.example.helloworld;

public class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;

    Student(String newName,int newScore){
        name = newName;
        score = newScore;
    }

    Student(String newName){
        this(newName,0);
    }

    void setScore(int newScore){
        score = newScore;
    }
    void printScore(){
        System.out.println(name + ":" + score);
    }

    int getScore(){
        return score;
    }
}
