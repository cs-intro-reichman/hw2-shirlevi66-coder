// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int count = 0;
		while (count < num){
			if (num % 2 == 00){
				num = num/2;
			} else{
				num= 3*num + 1;
			} 
			if (num == 1){
				break;
			} count++;
		} 

		
		
		//int even = n%2 == 0 
	}
}
