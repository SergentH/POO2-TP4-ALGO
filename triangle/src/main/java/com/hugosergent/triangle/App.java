package com.hugosergent.triangle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class App 
{
    public static void main( String[] args )
    {
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    	
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
