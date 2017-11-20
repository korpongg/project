package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;



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
		
		setLayout(new BorderLayout());
		JPanel pn1=new JPanel();
		JPanel pn2=new JPanel();
		pn2.setLayout(new GridLayout(3,1));
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JLabel l1=new JLabel(" Username : ");
		JLabel l6=new JLabel(" Password : ");
		JTextField t1=new JTextField(20);
		
		
		JLabel label = new JLabel("click here to create a new account");
		label.setFont(new Font("", Font.PLAIN,15)); 
		label.setForeground(Color.WHITE);
		pn1.setLayout(new FlowLayout());
		pn1.add(label);
        label.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent evt)
            {
            
            	JFrame f2=new JFrame();
				f.dispose();
				f2.setSize(500, 500);
				f2.setTitle("Register");
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f2.setVisible(true);
				f2.setLocationRelativeTo(null);
				JButton bn1=new JButton("Submit");
				JButton bn2=new JButton("Cancel");
				JLabel l5=new JLabel(" Username :               ");
				JLabel l10=new JLabel(" First Name :               ");
				JLabel l11=new JLabel(" Last Name :               ");
				JLabel l6=new JLabel(" Password :                ");
				JLabel l7=new JLabel(" Confirn Password :     ");
				JLabel l8=new JLabel("   Email :                       ");
			
				
				
				
				JLabel l9=new JLabel(" Gender :                    ");
				
				
				
				l5.setFont(new Font("", Font.PLAIN,15)); 
				l5.setForeground(Color.WHITE);
				l8.setFont(new Font("", Font.PLAIN,15)); 
				l8.setForeground(Color.WHITE);
				l9.setFont(new Font("", Font.PLAIN,15)); 
				l9.setForeground(Color.WHITE);
				l10.setFont(new Font("", Font.PLAIN,15)); 
				l10.setForeground(Color.WHITE);
				l11.setFont(new Font("", Font.PLAIN,15)); 
				l11.setForeground(Color.WHITE);
				l7.setFont(new Font("", Font.PLAIN,15)); 
				l7.setForeground(Color.WHITE);
				l6.setFont(new Font("", Font.PLAIN,15)); 
				l6.setForeground(Color.WHITE);

				
				
				
				
				Border lineBorder = new LineBorder(new Color(219,12,91), 10);
				
			    Font font = new Font("Serif", Font.ITALIC, 40);
			    TitledBorder titledBorder = new TitledBorder(lineBorder, "Register", TitledBorder.LEFT,
			        TitledBorder.BELOW_BOTTOM, font, Color.BLACK);

			    // Or: DEFAULT_POSITION, ABOVE_TOP, TOP, ABOVE_BOTTOM, BOTTOM, BELOW_BOTTOM
			    titledBorder.setTitlePosition(TitledBorder.BELOW_TOP);
			    JLabel aLabel = new JLabel();
			   aLabel.setBorder(titledBorder);
			   aLabel.setBackground(new Color(219,12,91));
				
				f2.add(aLabel, BorderLayout.NORTH);
				JTextField t4=new JTextField(20);
				JTextField t5=new JTextField(20);
				JTextField t6=new JTextField(20);
				JTextField t7=new JTextField(20);
				JTextField t8=new JTextField(20);
				JTextField t9=new JTextField(20);
			
				JPanel jp4=new JPanel ();
				JPanel jp6=new JPanel ();
				JPanel jp5=new JPanel ();
				JPanel jp7=new JPanel ();
				JPanel jp8=new JPanel ();
				JPanel jp9=new JPanel ();
				JPanel jp10=new JPanel ();
				JPanel jp11=new JPanel ();
				JPanel jp12=new JPanel ();
				
				
				
				jp4.setLayout(new FlowLayout());
				jp6.setLayout(new FlowLayout());
				jp5.setLayout(new FlowLayout());
				jp7.setLayout(new GridLayout(7,1));
				jp4.add(l5);
				jp4.add(t4);
				
				JRadioButton rb1 = new JRadioButton();
				 JRadioButton rb2 = new JRadioButton();
			    rb1.setText("male");
			    rb1.setActionCommand(null);
			    rb1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						rb2.setSelected(false);
					}
				});
			    
			  //  rb1.setSelected(true);
			    
			   
			    rb2.setText("female");
			    rb2.setActionCommand(null);
			    rb2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						rb1.setSelected(false);
					}
				});

			    rb2.setFont(new Font("", Font.PLAIN,15)); 
			    rb2.setForeground(Color.WHITE);
			    rb1.setFont(new Font("", Font.PLAIN,15)); 
			    rb1.setForeground(Color.WHITE);
			  //  rb2.setSelected(true);
			    
			    rb1.setBackground(new Color(44,62,80));
			    rb2.setBackground(new Color(44,62,80));
			    
			    
				jp9.add(l11);
				jp9.add(t9);
				jp10.add(l7);
				jp10.add(t7);
				jp8.add(l10);
				jp8.add(t8);
				jp6.add(l6);
				jp6.add(t5);
				
				jp11.add(l8);
				jp11.add(t6);
				
				jp12.add(l9);
				jp12.add(rb1);
				jp12.add(rb2);
				
				
				jp7.add(jp4);
			
				jp7.add(jp8);
				jp7.add(jp9);
				jp7.add(jp6);
				jp7.add(jp10);
				jp7.add(jp11);
				jp7.add(jp12);
			
				jp5.add(bn1,BorderLayout.EAST);
				jp4.setBackground(new Color(44,62,80));
				//jp5.setBackground(new Color(44,62,80));
				jp6.setBackground(new Color(44,62,80));
				jp7.setBackground(new Color(44,62,80));
				jp5.setBackground(new Color(44,62,80));
				jp8.setBackground(new Color(44,62,80));
				jp9.setBackground(new Color(44,62,80));
				jp10.setBackground(new Color(44,62,80));
				jp11.setBackground(new Color(44,62,80));
				jp12.setBackground(new Color(44,62,80));
				f2.setBackground(new Color(44,62,80));
				f2.add(jp7,BorderLayout.CENTER);
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
						  new Frame();
						
					}
				});
				bn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						new Login(f);
					}
				});
			}
            
        });
		
	
		Border lineBorder = new LineBorder(Color.white, 10);
		
	    Font font = new Font("Serif", Font.ITALIC, 40);
	    TitledBorder titledBorder = new TitledBorder(lineBorder, "Login", TitledBorder.LEFT,
	        TitledBorder.BELOW_BOTTOM, font, Color.white);

	    // Or: DEFAULT_POSITION, ABOVE_TOP, TOP, ABOVE_BOTTOM, BOTTOM, BELOW_BOTTOM
	    titledBorder.setTitlePosition(TitledBorder.BELOW_TOP);
	    JLabel aLabel = new JLabel();
	   aLabel.setBorder(titledBorder);
	   aLabel.setBackground(Color.darkGray);
	   
	 //  aLabel.setHorizontalAlignment(JLabel.CENTER);
		p1.add(l1);
		p1.add(t1);
		setBackground(Color.ORANGE);
		// aLabel.setBorder(titledBorder);
		    //aLabel.setHorizontalAlignment(JLabel.CENTER);
		add(aLabel,BorderLayout.NORTH);
		aLabel.setBackground(Color.ORANGE);
		JLabel l2=new JLabel(" Password :  ");
		l1.setFont(new Font("", Font.PLAIN,15)); 
		l1.setForeground(Color.WHITE);
		l2.setFont(new Font("Password", Font.PLAIN,15)); 
		l2.setForeground(Color.WHITE);
		JTextField t2=new JTextField(20);
		p2.add(l2);
		p2.add(t2);
		
		JButton b1=new JButton();
		b1.setText("login");
		b1.setBackground(new Color(25,181,255));
		
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
		b2.setBackground(new Color(242,38,19));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				f.dispose();
			}
		});
		
		/*JButton b3=new JButton();
		b3.setText("Register");
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFrame f2=new JFrame();
				f.dispose();
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
		});*/
		p3.add(b1);
		p3.add(b2);
		//p3.add(b3);
		p3.setLayout(new FlowLayout());
		p1.setBackground(new Color(44,62,80));
		p2.setBackground(new Color(44,62,80));
		p3.setBackground(new Color(44,62,80));
		pn2.add(p1);
		pn2.add(p2);
		pn2.add(p3);
		add(pn2,BorderLayout.CENTER);
		add(pn1,BorderLayout.SOUTH);
		pn1.setBackground(new Color(44,62,80));
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
