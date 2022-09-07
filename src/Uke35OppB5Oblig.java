import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Uke35OppB5Oblig {

	public static void main(String[] args) {

		final int LISTEANTALL = 10;

		for (int nummer = 1; nummer <= LISTEANTALL; nummer++) {

			int poengsum = parseInt(showInputDialog("Din poengsum:"));
			// String dinkarakter = showInputDialog("Din karakter:");

			if (poengsum < 0 || poengsum > 100) {
				System.out.println("Dette er ikke mulig, seriøst?");
				// Hvis poengsum er i minus
				nummer--; // tell ned for å kjøre løkken en ekstra gang
				continue; // gå til ned iterasjon, steg
			}

			else if (poengsum >= 0 && poengsum <= 39) {
				System.out.println("Din karakter er F");
			}

			else if (poengsum >= 40 && poengsum <= 49) {
				System.out.println("Din karakter er E");
			}

			else if (poengsum >= 50 && poengsum <= 59) {
				System.out.println("Din karakter er D");
			}

			else if (poengsum >= 60 && poengsum <= 79) {
				System.out.println("Din karakter er C");
			}

			else if (poengsum >= 80 && poengsum <= 89) {
				System.out.println("Din karakter er B");
			}

			else if (poengsum >= 90 && poengsum <= 100) {
				System.out.println("Din karakter er A (Jævlig bra ass!)");
			}
		}
	}
}
