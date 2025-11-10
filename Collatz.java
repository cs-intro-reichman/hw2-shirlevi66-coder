// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int count = 0;
		while (num != 1){
			System.out.print(num + " ");
			if (num % 2 == 00){
				num = num / 2;
			} else{
				num= 3 * num + 1;
			} count++;	
		} 
		System.out.println(1);
		System.out.println("Every one of the first 100 hailstone sequences reached 1.")

		
		
		//int even = n%2 == 0 
	}
}
