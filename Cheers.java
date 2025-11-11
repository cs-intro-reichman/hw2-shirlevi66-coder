//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        String s = args[0];
        int times = Integer.parseInt(args[1]);
        int n = s.length();
        String upper = s.toUpperCase(); 
        String l = "AEFHILMNORSX";
        int i = 0;
        while (i < n){
        char c = s.charAt(i);
        char cUpper = upper.charAt(i);
        if (l.indexOf(cUpper) == -1){
           System.out.println("Give me a " + cUpper + ": " + c + "!");
         } else  {
            System.out.println("Give me an " + cUpper + ": " + c + "!");    
         }   i++;  }
         System.out.println("What does that spell?");
         String wordUpper = s;
         StringBuilder bangs = new StringBuilder();
         for (int z = 0; z < n; z++) {
         bangs.append('!');
}        for (int t = 0; t < times; t++) {
          System.out.println(s + bangs.toString());
        }
      
      }
      }

