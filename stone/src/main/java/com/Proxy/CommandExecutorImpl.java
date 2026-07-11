
package com.Proxy;

public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void executeCommand(String cmd) throws Exception {
        System.out.println("Command " + cmd + " a été exécutée avec succès");
    }
}