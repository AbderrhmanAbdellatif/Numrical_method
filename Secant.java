package data;
import java.math.*;
import java.util.Scanner;
import java.lang.*;
public class Secant { 
	 public static void main(String argv[]) {
		    double del = 1e-4; 
		    double dx = 1, x =0.1, x1=0.6;
		    int n = 20;
		    x = secant(n, del, x,x1, dx);
		    System.out.println("Root obtained: " + x);
		  }
	 public static double secant(int n, double del,
			    double x,double x1, double dx) {
			    int k = 0;
			    double x2=0;
			    while ((Math.abs(dx)>del) && (k<n) && f(x2)!=0) {
			      double d = f(x1)-f(x);
			       x2 = x1-f(x1)*(x1-x)/d;
			       x  = x1;
			       x1 = x2;
			       dx = x1-x;
			       k++;
			       System.out.println(x1 +"\t"+ k);
			    }
			    if (k==n) System.out.println("Convergence not" +
			      " found after " + n + " iterations");
			    System.out.println("iterations: " + k);
			    return x1;
			  }
			  public static double f(double x) {
				  return 600*Math.pow(x,4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-20*Math.pow(x, 1)-1;
			  }
}
