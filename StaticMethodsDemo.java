/**
 *
 * Matt Minchhoff, 9-30-2019, CSC 240_01, Assignment 2, Writing Java Static Methods
 * 
 */
import java.util.Random;

class StaticMetohdsDemo {

    // Marco for counting the methods
    static int N = 1;

    public static void main(String[] args) {
        spacer();
        System.out.println(countsGuests("Jason", 5));
        spacer();
        alarm(4);
        spacer();
        System.out.println(sum100());
        spacer();
        System.out.println(maxOfTwo(5, 8));
        spacer();
        System.out.println(sumRange(3, 10));
        spacer();
        System.out.println(larger(2.5, 9.2));
        spacer();
        System.out.println(countA("Apples are amazing!"));
        spacer();
        System.out.println(evenlyDivisible(2, 4));
        spacer();
        System.out.println(average(4, 5));
        spacer();
        System.out.println(average(2, 4, 6));
        spacer();
        System.out.println(average(2, 4, 6, 8));
        spacer();
        System.out.println(average(2, 4, 6, 8, 10));
        spacer();
        System.out.println(multiConcat("Hello", 5));
        spacer();
        System.out.println(isAlpha('A'));
        spacer();
        System.out.println(reverse("Fishsticks"));
        spacer();
        System.out.println(isIsoceles(3, 7, 12));
        spacer();
        System.out.println(randomInRange(10, 100));
    }

    /*
     * Pre:  give a name and integer
     * Post:  welcome message returned
              
     */

    public static String countsGuests(String visitorName, int visitorNumber) {
    
        System.out.println("Welcome" + visitorName+"! You are visitor #"+ visitorNumber);
    }

    /*
     * Pre:  give an integer
     * Post:  prints a string on several lines
              
     */

    public static void alarm(int number) {
        if (number < 1)
    System.out.println ("ERROR");
    else
    for (int count = 1; count <= number; count++)
    System.out.println ("Alarm!");
}
    }

    /*
     * Pre: give an integer 
     * Post: adds numbers from 1 to 100 
              
     */

    public static int sum100() {
        int sum = 0;
        for (int count = 1; count <= 100; count++)
        sum += count;
        return sum;}

    }

    /*
     * Pre:  give two integers
     * Post:  returns which is the larger value
              
     */

    public static int maxOfTwo(int x, int y) {
        int result = num1;

        if (x > y)
        result = y;

        return result;
    }

   /*
     * Pre:  give two integer values
     * Post: sums the range of numbers between the two values 
              
     */

    public static int sumRange(int x, int y) {
           int sum = 0;
    for(int i=x;i<=y; i++){
        sum += i;
        System.out.println("the total sum is "+ sum);
    }
    return sum;
    }
    }

   /*
     * Pre:  give two integers
     * Post:  returns that the first one is bigger
              
     */

    public static boolean larger(double x, double y) {
       return (x > y);
    }

   /*
     * Pre: give a string 
     * Post:  returns the number of times the character appears
              
     */

    public static int countA(String str) {
        int count = 0;
        for (int position = 0; position < text.length(); position++)
        if (text.charAt(position) == 'A')
        count++;
        return count;
    }

   /*
     * Pre:  give two intgers
     * Post:  returns if the value is divisible by the second
              
     */

    public static boolean evenlyDivisible(int x, int y) {
        boolean result = false;

        if (x != 0 && y != 0)
        if (x % y == 0 || y % x == 0)
        result = true;

        return result;
    }

    /*
     * Pre: give two integers 
     * Post:  returns an  average for the values
              
     */

    public static float average(int x, int y) {
        
        return (x+y) / 2.0;

    }

    /*
     * Pre:  give three integers
     * Post:  returns an average for the values
              
     */

    public static float average(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }

   /*
     * Pre:  give four integers
     * Post:  returns an average for the values
              
     */

    public static float average(int x, int y, int z, int a,) {
        return (x + y + z+ a) / 4.0;
    }

    /*
     * Pre:  give five integers
     * Post:  returns an average for the values
              
     */

    public static float average(int x, int y, int z, int a, int b) {
        return (x + y + z + a +b) / 5.0;    }

   /*
     * Pre:  give a string and an integer
     * Post:  returns the characters in reverese order
              
     */

    public static String multiConcat(String str, int x) {
        String result = str;

        if (x > 1)
        for (int count = 2; count <= x; count++)
        result += str;

        return result;
    }

  /*
     * Pre:  give a character
     * Post:  return whether the character is upper or lowercase
              
     */

    public static boolean isAlpha(char x) {
        System.out.print(x + " is uppercase or lowercase? ");
        if ((x >= 'a' && x <= 'z') || x >= 'A' && x <= 'Z') {
            return (true);
        } else {
            return (false);
        }
    }

    /*
     * Pre:  give a string
     * Post:  return a string in reverse order
              
     */

    public static String reverse(String str) {
       String result = "";

        for (int place = str.length()-1; place >= 0; place--)
        result += str.charAt(place);

        return result;
    }

    /*
     * Pre:  give three integers
     * Post: return whether these values would be an isosceles triangle 
              
     */

    public static boolean isIsoceles(int opp, int adj, int hyp) {
        boolean result = false;

        if ( (opp == adj) && opp != hyp) ||
        (adj == hyp) && adj != opp) ||
        (opp == hyp) && opp != adj) )
        result = true;

        return result;
    }

    /*
     * Pre:  give two integers
     * Post:  return a random value in the range of the numbers
              
     */

    public static int randomInRange(int x, int y) {
        int result = 0;
        Random generator = new Random();

        if (x <= y)
        {
        int range = y - x + 1;
        result = generator.nextInt(range) + x;
        }

        return result;
    }

    
    public static void spacer() {
        System.out.println("\n----- Method #" + N + " -----\n");
        N++;
    }
}

