/*Design an algorithm to calculate the factorial of a number N. The value of N is provided as an
input by the user.*/
public class ex4 {
	public static void main(String args[]){  
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}
