package KarakterBergning;
import java.util.Scanner;

public class KarakterBergning {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

	        for (int studentNr = 1; studentNr <= 10; studentNr++) {
	            System.out.print("Skriv inn poengsum for student " + studentNr + ": ");
	            int poengsum = scanner.nextInt();

	            if (poengsum < 0 || poengsum > 100) {
	                System.out.println("Ugyldig poengsum. Skriv inn en poengsum mellom 0 og 100.");
	                continue;
	            }
	            char karakter = beregnKarakter(poengsum);
	            System.out.println("Karakter for student " + studentNr + ": " + karakter);
	        }
	        scanner.close();
	    }

	    private static char beregnKarakter(int poengsum) {   
	        if (poengsum >= 90 && poengsum <= 100) {
	            return 'A';
	        } else if (poengsum >= 80) {
	            return 'B';
	        } else if (poengsum >= 60) {
	            return 'C';
	        } else if (poengsum >= 50) {
	            return 'D';
	        } else if (poengsum >= 40) {
	            return 'E';
	        } else {
	            return 'F';
	        }
	   	
		 

	}

}
