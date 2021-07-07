package com.example.helloworld;

public class Hero {
    String name;
    int hp;
    int mp;
    int atk;
    int def;
    int spd;
    int status;

    //コンストラクタ
    Hero(String name,int hp,int mp,int atk,int def,int spd,int status){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.status = 0;
    }

    public void printStatus(){
        System.out.println("勇者" + name + "|HP :" + hp + "|MP :" + mp+ "|ATK :" + atk+ "|DEF :" + def+ "|spd :" + spd + "|");
    }
}
