import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {

	public static void main(String[] args) {

		Image image = null;  
		try {
		    File pathToFile = new File("triangle.png");
		    image = ImageIO.read(pathToFile);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		JFrame fen = new JFrame("Programme triangle");
		
		JPanel pan = new ImagePane(image);
		pan.setBackground(Color.BLUE);
		pan.setPreferredSize(new Dimension(924,676));
		fen.setContentPane(pan);
		fen.pack();
		fen.setResizable(false);
		fen.setLocationRelativeTo(null);
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fen.setVisible(true);

	}

}
