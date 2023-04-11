import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Cube extends Shape3D {
    private int sideLength;

    public Cube(int sideLength, String imagePath) {
        super(imagePath);
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
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(getImagePath()));
        Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, null);
    }
}

