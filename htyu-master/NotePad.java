package test;



import javax.swing.*;
import java.awt.*;

public class NotePad extends JFrame{

	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JMenuBar jMenuBar1;
	
	private JMenu jMenu1;
	private JMenu jMenu2;
	private JMenu jMenu3;

	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem4;
	private JMenuItem jMenuItem5;
	private JMenuItem jMenuItem6;
	private JMenuItem jMenuItem7;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItem9;
	private JMenuItem jMenuItem10;
	private JMenuItem jMenuItem11;
	private JMenuItem jMenuItem12;

	public Notepad(String name){
		super(name);
		initComponents();
	}
	
	public void initComponents(){
		
		jTextArea1 = new JTextArea();
		jTextArea1.setColumns(40);
		jTextArea1.setRows(10);
		jScrollPane1 = new JScrollPane(jTextArea1);
		
		jMenuBar1 = new JMenuBar();
		
		jMenu1 = new JMenu();
		jMenu1.setText("File");
		jMenu1.setMinimumSize(new Dimension(35, 19));
		
		jMenuItem1 = new JMenuItem();
		jMenuItem1.setText("New");
		jMenuItem2 = new JMenuItem();
		jMenuItem2.setText("Open");
		jMenuItem3 = new JMenuItem();
		jMenuItem3.setText("Save");
		jMenuItem4 = new JMenuItem();
		jMenuItem4.setText("Save as");
		jMenuItem5 = new JMenuItem();
		jMenuItem5.setText("Exit");
		jMenu1.add(jMenuItem1);
		jMenu1.add(jMenuItem2);
		jMenu1.add(jMenuItem3);
		jMenu1.add(jMenuItem4);
		jMenu1.add(jMenuItem5);
		jMenuBar1.add(jMenu1);
		
		
		jMenu2 = new JMenu();
		jMenu2.setText("Edit");
		jMenu2.setMinimumSize(new Dimension(35, 19));
		jMenuItem6 = new JMenuItem();
		jMenuItem6.setText("Cut");	
		jMenuItem7 = new JMenuItem();
		jMenuItem7.setText("Copy");
		jMenuItem8 = new JMenuItem();
		jMenuItem8.setText("Paste");
		jMenuItem9 = new JMenuItem();
		jMenuItem9.setText("Delete");
		jMenu2.add(jMenuItem6);
		jMenu2.add(jMenuItem7);
		jMenu2.add(jMenuItem8);
		jMenu2.add(jMenuItem9);
		jMenuBar1.add(jMenu2);
		
		
		jMenu3 = new JMenu();
		jMenu3.setText("Help");
		jMenu3.setMinimumSize(new Dimension(35, 19));
		jMenuItem11 = new JMenuItem();
		jMenuItem11.setText("See Help");
		jMenuItem12 = new JMenuItem();
		jMenuItem12.setText("About Notepad");
		jMenu3.add(jMenuItem11);
		jMenu3.add(jMenuItem12);
		jMenuBar1.add(jMenu3);
		
		setJMenuBar(jMenuBar1);
		add(jScrollPane1, BorderLayout.CENTER);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args){
		Notepad nd = new Notepad("Notepad");
	}

}
