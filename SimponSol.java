package data;

public class SimponSol {
	public static double f(double x) {
		return 4 / (1 + x * x);
	}
	public static void main(String[] args) {
		double a=0,b=1;
		double n=500;
		double h=(b-a)/n;
		double sum=0.0;
		for (int i = 0; i < n; i++) {
			if (i%2==0) sum+=2*f(a+i*h);
			else sum+=4*f(a+i*h);
		}
		sum+=f(a)+f(b);
		sum*=h/3;
		System.out.println(sum);
	}
}
