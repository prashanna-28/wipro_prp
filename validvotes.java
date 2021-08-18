/*In an election between two candidates, one got 55% of the total valid votes, 20% of the votes
were invalid. The total number of votes was X (value greater than 5000), design an algorithm to
accept a value for X from the user and calculate the number of valid votes that the other
candidate got.*/
package wipro;
import java.util.*;
public class as9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int valid=x*80/100;
		int result=valid*45/100;
		System.out.println(result);
	}
