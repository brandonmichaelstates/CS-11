import java.util.*;

class Queen {

      public static void main( String[] args ){
        int resultNumber;
        int queensNumber;
        int resultArrayCounter;

        if (args.length > 0) {
        if (args[0].equals("-v")) {
          if (isInteger(args[1]) == true) {
            queensNumber = Integer.parseInt(args[1]);

            int[] iSide = new int[queensNumber+1];

            resultNumber = queensNumber;
            for (int i = queensNumber-1; i > 0; i--) {
              resultNumber =  resultNumber*i;
            }
            int[][] resultArray = new int[resultNumber][queensNumber+1];
            resultArrayCounter = 0;

            for (int i = 1; i <= queensNumber; i++) {
              iSide[i] = i;
            }

            if (isSolution(iSide) == true) {
              for (int i = 1; i <= queensNumber; i++) {
                resultArray[resultArrayCounter][i] = iSide[i];
              }
              resultArrayCounter++;
            }

            for (int i = resultNumber; i > 0; i--) {
              nextPermutation(iSide);
              if (isSolution(iSide) == true) {
                for (int a = 1; a <= queensNumber; a++) {
                  resultArray[resultArrayCounter][a] = iSide[a];
                }
                resultArrayCounter++;
              }
            }

            if (resultArrayCounter != 0) {
              for (int i = 0; i < resultArrayCounter; i++) {
                printArrayLine(resultArray,i);
              }
              System.out.println(queensNumber + "-Queens has " + resultArrayCounter + " solutions");
              System.exit(0);
            } else {
              System.out.println(queensNumber + "-Queens has no solutions");
              System.exit(0);
            }
          } else {
            printHelp();
          }

        } else if (isInteger(args[0]) == true) { 
          queensNumber = Integer.parseInt(args[0]);

          int[] iSide = new int[queensNumber+1];

          resultNumber = queensNumber;
          for (int i = queensNumber-1; i > 0; i--) {
            resultNumber =  resultNumber*i;
          }
          resultArrayCounter = 0;

          for (int i = 1; i <= queensNumber; i++) {
            iSide[i] = i;
          }

          if (isSolution(iSide) == true) {
            resultArrayCounter++;
          }
                
          for (int i = resultNumber; i > 0; i--) {
            nextPermutation(iSide);
            if (isSolution(iSide) == true) {
              resultArrayCounter++;
            }
          }

          if (resultArrayCounter != 0) {
            System.out.println(queensNumber + "-Queens has " + resultArrayCounter + " solutions");
            System.exit(0);
          } else {
            System.out.println(queensNumber + "-Queens has no solutions.");
            System.exit(0);
          }

        } else {
          printHelp();
        }
      } else {
        printHelp();
      }
      }

      static void printArrayLine(int[][] A, int line) {
        System.out.print("(");
          for (int i = 1; i <= A[line].length-1; i++) {
            System.out.print(A[line][i]);
            if (i < A[line].length-1) {
              System.out.print(", ");
            } else {
              System.out.println(")");
            }
          }
      }
    
      static void nextPermutation(int[] A){
        int temp1 = A[A.length-1];
        int pivot = 0;
        int successor = 0;
        int temp2 = 0;
        int temp3 = 0;
        int pivotPos = A.length-1;
        int successorPos = A.length-1;
        for (int i = A.length-1; i >= 1; i--) {
          if (A[i] < temp1) {
            pivot = A[i];
            pivotPos = i;
            break;
          } else {
            temp1 = A[i];
          }
        }
        if (pivot == 0) {
          temp2 = 1;
          temp3 = A.length-1;
          while (temp2 < temp3) {
            swap(A,temp2,temp3);
            temp2++;
            temp3--;
          }
          return;
        }
        for (int i = A.length-1; i >= 1; i--) {
          if (A[i] > pivot) {
            successor = A[i];
            successorPos = i;
            break;
          }
        }
        swap(A,pivotPos,successorPos);
        if (pivotPos != A.length-1) {
          temp2 = pivotPos+1;
          temp3 = A.length-1;
          while (temp2 < temp3) {
            swap(A,temp2,temp3);
            temp2++;
            temp3--;
          }
        }
      return;
      }


      static void swap(int[] data, int i, int j){
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }

      static boolean isSolution(int[] A){
        int var1;
        int var2;
        boolean allGood = true;
        for (int i = 1; i <= A.length-1; i++) {
          for (int a = 1; a <= A.length-1; a++){
            if (a == i) {
              continue;
            } else if (a != i) {
              var1 = Math.abs(i - a);
              var2 = Math.abs(A[i] - A[a]);
              if (var1 == var2) {
                allGood = false;
              }
            }
          }
        }
        if (allGood == true) {
          return(true);
        } else {
          return(false);
        }
      }

      public static boolean isInteger(String s) {
        try { 
          Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
          return false; 
        }
        return true;
      }

      static void printHelp() {
        System.out.println("Usage: Queens [-v] number");
        System.out.println("Option: -v verbose output, print all solutions");
        System.exit(0);
      }
}
