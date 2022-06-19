package com.example.database.training;

public class main {
    public static void main(String[] args) {
        MultiThreadThing myThing  = new MultiThreadThing();
        MultiThreadThing myThing2  = new MultiThreadThing();
        myThing2.start();
        myThing.run();
    }
}
