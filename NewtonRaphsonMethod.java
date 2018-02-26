package data;
import java.math.*;
import java.util.Scanner;
public class NewtonRaphsonMethod {
	public static double F(double x){//our function
		return (600 *Math.pow(x, 4) - 550 *Math.pow(x, 3) + 200 *Math.pow(x, 2) - 20 *Math.pow(x, 1) - 1);}
	public static double Fd(double x){//function's differentiation
		return (2400 *Math.pow(x, 3) - 1650 *Math.pow(x, 2) + 400 *Math.pow(x, 1) - 20 );}
       public static void  NewtonRaphson (){
	     Scanner scanner =new Scanner(System.in);
		double x0, h, err, root = 0, x1 = 0;
		int miter, iter;
		System.out.printf("Enter the first approximation ,the max error and the maximum number of iterations\n");
		x0=scanner.nextDouble();
		err=scanner.nextDouble();
		miter=scanner.nextInt();
		iter = 1;
		while (iter <= miter)
		{
			h = F(x0) / Fd(x0);//calculatinf f(x)/f'(x)as we do in Newton Raphson method
			x1 = x0 - h;//x1=x0-f(x)/f'(x)
			System.out.println("The approximation's value after  iteration is "+ iter+"  \t "+ x1);
			if (Math.abs(h)<err)//If the difference between the 2 approximations is below the max error
			{
				root = x1;//then make the approximation as the root
				break;
			}
			else x0 = x1;
			iter++;
		}
		if (root == x1)
		{//display root and the function value
			System.out.printf("The root is: "+ root);
			 //double fncvalue = F(root);
			//System.out.printf("Value of F(root) is: "+ fncvalue);
		}
		else
			System.out.printf("The unsufficent number of iteration");//In case root!=x1 then number of iteration were insufficient
  }
public static void main(String[] args) {NewtonRaphson();}
      

}
