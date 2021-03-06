package top.jacktgq.tank.view;

import javax.swing.*;

/**
 * @Author CandyWall
 * @Date 2021/1/23--18:25
 * @Description
 */
public class TankFrame extends JFrame {
    private static final int GAME_WIDTH = 1000;
    private static final int GAME_HEIGHT = 800;

    public TankFrame() {
        setTitle("糖果坦克大战");
        setSize(GAME_WIDTH, GAME_HEIGHT);
        getContentPane().add(new TankPanel());
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /*private Image offScreenImage = null;
    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(GAME_WIDTH, GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage, 0, 0, this);
    }*/
}
