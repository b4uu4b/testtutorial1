package practice1;
import java.util.Scanner;

public class Practice1 {

	  public static void main(String[] args) {
	  Scanner SC = new Scanner (System.in);
	  System.out.println("Enter the first number:");
	  int fnum = SC.nextInt();
	  System.out.println("Enter the second number:");
	  int snum = SC.nextInt();
	  System.out.println("sum of two numbers:");
	  int sum1 = fnum + snum;
	  int sum2 = fnum - snum;
	  int sum3 = fnum * snum;
	  int sum4 = fnum / snum;
	  int sum5 = fnum % snum;
	  System.out.println(sum1+"\n"+sum2+"\n"+sum3+"\n"+sum4+"\n"+sum5);
	 }
	}