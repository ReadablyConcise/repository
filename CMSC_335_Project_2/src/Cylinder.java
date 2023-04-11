import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Cylinder extends Shape3D {
    private int radius;
    private int height;

    public Cylinder(int radius, int height, String imagePath) {
        super(imagePath);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(getImagePath()));
        Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, null);
    }
}