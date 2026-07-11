package com.Singleton;

public class EagerInitalisationSingleton {

    private static final EagerInitalisationSingleton instance = new EagerInitalisationSingleton();


    private EagerInitalisationSingleton(){

    }

    public static EagerInitalisationSingleton getInstace(){
        System.out.println("Eager init la classe");
        return instance;
    }

}
