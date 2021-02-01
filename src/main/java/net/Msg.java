package net;

/**
 * @Author CandyWall
 * @Date 2021/2/1--20:30
 * @Description 消息类
 */
public abstract class Msg {
    public abstract void handle();

    public abstract byte[] toBytes();
}
