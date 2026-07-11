package com.Singleton;

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization(){

    }
    static{
        try{
            instance = new StaticBlockInitialization();

        } catch(Exception e){
            e.printStackTrace();

        }
    }

    public static StaticBlockInitialization getInstance(){
        System.out.println("Static block init de la classe");
        return instance;
    }
}
