package data;
import java.util.Scanner;;
public class BisectionMethod {
static  double F(double x) {
	return 600*Math.pow(x,4)-550*Math.pow(x, 3)+200*Math.pow(x, 2)-20*Math.pow(x, 1)-1;
} 
  public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   int i=1;
   double x0,x1,x2;
   double f1,f2,f3 = 0,t;
   System.out.println("Enter the value of x0: ");
   x0=scanner.nextDouble();
   System.out.println("Enter the value of x1: ");
   x1=scanner.nextDouble();
   System.out.printf("\n__________________________________________________________________\n");
   System.out.printf("\n   iteration\t x0\t       x1\t   x2\t     f2 \n ");
  do {
       x2=(x0+x1)/2;
	   f3=F(x2);
	   f2=F(x1);
	   f1=F(x0);
	   System.out.println(i+"   |   "+x0+"       |          "+x1+"        |         "+x2 +"            |        "+f3);
	   if (f3*f1<0) {
		   x1=x2;
	     } else {
           x0=x2;
	     } 
        i++;
  } while (Math.abs(f3)>0.0001);
  System.out. printf("\n__________________________________________________________\n");
  System.out.printf("\n\nApp.root = "+ x2);
  
  }
}
   
