import java.awt.*;

public class Bullet {
    int x,y ,diameter = 10;
    int speed, dx,dy;

    public Bullet(Player player){
        x= player.getX()+player.getWIDTH();
        y=player.getY()-diameter;
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,diameter,diameter);
    }
}
