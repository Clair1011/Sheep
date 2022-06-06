import java.awt.*;

public class Sheep {
    private int x;
    private int y;

    public Sheep(int x, int y) {
        // set the sheep position
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + "," + this.y;
    }

    public void drawSheepp(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x+23, y+50, 225, 100);
        g.fillOval(x,y, 75, 75);
        g.fillOval(x+50, y+100, 25, 100);
        g.fillOval(x+100, y+100, 25, 100);
        g.fillOval(x+150, y+100, 25, 100);
        g.fillOval(x+200, y+100, 25, 100);
    }

    public void walk(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
