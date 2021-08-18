/*Design an algorithm to find the least perfect square, which is divisible by each of 21, 36 and 66.*/
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int number;
		for(int i=21;i<=(int)Math.pow(2,21);i++)
		{
		    int square_root=(int)Math.sqrt(i);
		    if((square_root*square_root == i)&&(i%21==0 && i%36==0 && i%66==0))
		    {	
		    System.out.println(i);
		    break;
		    }
		}
	}
}
