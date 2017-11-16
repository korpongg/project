package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Login extends JPanel {
	private Frame f;

	String ss1,ss2,ss3,ss4;
	 ArrayList<String> arr=new  ArrayList<String>();
	 ArrayList<String> arr2=new  ArrayList<String>();
	 int cc=0;
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
				ss3=t1.getText();
				ss4=t2.getText();
				System.out.println("ss3=="+ss3);
				System.out.println("ss4=="+ss4);
			
				String fileName = "filename.txt";
			  
			    try {
			    	 File file = new File(fileName);

			    	
			    	 String line = null;

			       Scanner scan = 
			            new Scanner(file);

			    
			       line =scan.nextLine();
		        	 System.out.println(line);

			        while(scan.hasNext() ) {
			        
			        	 line =scan.nextLine();
			        	System.out.println("cc===="+cc);
			        	System.out.println("line===="+line);
			        	if(cc==0)
			        	{
			        		System.out.println("aaa++"+line);
			        		 arr.add(line);
			        		
			        	} 
			        	if(cc==2)
			        {
			        	
			        		System.out.println("bbbb++"+line);
			        		arr2.add(line);
			        		cc=-2;
			       	}
			        	 cc++;	
			            
			        }   
			        scan.close();

			       // bufferedReader.close();         
			    
			  
			    for(int i=0;i<arr.size();i++)
			    {
			    	System.out.println(arr.get(i)+"+++++++++++++++"+arr2.get(i));
			    
			    }
			    
			    for(int i=0;i<arr.size();i++)
			    {
			    	System.out.println(arr.get(i)+"------------ "+arr2.get(i));
			    	if((ss3.equals(arr.get(i)))&&(ss4.equals(arr2.get(i))))
			    	{
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
			    	else
			    	{
			    		System.out.println("not found");
			    	}
			    }
				
				
			}
			    catch(Exception e)
			    {
			    	System.out.println(e.getMessage());
			    }
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
		
		JButton b3=new JButton();
		b3.setText("Register");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame f2=new JFrame();
				f2.setSize(500, 500);
				f2.setTitle("Register");
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f2.setVisible(true);
				f2.setLocationRelativeTo(null);
				JButton bn1=new JButton("Submit");
				JButton bn2=new JButton("Cancel");
				JLabel l5=new JLabel("Username");
				JLabel l6=new JLabel("Password");
				JTextField t4=new JTextField(20);
				JTextField t5=new JTextField(20);
				JPanel jp4=new JPanel ();
				JPanel jp6=new JPanel ();
				JPanel jp5=new JPanel ();
				JPanel jp7=new JPanel ();
				jp4.setLayout(new FlowLayout());
				jp6.setLayout(new FlowLayout());
				jp5.setLayout(new FlowLayout());
				jp7.setLayout(new GridLayout(2,1));
				jp4.add(l5);
				jp4.add(t4);
				jp6.add(l6);
				jp6.add(t5);
				jp7.add(jp4);
				jp7.add(jp6);
				jp5.add(bn1);
				f2.add(jp7,BorderLayout.NORTH);
				f2.add(jp5,BorderLayout.SOUTH);
				f2.pack();
				//JLabel l7=new JLabel("Username");
				//JLabel l8=new JLabel("Username");
			//	JLabel l9=new JLabel("Username");
				bn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						ss1=t4.getText();
						
						 ss2=t5.getText();
						  
						  System.out.println(ss1+" "+ss2);	
						  appendTextFile("\n"+ss1);
						  appendTextFile("\n"+ss2);
						  f2.dispose();
					}
				});
				bn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						f2.dispose();
					}
				});
			}
		});
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.setLayout(new FlowLayout());
		add(p1);
		add(p2);
		add(p3);
			
	}
	
	
	public void appendTextFile(String text) {     
		File file = new File("filename.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	  
		try {
			BufferedWriter buf = new BufferedWriter(new FileWriter(file, true)); 
			buf.append(text);
			buf.newLine();
			buf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
  
	
}
