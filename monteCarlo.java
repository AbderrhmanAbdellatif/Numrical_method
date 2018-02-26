package data;

import java.util.Random;

public class monteCarlo {
  public static double f(double x) {
	  return 4 / (1 + x * x);
	  
  }
	public static void main(String[] args) {
		Random generator = new Random();
		double x,y,sum;
		double ust = 0,alt = 0;
		for (int i = 0; i <100; i++) {
			x = generator.nextDouble() * 1.0;
			y = generator.nextDouble() * 1.0;
            if (y<f(x)) {
            	alt++;
			}if (y>f(x)) {
				ust++;
			}
		}
		sum=(alt/(alt+ust));
		System.out.println(sum);
	}

}
