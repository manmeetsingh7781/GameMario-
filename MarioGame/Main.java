package MarioGame;

import javax.swing.*;

public class Main  extends JFrame implements variables{

    private static JFrame frame = new JFrame();
    private static Game game = new Game();
    public static void main(String[] args) {

        frame.setTitle("Mario");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(screen_width, screen_height);
        frame.setVisible(true);
        frame.add(game);
    }
}
