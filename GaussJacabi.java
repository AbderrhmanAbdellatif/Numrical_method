package data;

public class GaussJacabi {
	public static double f1(double x2,double x3) {
		return (6.0+x2-2*x3)/(10.0);
	}
	public static double f2(double x1,double x3,double x4) {
		return (25.0+x1+x3-3*x4)/(11.0);
	}
	public static double f3(double x1,double x2,double x4) {

		 return  (-11.0-2*x1+x2+x4)/(10.0);
	}
	public  static double f4(double x2,double x3) {
		return (15.0-3*x2+x3)/(8.0);
	}
	public static void main(String[] args) {
	double x1=0,x2=0,x3=0,x4=0,p1=0,p2=0,p3=0,p4=0;
	double  XGercek[]= {1.0,2.0,-1.0,1.0};
	for(int i=0;;i++) {
	p1=f1(x2,x3);p2=f2(x1,x3,x4);p3=f3(x1,x2,x4);p4=f4(x2,x3);
	x1=p1;x2=p2;x3=p3;x4=p4;
	System.out.println("x1 = "+x1);System.out.println("x2 = "+x2);System.out.println("x3 = "+x3);System.out.println("x4 = "+x4);
	if(XGercek[0]==x1 && XGercek[1]==x2 && XGercek[2]==x3 && XGercek[3]==x4) break;
		System.out.println("=====================("+(i+1)+")=====================");
		}
	}

}
