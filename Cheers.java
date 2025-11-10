//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String s = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);
        int n = s.length();
        String l = "AEFHILMNORSX";
        int i = 0;
        while (i < n){
        char c = s.charAt(i);
        if (l.indexOf(c) == -1){
           System.out.println("Give me a " + c + ": " + c + "!");
         } else  {
            System.out.println("Give me an " + c+ ": " + c + "!");    
         }   i++;  }
         System.out.println("What does that spell?");
         String bangs = "";
         for (int q = 0; q < s.length(); q++) { 
         bangs += "!";}
         for (int t = 0; t < times; t++ ){
         System.out.println(s + bangs); }


        }
        
        }

