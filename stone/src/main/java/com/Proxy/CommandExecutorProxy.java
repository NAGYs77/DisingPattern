package com.Proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;

    
    public CommandExecutorProxy(String login, String password){
        this.isAdmin = "Arc&stone".equals(login) && "password".equals(password);
        this.commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
        if (isAdmin) {
            commandExecutor.executeCommand(cmd);
        } else {
            if (cmd.contains("rm")) {
                throw new Exception("Tu n'as pas le droit d'exécuter cette commande !");
            } else {
                commandExecutor.executeCommand(cmd);
            }
        }
    }
}