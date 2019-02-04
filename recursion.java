import java.util.ArrayList;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static void main(String[] args) {
      System.out.println("sqrt of "+ 0 +" is " +sqrt(0,.00001));
      System.out.println("sqrt of "+ 3165401 +" is " +sqrt(3165401,.00001));
      System.out.println("sqrt of "+ 25 +" is " +sqrt(25,.00001));
      System.out.println("sqrt of "+ 5 +" is " +sqrt(5,.00001));
      System.out.println("sqrt of "+ 4 +" is " +sqrt(4,.00001));
      System.out.println("sqrt of "+ 10 +" is " +sqrt(10,.00001));
      System.out.println("fib of 0 is "+ fib(0));
      System.out.println("fib of 1 is "+ fib(1));
      System.out.println("fib of 5 is "+ fib(5));
      System.out.println("fib of 49 is "+ fib(49));
      System.out.println("fib of 13 is "+ fib(13));
      System.out.println("fib of 19 is "+ fib(19));
      System.out.println(makeAllSums(3));
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
   public static int fib(int n){
     //trueFib is the helper function
     if(n==0)return 0;
     if(n==1)return 1;
     return trueFib(0,1,2,n);
    }
  private static int trueFib(int first, int second, int index, int target){
    //Comment: keeps adding remembring terms from before, goes from the bottom up.
    if(index==target)return first+second;
    return trueFib(second,first+second,index+1,target);
  }

    /*As Per classwork*/
  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> s = new ArrayList<Integer>();
    makeAllSumsH(s,n,0,0);
    return s;
  }
  private static void makeAllSumsH(ArrayList<Integer> s, int n, int index,int sum){
    if(index==n){
       s.add(sum+index);
       s.add(sum);
     }
    else{
      makeAllSumsH(s,n,index+1,sum+index);
      makeAllSumsH(s,n,index+1,sum);
    }
  }

}
