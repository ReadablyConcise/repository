import java.awt.Graphics;

public class Circle extends Shape2D {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, radius * 2, radius * 2);
    }
}
