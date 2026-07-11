package com.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerInitalisationSingleton.getInstace();
        StaticBlockInitialization.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();


        for(int i = 0; i <5; i++){
             ThreadSafeSingleton.getInstance();
        }
     
    }

}
