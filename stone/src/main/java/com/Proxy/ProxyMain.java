package com.Proxy;

public class ProxyMain {
    public static void main(String[] args) {

        CommandExecutor cmdLine = new CommandExecutorProxy("Arc&stone", "mots de passe incorrecte");
        
        try {
            
            cmdLine.executeCommand("ls -a"); 
            cmdLine.executeCommand("rm des ficher"); 

        } catch (Exception e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}