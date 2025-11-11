// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int count = 0;
		String c = args[1];
		int summary = count;
		while (c.equals("v")|| c.equals ("v")){
		for (int i = 1; i<num; i++){
			System.out.print(i + " ");
			if (i % 2 == 00){
				i = i / 2;
			} else{
				i= 3 * i + 1;
			} 	
		} } 
		else { System.out.println("Every one of the first " + count + " hailstone sequences reached 1.");
		}
		System.out.println(1);
		//System.out.println("Every one of the first " + count + " hailstone sequences reached 1.");

		
		
		//int even = n%2 == 0 
	}
}
