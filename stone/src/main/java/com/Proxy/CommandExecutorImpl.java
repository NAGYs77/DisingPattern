
package com.Proxy;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void executeCommand(String cmd) throws Exception {
        // Ajout d'un espace après "Command " et avant " a été..."
        System.out.println("Command " + cmd + " a été exécutée avec succès");
    }
}