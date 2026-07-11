package com.Singleton;

public class LazyInitializationSingleton {
    private static  LayerInstantiationException instance;

    private LazyInitializationSingleton(){

    }
    public static LayerInstantiationException getInstance(){
        if(instance == null){
            System.out.println("Creation de la nouvelle  Instance de la classe");
            instance = new LayerInstantiationException();
            return instance;

        }
        System.out.println("L'instace existe déja ");
        return instance;
    }

}
