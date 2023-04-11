import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Sphere extends Shape3D {
    private int radius;

    public Sphere(int radius, String imagePath) {
        super(imagePath);
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
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(getImagePath()));
        Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, null);
    }
}
