import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShapeSelector extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> shapeList;
    private JTextField input1, input2;
    private JButton drawButton;

    public ShapeSelector() {
        setTitle("Shape Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 200);

        JLabel shapeLabel = new JLabel("Select Shape:");
        shapeLabel.setBounds(10, 10, 100, 25);
        add(shapeLabel);

        shapeList = new JComboBox<>(new String[]{"Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone", "Cylinder", "Torus"});
        shapeList.setBounds(100, 10, 150, 25);
        add(shapeList);

        JLabel input1Label = new JLabel("Input 1:");
        input1Label.setBounds(10, 50, 100, 25);
        add(input1Label);

        input1 = new JTextField();
        input1.setBounds(100, 50, 150, 25);
        add(input1);

        JLabel input2Label = new JLabel("Input 2:");
        input2Label.setBounds(10, 90, 100, 25);
        add(input2Label);

        input2 = new JTextField();
        input2.setBounds(100, 90, 150, 25);
        add(input2);

        drawButton = new JButton("Draw");
        drawButton.setBounds(100, 130, 100, 25);
        drawButton.addActionListener(this);
        add(drawButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            String selectedShape = (String) shapeList.getSelectedItem();
            int value1 = Integer.parseInt(input1.getText());
            int value2 = Integer.parseInt(input2.getText());

            Shape shape = createShape(selectedShape, value1, value2);
            if (shape != null) {
                ShapeRenderer renderer = new ShapeRenderer(shape, selectedShape);
                renderer.setVisible(true);
            }
        }
    }

    private Shape createShape(String shapeName, int value1, int value2) {
        switch (shapeName) {
            case "Circle":
                return new Circle(value1);
            case "Square":
                return new Square(value1);
            case "Triangle":
                return new Triangle(value1, value2);
            case "Rectangle":
                return new Rectangle(value1, value2);
            case "Sphere":
                return new Sphere(value1, "sphere.jpg");
            case "Cube":
                return new Cube(value1, "cube.jpg");
            case "Cone":
                return new Cone(value1, value2, "cone.jpg");
            case "Cylinder":
                return new Cylinder(value1, value2, "cylinder.jpg");
            case "Torus":
                return new Torus(value1, value2, "torus.jpg");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        ShapeSelector selector = new ShapeSelector();
        selector.setVisible(true);
    }
}


