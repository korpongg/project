package Frame;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JPanel {
	private Frame f;


	 
	public Login(Frame f)
	{
		this.f=f;
		
		//JPanel p=new JPanel();
		setLayout(new GridLayout(3,1));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JLabel l1=new JLabel("Username");
		JTextField t1=new JTextField(20);
		
		p1.add(l1);
		p1.add(t1);
		
		JLabel l2=new JLabel("Passworde");
		JTextField t2=new JTextField(20);
		p2.add(l2);
		p2.add(t2);
		
		JButton b1=new JButton();
		b1.setText("login");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.dispose();
				
				JFrame f2=new JFrame();
				Select s=new Select(f2);
				f2.dispose();
				f2.add(s);
				f2.setSize(500, 500);
				f2.setTitle("Sign In");
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f2.setVisible(true);
				f2.setLocationRelativeTo(null);
				//f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				//f2.pack();
				
			}
		});
		JButton b2=new JButton();
		b2.setText("cancel");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.dispose();
			}
		});
		p3.add(b1);
		p3.add(b2);
		p3.setLayout(new FlowLayout());
		add(p1);
		add(p2);
		add(p3);
			
	}
	
	
  
  
	
}
