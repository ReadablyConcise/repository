import java.awt.Graphics;

public class Square extends Shape2D {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, sideLength, sideLength);
    }
}

