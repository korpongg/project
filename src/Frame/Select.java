package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import Coin.Coin.Ecoin;

public class Select extends JPanel {
	private   JLabel  l1;
	private   JLabel   l2;
private JPanel p1,p2,p3,p4,p5;
	private Frame f;
private int ch1=0;
private int sel1=0,sel2=0;
JTextArea a1,a2;
 String ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8;
 double dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8;
 String ss99;
 int k=0;
 ArrayList <String> allSS=new ArrayList <String> ();
	  public Select(Frame f) {
		
		  JFileChooser chooser =new  JFileChooser();
		  chooser.showOpenDialog(null);
		  File f3=chooser.getSelectedFile();
		  ss99=f3.getAbsolutePath();
		  System.out.println(ss99);
		

		
		 this.f=f;
		  JTextField t1=new  JTextField(10);
		  JTextField t2=new  JTextField(10);
		  JTextField t3=new  JTextField(10);
		  JTextField t4=new  JTextField(10);
		  JTextField t5=new  JTextField(10);
		  JTextField t6=new  JTextField(10);
		  
		  
		  JTextField tA=new  JTextField(10);
		  JTextField tBB=new  JTextField(10);
		  JTextField tB=new  JTextField(10);
		  JTextField tCC=new  JTextField(10);
		  JTextField tC=new  JTextField(10);
		  JTextField tDD=new  JTextField(10);
		  JTextField tD=new  JTextField(10);
		  JTextField tF=new  JTextField(10);
		  
		  ArrayList <JPanel> array=new ArrayList <JPanel>();
		
		  ArrayList < JTextField> array2=new ArrayList < JTextField>();
		  ArrayList <JLabel> array3=new ArrayList <JLabel>();
		  
	    setLayout(new BorderLayout());
	     p1=new JPanel();
	     
	     p2=new JPanel();
	     p3=new JPanel();
	     p4=new JPanel();
	     p5=new JPanel();
	     
	     JPanel pp1=new JPanel();
	     JPanel pp2=new JPanel();
	     JPanel pp3=new JPanel();
	     JPanel pp4=new JPanel();
	     JPanel pp5=new JPanel();
	     JPanel pp6=new JPanel();
	     JPanel pp7=new JPanel();
	     JPanel pp8=new JPanel();
	     JPanel pp9=new JPanel();
	     JPanel pp10=new JPanel();
	     JPanel pp11=new JPanel();
	     JPanel pp12=new JPanel();
	     JPanel pp13=new JPanel();
	     JPanel pp14=new JPanel();
	     JPanel pp15=new JPanel();
	     JPanel pp16=new JPanel();
	    
	     pp1.setLayout(new FlowLayout());
	     pp2.setLayout(new FlowLayout());
	     pp3.setLayout(new FlowLayout());
	     pp4.setLayout(new FlowLayout());
	     pp5.setLayout(new FlowLayout());
	     pp6.setLayout(new FlowLayout());
	     pp7.setLayout(new FlowLayout());
	     pp8.setLayout(new FlowLayout());
	     pp9.setLayout(new FlowLayout());
	     pp10.setLayout(new FlowLayout());
	     pp11.setLayout(new FlowLayout());
	     pp12.setLayout(new FlowLayout());
	     pp13.setLayout(new FlowLayout());
	     pp14.setLayout(new FlowLayout());
	     pp15.setLayout(new FlowLayout());
	     pp16.setLayout(new FlowLayout());
	     
	     JLabel laX=new JLabel("Total Score 100");
	     JLabel laY=new JLabel("Grading");
	     
	     JLabel la1=new JLabel("Classroom ");
	     JLabel la2=new JLabel("Quiz             ");
	     JLabel la3=new JLabel("Group work");
	     JLabel la4=new JLabel("Present       ");
	     JLabel la5=new JLabel("Midterm       ");
	     JLabel la6=new JLabel("Final              ");
	     
	     JLabel la7=new JLabel("A  ");
	     JLabel la8=new JLabel("B+");
	     JLabel la9=new JLabel("B  ");
	     JLabel la10=new JLabel("C+");
	     JLabel la11=new JLabel("C  ");
	     JLabel la12=new JLabel("D+");
	     JLabel la13=new JLabel("D  ");
	     JLabel la14=new JLabel("F  ");
	     
	    l1=new JLabel("aaaa");
	    l2=new JLabel("bbbb");
	    a1=new JTextArea("aaaa");
	    a2=new JTextArea("bbbb");
	    
	    p4.setLayout(new GridLayout(7,1));
	    
	    p5.setLayout(new GridLayout(9,1));
	    
	    
	    
	    
	    String[] s1 = {"", "cs211", "cs213",  "cs223", "cs284" };
		  String[] s2 = {"", "65001", "65002" };
		  String[] s3 = { "","2017" };
		  JComboBox cb1=new JComboBox(s1);
		  JComboBox cb2=new JComboBox(s2);
		  JComboBox cb3=new JComboBox(s3);
		 cb1.setSelectedIndex(0);
		cb2.setSelectedIndex(0);
		 cb3.setSelectedIndex(0);
		 cb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				  if (cb1.getSelectedItem().toString().equals("cs211"))
	                {
					  sel1=1;
					  ch1++;
	                }
				  if (cb1.getSelectedItem().toString().equals("cs213"))
	                {
					  sel1=2;
					  ch1++;
	                }
				  if (cb1.getSelectedItem().toString().equals("cs223"))
	                {
					  sel1=3;
					  ch1++;
	                }
				  if (cb1.getSelectedItem().toString().equals("cs284"))
	                {sel1=4;
					  ch1++;
	                }
				
				  if(ch1>=3)
					 {
					  /*  pp1.add(la1);
					  pp2.add(la2);
					  pp3.add(la3);
					  pp4.add(la4);
					  pp5.add(la5);
					  pp6.add(la6);
					  pp1.add(t1);
					  pp2.add(t2);
					  pp3.add(t3);
					  pp4.add(t4);
					  pp5.add(t5);
					  pp6.add(t6);
					  pp15.add(laX);
					  
					  p4.add(pp15);
					p4.add(pp1);
					p4.add(pp2);
					p4.add(pp3);
					p4.add(pp4);
					p4.add(pp5);
					p4.add(pp6);*/
						
					  pp7.add(la7);
					  pp8.add(la8);
					  pp9.add(la9);
					  pp10.add(la10);
					  pp11.add(la11);
					  pp12.add(la12);
					  pp13.add(la13);
					  pp14.add(la14);
					pp7.add(tA);
					  pp8.add(tBB);
					  pp9.add(tB);
					  pp10.add(tCC);
					  pp11.add(tC);
					  pp12.add(tDD);
					  pp13.add(tD);
					  pp14.add(tF);
					  pp16.add(laY);
					  
					  p5.add(pp16);
					
					  p5.add(pp7);
						p5.add(pp8);
						p5.add(pp9);
						p5.add(pp10);
						p5.add(pp11);
						p5.add(pp12);
						p5.add(pp13);
						p5.add(pp14);
					  	
					  	repaint();
					  	p2.add(p4);
						  p2.add(p5);
					    add(p2,BorderLayout.CENTER);
					 revalidate();
					 }
				
			}
		});
		 cb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					  if (cb2.getSelectedItem().toString().equals("65001"))
		                {sel2=1;
						  ch1++;
		                }
					  if (cb2.getSelectedItem().toString().equals("65002"))
		                {sel2=2;
						  ch1++;	
		                }
					  System.out.println(ch1);
					  if(ch1>=3)
						 {
						/*  pp1.add(la1);
						  pp2.add(la2);
						  pp3.add(la3);
						  pp4.add(la4);
						  pp5.add(la5);
						  pp6.add(la6);
						  pp1.add(t1);
						  pp2.add(t2);
						  pp3.add(t3);
						  pp4.add(t4);
						  pp5.add(t5);
						  pp6.add(t6);
						  pp15.add(laX);
						  
						  p4.add(pp15);
						p4.add(pp1);
						p4.add(pp2);
						p4.add(pp3);
						p4.add(pp4);
						p4.add(pp5);
						p4.add(pp6);*/
							
						  pp7.add(la7);
						  pp8.add(la8);
						  pp9.add(la9);
						  pp10.add(la10);
						  pp11.add(la11);
						  pp12.add(la12);
						  pp13.add(la13);
						  pp14.add(la14);
						pp7.add(tA);
						  pp8.add(tBB);
						  pp9.add(tB);
						  pp10.add(tCC);
						  pp11.add(tC);
						  pp12.add(tDD);
						  pp13.add(tD);
						  pp14.add(tF);
						  pp16.add(laY);
						  
						  p5.add(pp16);
						
						  p5.add(pp7);
							p5.add(pp8);
							p5.add(pp9);
							p5.add(pp10);
							p5.add(pp11);
							p5.add(pp12);
							p5.add(pp13);
							p5.add(pp14);
						  	
						  	repaint();
						  	p2.add(p4);
							  p2.add(p5);
						    add(p2,BorderLayout.CENTER);
						 revalidate();
						 }  
					  
				}
			});
		 cb3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					  if (cb3.getSelectedItem().toString().equals("2017"))
		                {
						  ch1++;
		                }
					  if(ch1>=3)
						 {
						  /*  pp1.add(la1);
						  pp2.add(la2);
						  pp3.add(la3);
						  pp4.add(la4);
						  pp5.add(la5);
						  pp6.add(la6);
						  pp1.add(t1);
						  pp2.add(t2);
						  pp3.add(t3);
						  pp4.add(t4);
						  pp5.add(t5);
						  pp6.add(t6);
						  pp15.add(laX);
						  
						  p4.add(pp15);
						p4.add(pp1);
						p4.add(pp2);
						p4.add(pp3);
						p4.add(pp4);
						p4.add(pp5);
						p4.add(pp6);*/
						  pp7.add(la7);
						  pp8.add(la8);
						  pp9.add(la9);
						  pp10.add(la10);
						  pp11.add(la11);
						  pp12.add(la12);
						  pp13.add(la13);
						  pp14.add(la14);
						pp7.add(tA);
						  pp8.add(tBB);
						  pp9.add(tB);
						  pp10.add(tCC);
						  pp11.add(tC);
						  pp12.add(tDD);
						  pp13.add(tD);
						  pp14.add(tF);
						  pp16.add(laY);
						  
						  p5.add(pp16);
						
						  p5.add(pp7);
							p5.add(pp8);
							p5.add(pp9);
							p5.add(pp10);
							p5.add(pp11);
							p5.add(pp12);
							p5.add(pp13);
							p5.add(pp14);
						  	
						  	repaint();
						  	p2.add(p4);
							  p2.add(p5);
						    add(p2,BorderLayout.CENTER);
						 revalidate();
						 }
					  
				}
			});
		
		 
		
		  
		  tA.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss1=tA.getText();
				  dd1=Double.parseDouble(ss1);
			}
		  });
		  tBB.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  
				  ss2=tBB.getText();
				  dd2=Double.parseDouble(ss2);
			}
		  });
		  tB.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  
				 
				  ss3=tB.getText();
				  dd3=Double.parseDouble(ss3);
			}
		  });
		  tCC.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss4=tCC.getText();
				  dd4=Double.parseDouble(ss4);
			}
		  });
		  tC.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss5=tC.getText();
				  dd5=Double.parseDouble(ss5);
			}
		  });
		  tDD.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss6=tDD.getText();
				  dd6=Double.parseDouble(ss6);
			}
		  });
		  tD.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss7=tD.getText();
				  dd7=Double.parseDouble(ss7);
			}
		  });
		  tF.addActionListener(new ActionListener(){
			  @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				  ss8=tF.getText();
				  dd8=Double.parseDouble(ss8);
			}
		  });
		  
		  
		
		  
		  
		  p4.setBorder(BorderFactory.createTitledBorder("Score"));
		  p5.setBorder(BorderFactory.createTitledBorder("Grade"));
		 p1.setLayout(new GridLayout(1,3));
		  p1.add(cb1);
		  p1.add(cb2);
		  p1.add(cb3);
		  add(p1,BorderLayout.NORTH);
		  l1.setSize(400,400);
		  p2.setLayout(new GridLayout(1,2));
		 p2.add(p4);
		  p2.add(p5);
		  
		  add(p2,BorderLayout.CENTER);
		 
		  JButton b1=new JButton();
			b1.setText("ENTER");
			  JButton b2=new JButton();
				b2.setText("ADD");
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Grade g= new Grade();
					/*ss1=tA.getText();
					  dd1=Double.parseDouble(ss1);
					  ss2=tBB.getText();
					  dd2=Double.parseDouble(ss2);
					  ss3=tB.getText();
					  dd3=Double.parseDouble(ss3);
					  ss4=tCC.getText();
					  dd4=Double.parseDouble(ss4);
					  ss5=tC.getText();
					  dd5=Double.parseDouble(ss5);
					  ss6=tDD.getText();
					  dd6=Double.parseDouble(ss6);
					  ss7=tD.getText();
					  dd7=Double.parseDouble(ss7);
					  ss8=tF.getText();
					  dd8=Double.parseDouble(ss8);*/
					g.setNum(dd1, dd2, dd3, dd4, dd5, dd6, dd7);
					
					f.dispose();
					JFrame f3=new JFrame();
					Calculator c=new Calculator(f3,g,allSS,ss99);
				//	c.setString(allSS);
					f3.dispose();
					f3.add(c);
					f3.setSize(500, 500);
					f3.setTitle("Sign In");
					f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f3.setVisible(true);
					f3.setLocationRelativeTo(null);
					f3.pack();
					f3.repaint();
				}
			});
b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String code = JOptionPane.showInputDialog(
					        f, 
					        "Enter The Name Score (label)", 
					        "Set Name Score (title)", 
					        JOptionPane.WARNING_MESSAGE
					    );
					k++;
					allSS.add(code);
					p4.setLayout(new GridLayout(7+k,1));
					//p4.add(new  JTextField(10));
					JTextField jtt=new JTextField(10);
					JLabel jll=new JLabel(code+"    ");
					array2.add(jtt);
					array3.add(jll);
					JPanel jpxx=new JPanel();
					jpxx.add(array3.get(k-1));
					jpxx.add(array2.get(k-1));
					
					p4.add(jpxx);
					
					p2.add(p4);
					  p2.add(p5);
				    //add(p2);
				 revalidate();
					repaint();
				}
			});
			p3.setLayout(new FlowLayout());
			p3.add(b1);
			p3.add(b2);
			add(p3,BorderLayout.SOUTH);
			repaint();
	  }
	  public void setGrade()
	  {
		  if(sel1==1)
		  {
			  a1.append("   Full score \n");
   			 
		  }
	  }
}

