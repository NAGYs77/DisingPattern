package com.Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
            System.out.println("Thread Safe nouvelle instance");
            return instance;

        }
       System.out.println("Returning Thread safe  Instance");
        return instance;
    }


    
}
