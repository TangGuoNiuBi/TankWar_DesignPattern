package top.jacktgq.tank.entity;

import top.jacktgq.tank.view.TankPanel;

import java.util.Random;

/**
 * @Author CandyWall
 * @Date 2021/1/23--21:16
 * @Description 敌方坦克
 */
public class EnemyTank extends Tank {
    private Random random = new Random();

    public EnemyTank(int x, int y, Dir dir, int speed, TankPanel tankPanel) {
        super(x, y, dir, speed, tankPanel, Group.ENEMY);
    }

    /**
     * 敌方坦克移动的过程中会随机变向和开火
     */
    @Override
    protected void move() {
        super.move();
        // %5的机会改变方向
        if (random.nextInt(100) > 95) {
            dir = Dir.values()[random.nextInt(4)];
        }
        // %5的机会开火
        if (random.nextInt(100) > 95) {
            fire();
        }
    }
}
