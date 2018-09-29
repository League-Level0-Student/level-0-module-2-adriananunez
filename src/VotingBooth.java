import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	
	String age=JOptionPane.showInputDialog("How old are you in years");
	int age2=Integer.parseInt(age);
	
	
	if(age2>18) {
		System.out.println("Who do you think should be the next president");	
	}
	
	if(age2<18) {
		System.out.println("Nobody cares what you think");
	
	
	}
	
	
}
}
