import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ShapeRenderer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Shape shape;
	private final int WIDTH = 500;
	private final int HEIGHT = 500;

	public ShapeRenderer(Shape shape, String title) {
		this.shape = shape;

		setTitle(title + " Renderer");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setSize(WIDTH, HEIGHT);

		ShapePanel panel = new ShapePanel();
		panel.setBounds(0, 0, WIDTH, HEIGHT);
		add(panel);
	}

	private class ShapePanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			shape.draw(g);

			if (shape instanceof Shape3D) {
				Shape3D shape3d = (Shape3D) shape;
				Image image = null;
				try {
					image = ImageIO.read(new File(shape3d.getImagePath()));
					g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(WIDTH, HEIGHT);
		}
	}
}
