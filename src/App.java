import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setSize(boardWidth, boardHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);

        frame.add(snakeGame);
        frame.pack(); // khong tinh thanh tieu de trong size frame
        snakeGame.requestFocus();
    }
}
