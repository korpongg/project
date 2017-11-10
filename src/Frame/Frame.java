package Frame;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame()
	{
		Login l =new Login(this);
		add(l);
		//f.setSize(500, 500);
		setTitle("Sign In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
		
	}
	public static void main(String[] args) {
		new Frame();
	}
}
