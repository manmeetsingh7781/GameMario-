package MarioGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.awt.image.BufferedImage;

public class Game extends JPanel implements  ActionListener, variables, player {

    private BufferedImage player_image = null;
    int playerX, playerY;
    private int drawerY = 0;
    private Timer timer;
    private Grid grid;


    Game(){
        grid = new Grid(10, 30);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(60, this);
        timer.start();
    }


    public  void paint(Graphics g) {
        playerX += 10;
        playerY += 10;

        g.setColor(Color.cyan);
        g.fillRect(0,0, screen_width, screen_height);
        // each row like 10 in height
        for(int r = 1; r < grid.map.length; r++)
        {

            // like 30 in width with the offset of 1
            // means X will go 30 times and Y 10 times with the offset of 1

            for(int c = 1; c < grid.map[1].length;c++)
            {
                grid.map[r][c] = c;
               g.setColor(Color.BLUE);
               g.drawRect(c * grid.map[r][c] , r + 10 * (grid.map.length), 20, 20);
            }

        }














        addKey(this, KeyEvent.VK_SPACE, false, "Space", (event) -> {
            jump();
        });

        addKey(this, KeyEvent.VK_LEFT, false, "Left", (event) -> {
            moveLeft();
        });


        addKey(this, KeyEvent.VK_RIGHT, false, "Right", (event) -> {
            moveRight();
        });


        g.dispose();

    }


    @Override
    public void moveLeft() {
        System.out.println("Moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving Right...");
    }

    @Override
    public void jump() {
        System.out.println("Player Jumped...");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
                timer.start();
                repaint();
    }














    private static void addKey(JPanel panel, int keyCode, boolean keyReleased, String id, ActionListener action){
        InputMap in = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap ac = panel.getActionMap();

        in.put(KeyStroke.getKeyStroke(keyCode, 0, keyReleased), id);
        ac.put(id, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.actionPerformed(e);
            }
        });
    }


}
