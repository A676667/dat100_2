package NFakuletet;
import java.util.Scanner;
public class NFakuletetBeregning {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Skriv inn et heltall n > 0: ");
		
        int n = scanner.nextInt();
        
         if (n <= 0) {
            System.out.println("Du må skrive inn et heltall større enn 0.");
        } else {
             long fakultet = beregnFakultet(n);
            
             System.out.println(n + "! = " + fakultet);
        }
        
        scanner.close();
    }

    public static long beregnFakultet(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        } else {
            long resultat = 1;
            for (int i = 2; i <= n; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }
}
	 


