/* Queens.java
 * Nivetha Sivaprakasam
 * nsivapra
 * pa5
 * finds the rooks
 */


class Queens {

  public static void main(String[]args) {
 
   int f, n = 0;
   int[] A;
   int count=0;
   boolean verbose=false;
   boolean print = true; 
   
   if (args.length < 1 || args.length>2) {
     message(); 
   } 

   if(args.length == 1) {
     try{
       n = Integer.parseInt(args[0]);
      } catch (Exception e) {
       message();
       }
   } else {
     try{
      n = Integer.parseInt(args[1]);
    }catch( Exception e) {
     message();
   }
  
  if(!args[0].equals("-v"))  message();
    verbose= true;
  }

   A = new int[n+1];
   f = factorial(n);
 
   for(int i=0; i<f; i++) {
      if(isSolution(A)) {
       count++;
     if(verbose) {
       printArray(A);
     }
    }
       nextPermutation(A);
   }

  if(args.length ==1 || args.length == 2 ) {
   System.out.println(n+"-Queens has "+(count-1)+" solutions");
  }     
 }
   static int factorial(int n) {

    int f=1;
    for(int i=1; i<=n; i++) {
     f*=i;
   }
   return f;
  }

   static void printArray(int[]A) {
   if(A[1] != 0) {
   System.out.print("(");
   for(int i=1; i<=A.length-1; i++) {
    if(A[1] != 0) {
    System.out.print(A[i]+"");
   if(i != A.length-1) {
    System.out.print(", ");
    }
   }
  } 

    System.out.println(")");
 }
}

  static void nextPermutation(int[]A) {

   int successor=0,pivot=0,temp=0;
   boolean reverse = true;

   for(int i=A.length-2; i>0; i--) {
    if(A[i]<A[i+1]) {
      pivot = i;
      reverse = false;
      break;
    }
   }

  if( reverse ) {
   for(int i=0; i<A.length; i++) {
     A[i] = i;
   }
   return; 
 }

  for(int i=A.length-1; i>0; i--) {
    if(A[i] > A[pivot]) {
     successor = i;
     break;
    }
  }

 swap(A,pivot,successor);
 reverse(A,pivot);
 }

 static void reverse(int []A,int pivot) {

   int i=pivot+1; int j= A.length-1;

   while(i<j) {
    swap(A,i,j);
    i++;
    j--;
   }
    return;
  } 

 static void swap(int[] A, int i, int j) {

   int temp;
   temp = A[i];
   A[i] = A[j];
   A[j] = temp;
 }

  static boolean isSolution(int[]A) {

    int n = A.length-1;
    for(int i =1; i<=n; i++) {
      for (int j =1; j<=n; j++) {
        if( j!=i  &&  Math.abs(i-j) == Math.abs(A[i]-A[j])  ) {
          return false;
        }
      }
    }
    return true;
  }

  static void message() {
   System.out.println("Usage: Queens [-v] number");
   System.out.println("Option: -v verbose output, print all solutions");
   System.exit(0);        
  }
 }
