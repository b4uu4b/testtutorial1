package practice15;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		
int z, x, y;
System.out.println("Enter the numbers x and y:");
Scanner SC = new Scanner(System.in);
Scanner SC1 = new Scanner(System.in);
x = SC.nextInt();
y = SC1.nextInt();
System.out.println("Before Swap"+x+""+y);
z=x;
x=y;
y=z;
System.out.println("After Swap"+x+""+y);
	}

}
