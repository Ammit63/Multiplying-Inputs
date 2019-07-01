import java.util.Scanner;

public class E06_MultiplyingInputs {

	static Scanner input = new Scanner(System.in);
		
	public static void main(String[] args) {

			// provide for user input
			System.out.println("Please enter a number: ");
			int num = input.nextInt();
			input.close();
			
			//combine calculation and printout
			int i;
			for(i=1; i<=10; i++) {
				System.out.println(num+" multiplied by "+ i + " is equal to = "+ (num * i));	
			}
	}

}
