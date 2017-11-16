package Frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	ArrayList<Integer> list4;
	DefaultTableModel model;
	int i=0,j=0;
	int k=2;
	String[][] data;
	int o=2;
	 ArrayList <String> allSS=new ArrayList <String>();
	 String ss99;
	 ArrayList<Double> array4=new ArrayList <Double>();
	public Calculator(Frame f,Grade g,ArrayList <String> allSS,String ss99,ArrayList<Double> array4) 
	{
		this.array4=array4;
		this.allSS=allSS;
		this.f=f;
		this.g=g;
		this.ss99=ss99;
		model = new DefaultTableModel();
		JButton jb=new JButton("CALCULATOR");
		JButton jb2=new JButton("ADD");
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
		
	 data =new String[j][6+allSS.size()];
	 
	 
		System.out.println(j);
	//	add(table2);
		
		//String header[] = {"NO", "ID", "NAME", "SURNAME" ,"RAW SCORE","TEST SCORE"};
		String header[]= new String[4+allSS.size()];
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
		System.out.println("sadlkasnkfasjkfnlaskjnf");
		 DefaultTableModel model = new DefaultTableModel();
		    //JTable table = new JTable(model);
	
		    model.addColumn("Col1");
		    model.addColumn("Col2");

		JTable table = new JTable(data,header);
		//int t=0;
		for(int i=0;i<table.getRowCount();i++)
		{
			
				for(int k=0;k<table.getRowCount();k++)
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
		table.getColumnModel().getColumn(4).setPreferredWidth(130);
	table.getColumnModel().getColumn(5).setPreferredWidth(130);
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
		
		add(p3);
		add(p4,BorderLayout.SOUTH);
repaint();

		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int l=0;l<allSS.size();l++)
				{
				for(int i=0;i<table.getRowCount();i++)
				{
					System.out.println("sadsasdasdasd-====="+(4+l));
					double[] a= new double[j];
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
							 System.out.println(a[i]);
							 System.out.println(g.getGrade(a[i]));
						 }
						
					 }
						
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
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			//	table.addColumn("sadasd");
TableColumn tt=new TableColumn();
tt.setMinWidth(2000);

tt.setPreferredWidth(1400);
//table.setrow
List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5);
List<String> stringValues = Arrays.asList("One", "Two", "Three", "Four", "Five");

//TableView<Integer> table = new TableView<>();
				table.addColumn(tt);
				k++;
				repaint();
				
				 //data =new String[j][6];
			for(int i=0;i<table.getRowCount();i++)
				
		table.setValueAt("", i, 3+k);
			table.getColumnModel().getColumn(3+k).setPreferredWidth(130);
				
			    
			}
		});
	
	}
	
	public void setString( ArrayList <String> allSS)
	{
		System.out.println("sasssss==="+allSS.size());
		this.allSS=allSS;
	}
}
