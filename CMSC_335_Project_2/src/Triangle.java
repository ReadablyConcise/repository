import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape2D {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        Polygon triangle = new Polygon();
        triangle.addPoint(0, height);
        triangle.addPoint(base / 2, 0);
        triangle.addPoint(base, height);
        g.drawPolygon(triangle);
    }
}

