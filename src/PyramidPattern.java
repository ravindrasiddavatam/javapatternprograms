
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		 for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
		}

	}

}
