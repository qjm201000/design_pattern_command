package com.pattern;

/**
 * 调用者
 */
public class Invoker {
    public Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void executeAction(){
        command.execute();
    }
    //撤销命令
    public void undoAction(){
        command.undo();
    }
}
