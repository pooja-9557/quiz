import javax.swing.*;
import java.awt.*;

public class quiz extends JFrame //implement ActionListener
{
	JLabel l1,l2;
	JPanel p;
	quiz()
	{
		 new JFrame("QUIZ TEST");
		l1= new JLabel("<html><font size='5'><u>WELCOME TO QUIZ PROGRAM<br> </u></font></html>");
		l1.setBounds(50,20,350,100);
		l2= new JLabel("<html> <font size='4' color= blue><br>Instructions:</font><br>1. You willn't come back from the question.<br>2. If you choosen't any option and go to next question answer will count as 0. </html>");

		l2.setBounds(70,50,300,100);
		p= new JPanel();
		add(l1);
		p.add(l2);
		p.setSize(200,300);
		setSize(400,400);
		p.setVisible(true);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] args)
	{

		new quiz();
	}
}
