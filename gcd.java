/*Design an algorithm to find the greatest number that will divide 43, 91 and 183 so as to leave
the same remainder in each case.*/
package wipro;
import java.util.Scanner;

public class greatest {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
     int number1 = sc.nextInt();
     int number2 = sc.nextInt();
     int number3 = sc.nextInt();
     int gcdNumbers = greatest.findGCD(number1, number2, number3);
     System.out.println(gcdNumbers);
     sc.close();
  }
  public static int findGCD(int x, int y)
  {
     if(y == 0)
     {
        return x;
     }
     else
     {
        return findGCD(y, x % y);
     }
  }
  public static int findGCD(int x, int y, int z)
  {
     return findGCD(findGCD(x, y), z);
  }

}

