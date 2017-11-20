package Frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fileex {
	int j=2;
	public fileex()
	{
	/*	try
		{
			
			Scanner s = new Scanner(new File("File1.txt"));
			
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			 s.nextLine( );
			while (s.hasNext()){
			String	ss1=s.nextLine();
			
		        StringTokenizer st=new StringTokenizer(ss1,",");
		        while(st.hasMoreTokens()){
		            String temp=st.nextToken();
		            System.out.println("Next Token "+temp);
		//	   System.out.println(ss1);
			   
			    
		        }
			
		}
			s.close();
		}
		catch(Exception e)
		{
			
		}*/
		JButton jb=new JButton("aaa");
		DefaultTableModel model = new DefaultTableModel();
	    JTable table = new JTable(model);
	    model.addColumn("Col1");
	    model.addRow(new Object[] { "r1" });
	    model.addRow(new Object[] { "r2" });
	    model.addRow(new Object[] { "r3" });
	    
	    Vector data = model.getDataVector();
	    Vector row = (Vector) data.elementAt(1);

	    int mColIndex = 0;
	    List colData = new ArrayList(table.getRowCount());
	    for (int i = 0; i < table.getRowCount(); i++) {
	      row = (Vector) data.elementAt(i);
	      colData.add(row.get(mColIndex));
	    }

	    // Append a new column with copied data
	    model.addColumn("Col3", colData.toArray());
	    
	    JFrame f = new JFrame();
	    JPanel jp1=new JPanel();
	    jp1.add(jb);
	    f.setSize(300, 300);
	    f.add(new JScrollPane(table));
	    f.setVisible(true);
	    f.add(jp1,BorderLayout.SOUTH);
	    
	    jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				 model.addColumn("Col3", colData.toArray());
				
			}
		});
	}
	public static void main(String[] args) {
		new fileex();
	}
}
