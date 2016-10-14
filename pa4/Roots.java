/* Roots.java
 * Nivetha Sivaprakasam
 * nsivapra
 * pa4
 * Finds the root of a polynomial lying within a specified range.
 */


import java.util.Scanner;

 class Roots {
 
   public static void main(String[]args) {
   int d;
   double[] C;
   double tolerance = Math.pow(10, -7);
   double resolution = Math.pow(10, -2);
   double threshold = Math.pow(10, -3);
   double L,R,b,a,root,temp;
   Scanner sc = new Scanner(System.in);
   boolean foundRoot = false;
 
 System.out.print("Enter the degree: ");
    d = sc.nextInt();
    C = new double[d+1];

 System.out.print("Enter "+(d+1)+" coefficients: ");
   for(int i=0; i<(d+1); i++) { 
   C[i] =sc.nextDouble();
  }

 System.out.print("Enter the left and right endpoints: ");
  L = sc.nextDouble();
  R = sc.nextDouble();
  System.out.println(" ");
  
  double[] D =diff(C);
  a = L;
  
 while(a<R) {
  b = a+resolution;
  if( poly(C,a)* poly(C,b)<=0) {
   root= findRoot(C,a,b, tolerance);
   System.out.printf("Root found at %.5f%n", root);
   foundRoot = true;
  }

  if( poly(D,a)* poly(D,b)<=0) {

   root = findRoot(D,a,b,tolerance);
   temp =  Math.abs(poly(C,root));

  if(temp < threshold) {
   root= findRoot(D,a,b,tolerance);
   System.out.printf("Root found at %.5f%n", root);
   foundRoot = true;
   } 
  }
 a = b;
 b = a+resolution;
}

 if(foundRoot == false) {
  
  System.out.println("No roots were found in the specified range.");  
 }
}

   static double poly(double[] C, double x){
     double sum=0.0;
    for(int i= 0; i< C.length; i++) {
     sum+= (C[i]*Math.pow(x,i));
    }
     return sum;
   }

   static double[] diff(double[]C) {
    int power = C.length-1;
    double[] D= new double[power];
   for (int i = 0; i< D.length ; i++) {
      D[i] = ((i+1)*C[i+1]);
   }
    return D; 
  }

   static double findRoot(double[] C, double a, double b, double tolerance) {
    double root=0.0, residual;
    double signchange= Math.signum(poly(C,b)-poly(C,a));
      while (Math.abs(b-a) > tolerance) {
        root =(a+b)/2.0; residual=poly(C,root);
         if(signchange*residual>0) 
               b = root;
            else 
               a = root; 
      }
      return root;
   }
}
