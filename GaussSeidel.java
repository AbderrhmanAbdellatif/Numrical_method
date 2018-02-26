package Odev;

public class GaussSeidel {
	 public static void main(String[] args) {
	        double mesh[] = new double[21];
	        final double h = Math.PI / 20.0;
	        double GaussseidelMatrix[][] = new double[20][20];
	        double e[] = new double[20];
	        e[0] = 1;//burada Y0 elemeni 1 oldugunu  biliyordum 
	        double Y2[] = new double[21];//Y2 (e) yani yi(1-(h/xi))
	        double YDegeri[] = new double[21];//baslangici degerlerimi 
	        for (int i = 0; i < mesh.length; i++) {
	            mesh[i] = Math.PI + i * h;//doldurmak icin 
	        }
	        for (int p = 1; p < 20; p++) {
	            e[p] = -(1 - (h / mesh[p]));// degisken olarak tanimladim 
	        }
	        for (int i = 0; i < YDegeri.length; i++) {
	            YDegeri[i] = 1;//hepsini ilk olarak  deger atiyorum  
	        }
	        for (int i = 0; i < GaussseidelMatrix.length; i++) {
	            for (int j = 0; j < GaussseidelMatrix.length; j++) {
	                if (i == j) {
	                    GaussseidelMatrix[i][j] = 1;
	                    if (i != 19) {//Gauss dizi olusturdum 
	                        GaussseidelMatrix[i + 1][j] = e[i + 1];
	                        Y2[i] = e[i + 1];
	                    }
	                }
	            }
	        }
	        double s = 0;
	        int temp = 0, m = 0, y = 1;
	        for (int i = 0; i < 10000; i++) {
	            s = Xf(mesh[temp], h)
	                    + (YDegeri[m] * Y2[temp]);//X olarak degesken (h*sin(x))+Yi*(1-(h/xi))
	            if (temp == 20 || m == 20) {
	                System.out.println("*************" + (i + 1) + "**************");
	                temp = 0;
	                y = 0;
	                m = 0;
	            } else {

	                System.out.println((temp + 1) + " Sonuc  " + YDegeri[temp] + " ==>   h sin (" + mesh[temp] + ") + y " + (y) + "    " + YDegeri[m] + " "
	                        + " h /(" + mesh[temp] + " ) * y"
	                        + (y) + "    " + YDegeri[m] + "      " + " " + mesh[temp]);
	                temp++;
	                m++;
	                y++;
	                YDegeri[m] = s;//surkli her zaman dagistirdigi icin   
	            }

	        }
	    }

	    static double f(double x, double y) {
	        return (Math.sin(x) - ((1 / x) * y));
	    }

	    static double Xf(double x, double h) {
	        return h * Math.sin(x);
	    }
	}

