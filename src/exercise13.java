import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int p=0;
	    double r=0;
	    int t=0;
	    int n=0;
	    double result=0;
	    System.out.println("What is the principal amount?");
	    p= kb.nextInt();
	    System.out.println("What is the rate?");
	    r= kb.nextDouble();
	    System.out.println("What is the number of years?");
	    t= kb.nextInt();
	    System.out.println("What is the amount of times the interest is compounded per year?");
	    n= kb.nextInt();
	    double newR= r/100;
	    result= pow((1 + newR/n),(n*t));
	    result*= p;
	    System.out.println("$"+p+" invested at "+r+"% for "+t+" compounded "+n+" times per year is $"+result+".");


    }
}
