package com.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        // Test avec un utilisateur NON-admin (mot de passe incorrect)
        CommandExecutor cmdLine = new CommandExecutorProxy("Arc&stone", "mots de passe incorrecte");
        
        try {
            // Correction de la syntaxe (retrait de cmd:)
            cmdLine.executeCommand("ls -a"); 
            cmdLine.executeCommand("rm des ficher"); // Va bloquer ici et aller dans le catch

        } catch (Exception e) {
            System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
}