import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Board extends JPanel {
    Player player;
    Enemy enemy = new Enemy();

    int num = enemy.getNumEnemies();
    Enemy [][] enemies = new Enemy[num][10];
    Bullet bullet;
    public Board(){
        setPreferredSize(new Dimension(1024,700));
        setBackground(Color.BLACK);
        //timer = new Timer()

    }


    public  void setup(){
        player = new Player(this);
        for(int row=0; row<num;row++){
            for(int col = 0; col<10;col++){
                enemies[row][col]= new Enemy(getWidth()/4+(col*50), row*50);
            }
        }
        bullet = new Bullet(player);
    }

    public  void checkCollisions(){

    }
public void actionPerformed(ActionEvent e){
        player.moveRight();
        repaint();
}

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        player.paint(g);
        for(int row=0; row<num;row++){
            for(int col = 0; col<10;col++){
                enemies[row][col].paint(g);
            }
        }
        bullet.paint(g);
    }
}
