package SwingPackage;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

class Calculator extends JFrame implements ActionListener
{
	JTextField tf=new JTextField();
	JButton b[]=new JButton[20];
	String button[]={"B","C","1/x","sqrt","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	Calculator(String s)
	{
		super(s);
		setLayout(null);
		setBounds(200,200,255,398);
		Font f=new Font("",Font.ITALIC,15);
		
		tf.setBounds(1,1,239,59);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setFont(f);
		add(tf);
		int x=0,y=60;
		for(int i=0;i<20;i++)
		{
			if(i%4==0&&i!=0)
			{
			 y=y+60;
			 x=0;
			}
			 b[i]= new JButton(button[i]);
		     b[i].setBounds(x,y,60,60);
			 b[i].setFont(f);
			 b[i].addActionListener(this);
			x=x+60;
			add(b[i]);
		}
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b1=(JButton)e.getSource();
		if("C".equals(b1.getText()))
		  tf.setText("");
		else if("B".equals(b1.getText()))
		{
			String s=tf.getText();
			if(!s.equals(""))
			s=s.substring(0,s.length()-1);
			tf.setText(s);
		}
		else if("1/x".equals(b1.getText()))
		{
			double x=Double.parseDouble(tf.getText());
		  tf.setText(""+1/x);
		}
		else if("sqrt".equals(b1.getText()))
		{
			double x=Double.parseDouble(tf.getText());
		  tf.setText(""+Math.sqrt(x));
		}
		else if("=".equals(b1.getText()))
		{
		  ScriptEngineManager manager = new ScriptEngineManager();
		  ScriptEngine en=manager.getEngineByName("js");
		  try
		  {
		    tf.setText(""+en.eval(tf.getText()));
		  }
		  catch(Exception ex){
		    System.out.println(ex);
		  }
		}
		else 
		tf.setText(tf.getText()+b1.getText());
	}
	public static void main(String args[])
	{
		new Calculator("CALCULATOR");
	}
	
}