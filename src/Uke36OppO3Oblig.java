import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Uke36OppO3Oblig {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Gi meg ett tall tosk ")); 
		int res = 1; 
		
		/*if (n == 1 || n == 2) { 
			System.out.println(n);
			return;
		} */
		
		for (int i = 2; i <= n; i++) {
			 res = res * i; 	 
		}
		
		System.out.println(res); 
	}
}
