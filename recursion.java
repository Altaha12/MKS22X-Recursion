import java.util.ArrayList;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static void main(String[] args) {
      System.out.println("sqrt of "+ 2 +" is " +sqrt(2,.00001));
    }
    public static double sqrt(double n, double tolerance){
      //sqrtH is a helper recursive function with more parameters
      if (n==0) return 0;
      return sqrtH(n,1.,tolerance);
    }
  //absolute value method
    private static double abs(double n){if(n<0) return n*-1;return n;}
    private static double sqrtH(double n, double guess, double tolerance){
      if(abs((guess*guess-n)/n)<tolerance/100)return guess;
      return sqrtH(n, (n/guess + guess)/ 2. ,tolerance);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
  /*  public static int fib(int n){

    }

    /*As Per classwork*/
  /*  public static ArrayList<Integer> makeAllSums(int n){
  }*/

}
