package _07_years_alive;

import javax.swing.JOptionPane;

public class Years_Alive {
public static void main(String[] args) {
	
	int Year = (2020);
	String Age = null;
Age =	JOptionPane.showInputDialog("How old are you?");
	
	int Age1 =	Integer.parseInt(Age);
	Age1++;
	int	i = 0;
	for (int repeat = Age1 ; i <repeat;  i++) {
		
	
	System.out.println(Year - Age1);
	Year++;
	  
}
}
}