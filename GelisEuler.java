package data;

public class GelisEuler {
   public static double f(double x,double w) {
	return (w-Math.pow(x,2)+1);   
   }
	public static void main(String[] args) {
		   double y=0.5;
		   double t[]= new double [5];
		   t[0]=0;
		   t[1]=0.5;
		   t[2]=1.0;
		   t[3]=1.5;
		   t[4]=2.0;
		   double w=y;
		   double h=0.5;
		   for (int i = 0; i < t.length-1; i++) {
			y=w+(h/2)*(f(t[i], w)+f(t[i+1],(w+h*f(t[i], w))));
			System.out.println((i+1)+"   :  "+y);
		    w=y;
		   }
	}

}
