package Odev;

public class Sonlu_Farklar {

  
	public static void main(String[] args) {
		final double h=(Math.PI/20.0);double t=0.0,i = Math.PI,y=1,p=0;
        double mesh[]=new double[21];
        double yleri[]=new double[20];
        for (int j = 0; j < yleri.length; j++) {
			yleri[j]=1;
		}
        yleri[0]=1;
        int m=1,v=0;
		for (int j = 0; j <=20; j++) {t=i;mesh[j]=t;i=t+h;};	
         for (int j = 0; j < 10000; j++) {
		   p=fh(mesh[v], yleri[m]);
		   yleri[m]=p;
		   if (m==19 || v==19) {
			   System.out.println("************"+(m+1)+"**************");
			   m=0;
			  v=0;
		     }else {
		    	
		    	 System.out.println((m+1)+"  "+yleri[m]);m++; v++;};
		}
	}
  
  static double fh(double x, double y) {
      return (Math.sin(x) - ((1 / x) * y));
  }
}
