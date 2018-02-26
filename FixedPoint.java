package data;
import java.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FixedPoint {
	  /* rearrange your function into the form x = g(x) */
	   
	   static double doFunction(double x) { /* one of the rearrangements for
	                                           Problem 35 at the end of Ch. 1 */
	      return (600*Math.pow(x,4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-1)/20;
	   }

	   static void doFixedPoint() {

		   double x0, x;
			x0 = 0.1;
			int i, flag = 0, maxiter = 200;
			double  TOL = 0.000000001;
			System.out.println("  nokata --->  "+x0);
			System.out.println("iter "+"  "+"f(x)");
			for (i = 0; i <=maxiter; i++){
				x = doFunction(x0);
				System.out.println(i+"     "+x);
				if (Math.abs(x-x0)<	TOL){
					System.out.println("root =  after  iteration " + x +"      "+i);
					flag = 1;
					break;
				}
				x0 = x;
			}
			
	   }         

	   public static void main(String[] args) {
	      doFixedPoint();
	   }
}
