package com.example.helloworld;

public class Enemy {
    String name;
    int hp;
    int mp;
    int atk;
    int def;
    int spd;
    int status;

    Enemy(String name,int hp,int mp,int atk,int def,int spd,int status){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.status = 0;
    }
}
