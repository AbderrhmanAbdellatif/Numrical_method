package data;

public class Simpon {	
	 public static double f(double x) {
		   return (Math.pow(x, 3)+(1/1+Math.pow(x, 2)-(1/5)));
	   }
	   public static double h(double a,double b) {
		   return((b-a)/3);
	   }
		public static void main(String[] args) {
			double a=2,b=10;
			double x0,x1,x2,x3;
	        double h=h(a, b);
			x0=a;
			x1=(x0+h);
			x2=(x0+(2*h));
			x3=b;
	         double j=f(x0)+3*f(x1)+3*f(x2)+f(x3);
	         double i=(3.0/8.0)*(h);
	         double hatapayi=(((3.0*Math.pow(h, 5))/80));
	         double  Toplam=(i*j)-hatapayi;
			 System.out.println("Simpon 3/8 : "+Toplam);
		}
}
