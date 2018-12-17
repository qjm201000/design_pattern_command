package com.pattern;

public class Main {
    public static void main(String[] args) {
        //创建命令的接收者
        Receiver receiver = new Receiver();
        //创建命令，设定接收者
        Command command = new ConcreteCommand(receiver);
        //创建执行者
        Invoker invoker = new Invoker();
        invoker.setCommand(command);//设置对应的命令

        //执行命令
        invoker.executeAction();
        invoker.undoAction();
    }
}
