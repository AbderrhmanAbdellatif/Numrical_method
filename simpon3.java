package data;

public class simpon3 {
	final static double h=Math.PI/99;
	public static void main(String[] args) {
	    double toplam=0;
	    int temp=0,k=0;
	    double d[]=new double [4];
       int n=100;
       double noktalar[]=new double[n];
	   for (int i = 0; i <noktalar.length; i++) { noktalar[i]=h*i;}
	   for (int i = 0; i < noktalar.length; i++) {
		   d[k]=noktalar[temp];  k++;temp++;
		   if (k==3) {
			toplam+=simponf(d[0],d[1],d[2],d[3]);
			k=0;
		   }
	   }
	    double sonuc=((toplam));
	   System.out.println(" Sonuc :"+sonuc);
	}
	 static double  f(double x) {
		return ((Math.sqrt(x))*Math.pow(Math.E, x));
	}
	 static double  simponf(double x ,double x0 ,double x1 ,double x2 ) {
			return ((3*h/8.0)*(f(x)+3.0*f(x0)+3.0*f(x1)+f(x)));
		}
}
