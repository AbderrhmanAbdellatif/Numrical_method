package Odev;

public class RK4 {
	public static double d(double k1,double k2,double k3,double k4) {
        return (1.0/6.0)*(k1+2*k2+2*k3+k4);
   }
   public static double f(double x,double y) {
	return ( Math.sin(x)-(1/x)*y);
  }
   public static void main(String[] args) {
   final double h=(Math.PI/20.0);
   double w=1;double t=0.0,i = Math.PI;
   double mesh[]=new double[20];
   for (int j = 0; j <20; j++) {t=i;mesh[j]=t;i=t+h;};
 	double k1,k2,k3,k4,p=0.0;
    for (int k = 0; k<mesh.length; k++) {
		k1=h*f(mesh[k],w);
		k2=h*f(mesh[k]+(h/2),w+(0.5*k1));
		k3=h*f(mesh[k]+(h/2),w+0.5*k2);
		k4=h*f(mesh[k]+h,w+k3);
		p=w+d(k1,k2,k3,k4);
		System.out.println("y"+k+": "+p);
		w=p;
   }
	
    }
}
