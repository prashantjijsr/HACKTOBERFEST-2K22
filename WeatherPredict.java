package SwingExample;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

class WeatherPrredict extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField j1,j2;
	WeatherPrredict()
	{
		super("Weather Predict");
		setLayout(null);
		setBounds(200,200,600,300);
		getContentPane().setBackground(	Color.LIGHT_GRAY);
		JLabel j=new JLabel("Temperature Based Weather Prediction");
		j.setBounds(20,15,400,30);
		j.setFont(new Font("Monaco", Font.BOLD, 20));
		j.setForeground(Color.BLUE);
		add(j);
		add(j);
	    l1= new JLabel("Enter Temperature:");
		l1.setBounds(5,55,150,20);
		l1.setFont(new Font("Monaco", Font.BOLD, 15));
		add(l1);
	    j1=new JTextField();
		j1.setBounds(160,55,100,20);
		add(j1);
		JButton b=new JButton("Click!!");
		b.setBounds(80,85,80,30);
		b.addActionListener(this);
		add(b);
	    l2= new JLabel("Today's Weather:");
		l2.setBounds(5,125,150,20);
		l2.setFont(new Font("Monaco", Font.BOLD, 15));
		add(l2);
	    j2=new JTextField();
		j2.setBounds(160,125,100,20);
		add(j2);
		JPanel p = new JPanel(); 
		ImageIcon i = new ImageIcon("img4.jpg"); 
		l3=new JLabel();
		l3.setIcon(i);
		p.setBounds(270,55,280,200);
        l3.setBounds(0,10,260,190);		
		p.add(l3);
		add(p);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		double temp=Double.parseDouble(j1.getText());
		ImageIcon i;
		if(temp>=30){
		 j2.setText("Summer");
		 i = new ImageIcon("sunny.jpg"); 
		 l3.setIcon(i);
		}
		else if(temp>=24)
		{
		    j2.setText("Windly");
			i = new ImageIcon("windly.jpg"); 
		    l3.setIcon(i);
		}
		else if(temp>=20){
		 j2.setText("Rainy");
		 i = new ImageIcon("rainy.jpg"); 
		 l3.setIcon(i);
		}
		else if(temp>=15){
		 j2.setText("Gloomy");
		 i = new ImageIcon("gloomy.jpg"); 
		 l3.setIcon(i);
		}
		else if(temp>=8){
		 j2.setText("Winter");
		 i = new ImageIcon("cold.jpg"); 
		 l3.setIcon(i);
		}
		else if(temp>=4){
		 j2.setText("HailStorm");
		  i = new ImageIcon("hailstorm.jpg"); 
		 l3.setIcon(i);
		}
		else if(temp>=-10){
		 j2.setText("Snow");
		 i = new ImageIcon("snow.jpg"); 
		 l3.setIcon(i);
		}
		else{
		 j2.setText("Bilzzards");
		  i = new ImageIcon("bilzzards.jpg"); 
		 l3.setIcon(i);
		}
	}
	public static void main(String args[])
	{
		new WeatherPrredict();
	}
}
