package Odev;

public class EulerYontemi {
	public static void main(String[] args) {
		  final double h=(Math.PI/20.0); double y=1;double t=0.0,i = Math.PI;double w=y;
          double mesh[]=new double[20];
		    for (int j = 0; j <20; j++) {t=i;mesh[j]=t;i=t+h;};
			   for (int f = 0; f <mesh.length; f++) {
			   	y=(w)+(h*(Math.sin(mesh[f])-((1/mesh[f])*w)));
			    System.out.println("y"+f+"  : "+y);
			    w=y;
		     }  
	}

}
