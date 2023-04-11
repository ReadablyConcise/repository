import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Shape3D implements Shape {
    private String imagePath;

    public Shape3D(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void draw(Graphics g) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
        Image image = imageIcon.getImage();
        g.drawImage(image, 0, 0, null);
    }
}

