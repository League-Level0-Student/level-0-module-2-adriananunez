import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	

	String height=JOptionPane.showInputDialog("What is your height in inches");
	int height2=Integer.parseInt(height);
	
	
	if(height2>48) {
		System.out.println("If height is more than 48 inches you can ride the roller coaster");	
	}
	
	if(height2<48) {
		System.out.println("if you want to ride in the rollercoaster you need to grow more first");
	
	
	}


}	
}

