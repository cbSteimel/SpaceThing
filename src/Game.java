import javax.swing.*;

public class Game extends JFrame {

    Board board;


    public Game(){

        setTitle("SpaceThing");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board = new Board();


        add(board);
        pack();
        board.setup();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new Game();
    }
}
