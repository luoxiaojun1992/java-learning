package demo1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing {
	JFrame frame;
	
	public Swing() {
		frame = new JFrame("测试JFrame容器");
		Container cp = frame.getContentPane();
		cp.add(new JButton("测试JFrame"));
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing();
	}
}
