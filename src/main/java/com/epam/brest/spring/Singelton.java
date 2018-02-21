package com.epam.brest.spring;

public class Singelton {
    private static Singelton instance = new Singelton();

    private Singelton(){

    }

    public static Singelton getInstance(){
        return instance;
    }

    @Override
    public String toString(){
        return "I'm Sinleton";
    }
}
