// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

String time = (args[0]);
int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1) );
int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4) );
int addtime = Integer.parseInt(args[1]);
int total_minutes = (hours * 60 + minutes + addtime);
int totalhours = (total_minutes / 60);
int newhours = totalhours % 24; // The remainder operator % is also known as modulo
int newminutes = total_minutes - totalhours * 60; 
System.out.println((newhours < 10 ? "0" : "") + newhours + ":" + (newminutes < 10 ? "0" : "") + newminutes);
	}

}
