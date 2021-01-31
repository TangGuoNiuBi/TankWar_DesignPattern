package top.jacktgq.tank.entity.abstractEntity;

import top.jacktgq.tank.entity.GameObject;
import top.jacktgq.tank.entity.GameObjectType;
import top.jacktgq.tank.entity.Group;

import java.awt.*;

/**
 * @Author CandyWall
 * @Date 2021/1/29--8:13
 * @Description 墙
 */
public abstract class BaseWall extends GameObject {
    protected int width, height;
    protected Rectangle rect;
    protected GameObjectType gameObjectType = GameObjectType.WALL;

    public BaseWall(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        rect = new Rectangle(x, y, width, height);
    }

    public abstract void paint(Graphics g);

    @Override
    public Rectangle getRect() {
        return rect;
    }

    @Override
    public GameObjectType getGameObjectType() {
        return gameObjectType;
    }

    // 碰撞后回到上一次的位置
    @Override
    public void back() {}

    @Override
    public Group getGroup() {
        return null;
    }
}
