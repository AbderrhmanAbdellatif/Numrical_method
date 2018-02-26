package Odev;

public class GelistirilmisEulerYontemi {
	 public static double f(double x,double w) {
			return (Math.sin(x)-(1/x)*w);   
		   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final double h=(Math.PI/20.0);
		 double t=0.0,i = Math.PI;double y=1.0;double w=y;
         double mesh[]=new double[20];for(int j = 0; j <20; j++) {t=i;mesh[j]=t;i=t+h;};
		for (int k = 0; k < mesh.length-1; k++) {
			y=(w+(h/2)*(f(mesh[k], w)+f(mesh[k+1],(w+h*f(mesh[k], w)))));
			System.out.println((k+1)+"  :  "+y);
		    w=y;
		   }
	}

}
