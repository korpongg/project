package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.mail.PasswordAuthentication;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

public class Calculator extends JPanel{
	private Frame f;
	private Grade g;
	String ss1,ss2,ss3,ss5;
	ArrayList<String> list1;
	ArrayList<String> list2;
	ArrayList<String> list3;
	ArrayList<String> list5;
	JComboBox jbo;
	ArrayList<Integer> list4;
	DefaultTableModel model;
	int i=0,j=0;
	int k=2;
	
	String[][] data;
	int o=2;
	JTable table;
	 ArrayList <String> allSS=new ArrayList <String>();
	 String ss99;
	 double[] a;
	 double ai[];
		double stu[];
		double max=0,min=0,avg=0,total=0,sd=0;
	 ArrayList <Double> allS=new ArrayList <Double>();
	 double allsize=0;
	 ArrayList<Double> array4=new ArrayList <Double>();
	 ChecKCalController checker = new ChecKCalController();
	 double a1,a2,a3,a4,a5,a6,a7;
	String cls1,cls2,cls3;
	 final int  ii=0;
	 int check=0;
	ArrayList <JComboBox> ajr=new ArrayList <JComboBox>();
	JLabel ll1,ll2,ll3;
	public Calculator(Frame f,Grade g,ArrayList <String> allSS,String ss99,ArrayList<Double> array4) 
	{
		this.array4=array4;
		this.allSS=allSS;
		this.f=f;
		this.g=g;
		this.ss99=ss99;
		model = new DefaultTableModel();
		JButton jb=new JButton("CALCULATOR");
		JButton jb2=new JButton("Send to txt");
		
		JPanel jps=new JPanel();
	jps.setLayout(new GridLayout(1,3));
	JPanel jps2=new JPanel();
	jps2.setLayout(new BorderLayout());
	jps2.add(jps,BorderLayout.NORTH);
	
	JPanel jps3=new JPanel();
	jps3.setLayout(new GridLayout(1,2));
	JRadioButton jrb1=new JRadioButton("Criteria Reference");
	JRadioButton jrb2=new JRadioButton("Norm Referenced");
	jps3.add(jrb1);
	jps3.add(jrb2);
	jrb1.setSelected(true);
	jps2.add(jps3,BorderLayout.SOUTH);
	jrb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton radioButton = ( JRadioButton ) e.getSource ( ); 

            boolean isSelected = radioButton.isSelected ( ); 

            if ( isSelected ) 
            { 
            	check=0;
            } 
        
		}
	});
jrb2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JRadioButton radioButton = ( JRadioButton ) e.getSource ( ); 

            boolean isSelected = radioButton.isSelected ( ); 

            if ( isSelected ) 
            { 
            	check=1;
            } 
        
		}
	});
	ll1=new JLabel("Subjects :"+cls1);
	 ll2=new JLabel("Section :"+cls2);
	 ll3=new JLabel("Academic Year :"+cls3);
	 jps.add(ll1);
	 jps.add(ll2);
	 jps.add(ll3);
	//	ArrayList arr=new ArrayList();
		try
		{
			
			Scanner s = new Scanner(new File(ss99));
			list1 = new ArrayList<String>();
			list2 = new ArrayList<String>();
			list3 = new ArrayList<String>();
			 list4= new ArrayList<Integer>();
			 list5= new ArrayList<String>();
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			
			while (s.hasNext()){
				/*ss1=s.next();
				ss2=s.next();
				ss3=s.next();
			    list1.add(ss1);
			    list2.add(ss2);
			    list3.add(ss3);
			   // System.out.println(ss);
			    String	ss1=s.nextLine();
				*/
				
				String	ss4=s.nextLine();
		        StringTokenizer st=new StringTokenizer(ss4,",");
		      
		           // String temp=st.nextToken();
		        String  ss5=  st.nextToken();
		            String ss1=st.nextToken();
					String ss2=st.nextToken();
					String ss3=st.nextToken();
					 
					 list5.add(ss5);
		            list1.add(ss1);
				    list2.add(ss2);
				    list3.add(ss3);
		            System.out.println("Next Token "+ss1+" "+ss2+" "+ss3);
		 //System.out.println(temp);
		   j++;
		         
		        
			    	
			  
			
		}
			s.close();
		}
		catch(Exception e)
		{
			
		}
		
		/*DefaultTableModel model = new DefaultTableModel();
	    JTable table2 = new JTable(model);
	    model.addColumn("Col1");
	    //model.addRow(new Object[] { "r1" });
	    //model.addRow(new Object[] { "r2" });
	    //model.addRow(new Object[] { "r3" });
	    
	    Vector data2 = model.getDataVector();
	    Vector row = (Vector) data2.elementAt(1);

	    int mColIndex = 0;
	    List colData = new ArrayList(table2.getRowCount());
	    for (int i = 0; i < table2.getRowCount(); i++) {
	      row = (Vector) data2.elementAt(i);
	      colData.add(row.get(mColIndex));
	    }

	    // Append a new column with copied data
	    model.addColumn("Col3", colData.toArray());
		*/
		
	 data =new String[j][6+allSS.size()+2];
	 
	 
		System.out.println(j);
	//	add(table2);
		
		//String header[] = {"NO", "ID", "NAME", "SURNAME" ,"RAW SCORE","TEST SCORE"};
		String header[]= new String[4+allSS.size()+2];
		int mm=0;
		for(int i=0;i<4+allSS.size();i++)
		{
			System.out.println("i========"+i);
			if(i==0)
			{
				header[i]="NO";
			}
			else if(i==1)
			{
				header[i]="ID";
			}
			else if(i==2)
			{
				header[i]="NAME";
			}
			else if(i==3)
			{
				header[i]="STATUS";
			}
			else
			{
				header[i]=allSS.get(mm);
				mm++;
			}
			System.out.println(header[i]);
			
		}
		for(int j=4+allSS.size();j<4+allSS.size()+2;j++)
		{
			if(j==4+allSS.size())
			{
				header[j]="TOTAL";
			}
			else if(j==4+allSS.size()+1)
			{
				header[j]="POSITION";
			}
		}
		String[] petStrings = {"Present","Absent" };
		jbo=new JComboBox(petStrings);
		

		
		 
		ArrayList <JComboBox> ajr2=new ArrayList <JComboBox>();
		
		for(int i=0;i<j;i++)
		{
			
			ajr.add(jbo);
			ajr.get(i).getSelectedItem();
			
			ajr.get(ii).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					  String s = (String) ajr.get(ii).getSelectedItem();//get the selected item
					  	
		                switch (s) {//check for a match
		                    case "Present":
		                        System.out.println("aaaaaa");
		                    	 for(int jl=4;jl<table.getColumnCount()-1;jl++)
								  {
									table.setValueAt("put",ii,jl);
								  }
		                        break;
		                    case "Absent":
		                        System.out.println("bbbbb");
		                    	  for(int jl=4;jl<table.getColumnCount()-1;jl++)
								  {
									  table.setValueAt("0",ii,jl);
									 
								  }
		                        break;
		                  
		                }
		                
				}
				
			});
			
		//setPosition(i);
		}
	
		
		
		
		
		System.out.println("sadlkasnkfasjkfnlaskjnf");
		 DefaultTableModel model = new DefaultTableModel();
		    //JTable table = new JTable(model);
	
		    model.addColumn("Col1");
		    model.addColumn("Col2");

		 table = new JTable(data,header);
		//int t=0;
			//	DefaultTableModel dm =new DefaultTableModel();
		TableColumn col=table.getColumnModel().getColumn(4+allSS.size()+1);
		
		for(int i=0;i<table.getRowCount();i++)
		{
			
				for(int k=0;k<table.getRowCount()+2;k++)
				{
					
					if(k==0)
					{
						data[i][k] = list5.get(i) ;
					}
					if(k==1)
					{
						data[i][k] = list1.get(i) ;
					}
					if(k==2)
					{
						data[i][k] = list2.get(i) ;
					}
					if(k==3)
					{
						data[i][k] = list3.get(i) ;
					}
					if(k==table.getColumnCount()-1)
					{
						data[i][k] = "Choose...";
						col.setCellEditor(new DefaultCellEditor(jbo));
					
						
					}
				
					 
					
						
					
					
				}
			
			
			
		}
		System.out.println("21321421p412irj21j5i1ip5");
		
	
		// Table

		JScrollPane scrol = new JScrollPane(table);
		
		scrol.setBounds(table.getBounds());
		//scrol. setLayout(new BorderLayout(10, 10));
		setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		table.setRowHeight(20);
		table.sizeColumnsToFit(150);
		table.setPreferredScrollableViewportSize(table.getPreferredSize());
		//table.setFillsViewportHeight(true);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
	//	table.getColumnModel().getColumn(4).setPreferredWidth(130);
	//table.getColumnModel().getColumn(5).setPreferredWidth(130);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

		centerRenderer.setHorizontalAlignment(JLabel.CENTER);

		table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		
		
	p1.add(scrol);
		p2.add(jb);
		p4.add(jb2);
		p4.setLayout(new FlowLayout());
		p3.setLayout(new BorderLayout());
		
			p3.add(p1,BorderLayout.NORTH);
		p4.add(jb);
		add(jps2,BorderLayout.NORTH);
		add(p3,BorderLayout.CENTER);
		add(p4,BorderLayout.SOUTH);
repaint();

		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				a= new double[j];
				double sum=0;
				ai=new double[j];
				stu=new double[j];
				
				for(int i=0;i<table.getRowCount();i++)
				{
					//System.out.println("sadsasdasdasd-====="+(4+l));
					for(int l=0;l<allSS.size();l++)
					{
						
						 String b;
						 if(table.getValueAt(i, 4+l)==null)
						 {
							 a[i]=0;
							 sum=sum+a[i];
								
							 //System.out.println(a[i]);
						 }
						 else
						 {
							 
							 b = (String) table.getValueAt(i, 4+l);
							 if(b.equals(""))
							 {
								 if (checker.checkCal(b)) {
										System.out.println("trueeeeeee");
									}
								 a[i]=0;
								 
								 sum=sum+a[i];
								 
								// System.out.println(a[i]);
								 
							 }
							 else
							 {
								 if (checker.checkCal(b)) {
									 System.out.println("trueeeeeee");
									}
								 a[i]=Integer.parseInt(b);
								 
								 sum=sum+a[i];
								// System.out.println(i+"---"+a[i]);
								 //System.out.println(g.getGrade(a[i]));
							 }
							
						 }
					}
					a[i]=sum;
					sum=0;
					
					
					/* a= new double[j];
					 String b;
					 if(table.getValueAt(i, 4+l)==null)
					 {
						 a[i]=0;
						 System.out.println(a[i]);
					 }
					 else
					 {
						 
						 b = (String) table.getValueAt(i, 4+l);
						 if(b.equals(""))
						 {
							 a[i]=0;
							 System.out.println(a[i]);
							 
						 }
						 else
						 {
							 a[i]=Integer.parseInt(b);
							 System.out.println(i+"---"+a[i]);
							 System.out.println(g.getGrade(a[i]));
						 }
						
					 }*/
						
					//  if(a[i].equals(""))
					//  {
					//	  System.out.println("asdasd");
					//  }
							
						
						//else
						//{
						//	list4.add(Integer.parseInt(table.getValueAt(i+1, 3).toString()));
						//	System.out.println(list4.get(i));
					//	}
						
					
					
					//System.out.println(list4.get(i));
				}
				
				
				for(int i=0;i<array4.size();i++)
				{
					allsize=allsize+array4.get(i);
				}
				System.out.println("allSize===="+allsize);
				
			
				for(int i=0;i<j;i++)
				{
					stu[i]=(a[i]/allsize)*100;
					System.out.println("stu"+i+" === "+stu[i]);
					//ai[i]=(a[i])
				}
					
				if(check==1)
				{
				for(int i=0;i<j;i++)
				{
					if(i==0)
					{
						max=stu[i];
					}
					if(max<stu[i])
					{
						max=stu[i];
					}
				}
				for(int i=0;i<j;i++)
				{
					if(i==0)
					{
						min=stu[i];
					}
					if(min>stu[i])
					{
						min=stu[i];
					}
				}
				for(int i=0;i<j;i++)
				{
					avg=avg+stu[i];
				}
				avg=avg/j;
				
				for (int i = 0; i < j; i++) {
					System.out.println(stu[i]+" ----  "+avg);
		            total += Math.pow(stu[i]-avg,2);
		            System.out.println(i+" ++++++  "+total);
		        }
				sd = Math.sqrt(total/j);
				double pis=max-min;
				
				System.out.println("max===="+max);
				System.out.println("min===="+min);
				System.out.println("avg===="+avg);
				System.out.println("sd===="+sd/2);
				
				letNum(avg,sd,pis);
				for(int i=0;i<j;i++)
				{
					System.out.println();
				}
				
				}
				
					for(int i=0;i<table.getRowCount();i++)
					{
						//System.out.println("sadsasdasdasd-====="+(4+l));
						System.out.println("i====="+i);
						 table.setValueAt(""+stu[i],i,table.getColumnCount()-2);
						
					}	
				
					
			}
			
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				// TODO Auto-generated method stub
			//	table.addColumn("sadasd");
				
				
				File file = new File("Score.txt");
				Email email=new Email();
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} 
			  
				try {
				
					BufferedWriter buf = new BufferedWriter(new FileWriter(file, false)); 
					file.delete();
					for(int i=0;i<j;i++)
					{
						if(check==0)
						{
							buf.write(list1.get(i)+" "+g.getGrade(a[i]));
							email.sendEmail(list1.get(i)+" "+g.getGrade(a[i]));
						}
						else
						{
							buf.write(list1.get(i)+" "+setGrade(stu[i]));
							email.sendEmail(list1.get(i)+" "+setGrade(stu[i]));
						}
						
						buf.newLine();
						
					}
					buf.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			    
			
			}
			
				
		});
	
	}
	
	public void setString( ArrayList <String> allSS)
	{
		//double sum=0;
		System.out.println("sasssss==="+allSS.size());
		
		this.allSS=allSS;
	}
	
	public void letNum(double avg,double sd,double pis)
	{
		double z1,z2,z3,z4,z5,z6;
		z1=(1-avg)/sd;
		z2=(2-avg)/sd;
		z3=(3-avg)/sd;
		z4=(4-avg)/sd;
		z5=(5-avg)/sd;
		z6=(6-avg)/sd;
		double sk=pis/8;
		a1=avg+1.5*sd;
		a2=avg+1*sd;
		 a3=avg+0.5*sd;
		 a7=avg;
		 a4=avg-0.5*sd;
		 a5=avg-1*sd;
		 a6=avg-1.5*sd;
		
	
		 System.out.println("a1======"+a1);
		 System.out.println("a2======"+a2);
		 System.out.println("a3======"+a3);
		 System.out.println("avg======"+a7);
		 System.out.println("a4======"+a4);
		 System.out.println("a5======"+a5);
		 System.out.println("a6======"+a6);
	
		
	}
	public String setGrade(double a)
	{
		if(a>=a1)
		{
			return "A";
		}
		else if(a>=a2&&a<a1)
		{
			return "B+";
		}
		else if(a>=a3&&a<a2)
		{
			return "B";
		}
		else if(a>=a7&&a<a3)
		{
			return "C+";
		}
		else if(a>=a4&&a<a7)
		{
			return "C";
		}
		else if(a>=a5&&a<a4)
		{
			return "D+";
		}
		else if(a>=a6&&a<a5)
		{
			return "D";
		}
		else
		{
			return "F";
		}
			
	}
	public void setText(String cls1,String cls2,String cls3)
	{
		this.cls1=cls1;
		this.cls2=cls2;
		this.cls3=cls3;
		ll1.setText("Subjects :"+cls1);
		ll2.setText("Section :"+cls2);
		ll3.setText("Academic Year :"+cls3);
		
	}
	void setPosition(int i)
	{
		
			ajr.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				/*	 if (ajr.get(ii).getSelectedItem().toString().equals("Present"))
		                {
						  for(int jl=4;jl<table.getColumnCount()-1;jl++)
						  {
							table.setValueAt("put",ii,jl);
						  }
						  
						  
						 
		                }
					  if (ajr.get(ii).getSelectedItem().toString().equals("Absent"))
		                {
						  for(int jl=4;jl<table.getColumnCount()-1;jl++)
						  {
							  table.setValueAt("0",ii,jl);
							 
						  }
						 
		                }*/
					  String s = (String) ajr.get(i).getSelectedItem();//get the selected item

		                switch (s) {//check for a match
		                    case "Present":
		                        System.out.println("aaaaaa");
		                    	 for(int jl=4;jl<table.getColumnCount()-1;jl++)
								  {
									table.setValueAt("put",i,jl);
								  }
		                        break;
		                    case "Absent":
		                        System.out.println("bbbbb");
		                    	  for(int jl=4;jl<table.getColumnCount()-1;jl++)
								  {
									  table.setValueAt("0",i,jl);
									 
								  }
		                        break;
		                  
		                }
				}
			});
		}
	
	
}


