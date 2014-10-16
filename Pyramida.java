public class Pyramida {
	public static void main(String[] args) {
	       int vyska = Integer.parseInt(args[0]);

	        for (int sloupec = 0; sloupec <= vyska; sloupec++) {

	            for (int mezer =0; mezer <= vyska - sloupec; mezer++)
	                System.out.print("  ");

	            for (int predek = sloupec; predek >= 1; predek--)
	                System.out.print(" x ");

	            for (int bok = 1; bok <=sloupec; bok++)
	                System.out.print("x");
	            System.out.println();
	        }  
	    }
	}