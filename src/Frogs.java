import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Frogs {

	public static final String NEXT_PNG = "next.png";
	public static final String PREVIOUS_PNG = "previous.png";
	public static final String PROJECT_DIRECTORY = "user.dir";
	JFileChooser fileChooser;
	JButton middleButton;
	JButton cardButton;
	JButton choose;

	private static final List<String> FILE_NAMES = Arrays.asList(
			"frog1.jpg",
			"frog2.jpg",
			"frog3.jpg",
			"frog4.jpg",
			"frog5.jpg",
			"frog6.jpg",
			"frog7.jpg",
			"frog8.jpg",
			"frog9.jpg",
			"frog10.jpg",
			"frog11.jpg",
			"frog12.jpg",
			"frog13.jpg",
			"frog14.jpg"
	);

	public Frogs() {
		List<JButton> buttons = new ArrayList<>();

		JFrame frame = new JFrame("Frogs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 475);

		JPanel panel = new JPanel(new GridLayout(2, 7, 1, 1));

		for (String fileName : FILE_NAMES) {
			JButton button = new JButton();
			button.setSize(200, 200);
			button.setIcon(new ImageIcon(fileName));
			button.addActionListener(ae -> {
				((JButton)ae.getSource()).setEnabled(false);
			});
			buttons.add(button);
			panel.add(button);
		}

		frame.add(panel);

		JButton reset = new JButton("Reset");
		reset.addActionListener(ae -> {
			for (JButton button : buttons) {
				button.setEnabled(true);
			}
		});
		frame.add(reset, BorderLayout.SOUTH);

		frame.setVisible(true);
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(Frogs::new);
	}
}
