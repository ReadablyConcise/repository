import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Torus extends Shape3D {
    private int majorRadius;
    private int minorRadius;

    public Torus(int majorRadius, int minorRadius, String imagePath) {
        super(imagePath);
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public int getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(int majorRadius) {
        this.majorRadius = majorRadius;
    }

    public int getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(int minorRadius) {
        this.minorRadius = minorRadius;
    }

    @Override
    public void draw(Graphics g) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(getImagePath()));
        Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, null);
    }
}