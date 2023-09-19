package TrinnSkattProskjekt;
import java.util.Scanner;
public class TrinnSkattProskjekt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);                                                                     
		System.out.print("Skriv inn bruttoinntekt: ");  
		double bruttoinntekt = scanner.nextDouble();  
		double trinnskatt = beregnTrinnskatt(bruttoinntekt);     
     	 
 		System.out.println("Trinnskatten er: " + trinnskatt + " kr");  
 		

		scanner.close();      
	}
	public static double beregnTrinnskatt(double inntekt) {
		double trinnskatt = 0.00;                                 

		if (inntekt > 190349) {   
			
			
			if (inntekt <= 267899) {                           
                trinnskatt = (inntekt - 190349) * 1.7;
            } else if (inntekt <= 643799) {
                trinnskatt = 267899 * 1.7 + (inntekt - 267899) * 4.0;
            } else if (inntekt <= 969199) {
                trinnskatt = 267899 * 1.7 + (643799 - 267899) * 4.0 + (inntekt - 643799) * 13.4;
            } else if (inntekt <= 1999999){
                trinnskatt = 267899 * 1.7 + (643799 - 267899) * 4.0 + (969199 - 643799) * 13.4 + (inntekt - 969199) * 16.4;  
            } else {
            	trinnskatt = 267899 * 1.7 + (643799 - 267899) * 4.0 + (969199 - 643799) * 13.4 + (1999999-969199)* 16.4 + (inntekt - 1999999)*17.4;
            }
		}

        return trinnskatt;   
        
		}
		
		 
		}



