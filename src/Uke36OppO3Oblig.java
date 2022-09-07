import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Uke36OppO3Oblig {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Gi meg et tall:")); 
		int res = 1; 
		
		// Vi starter løkken på 2 fordi det vil alltid ganges med 1 i formelen
		for (int i = 2; i <= n; i++) {
			 res = res * i; 	 
		}
		
		System.out.println("Fakultet av " + n + " er " + res); 
	}
}