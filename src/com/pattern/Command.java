package com.pattern;

/**
 * 命令接口
 */
public interface Command {
    void execute();//执行
    void undo();//撤回
}
