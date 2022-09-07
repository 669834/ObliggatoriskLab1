import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Uke35OppB4Oblig {

	public static void main(String[] args) {

		int inntekt = parseInt(showInputDialog("Hvor mye tjener du?"));

		double skatteSats = 0.0;

		if (inntekt < 1) {
			System.out.println("Du har ingen inntekt.");
			return;
		}

		else if (inntekt > 164100 && inntekt <= 230950) {
			skatteSats = 0.93;
		}

		else if (inntekt > 230950 && inntekt <= 580650) {
			skatteSats = 2.41;
		}

		else if (inntekt > 580650 && inntekt <= 934050) {
			skatteSats = 11.52;
		}

		else if (inntekt > 934050) {
			skatteSats = 14.52;
		}

		System.out.println("Du betaler " + inntekt / 100 * skatteSats + " kroner skatt.");

	}
}