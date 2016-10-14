
  /* lawn.java
   * Nivetha Sivaprakasam
   * nsivapra
   * pa1
   * Uses user input to calculate area of lawn, and mowing time.
   */
  
 import java.util.Scanner;
    
 class lawn{  

   public static void main( String[] args ) {
 
    double lengthl,widthl,length,width,area,areal,areah,rate;
    int hour,minute,second;
    String h,m,s;
    Scanner sc = new Scanner(System.in);

    lengthl = sc.nextDouble();
    widthl = sc.nextDouble();
    length = sc.nextDouble();
    width = sc.nextDouble();
    areal = widthl * lengthl;
    areah = width * length;
    area = areal-areah;
    System.out.print("The lawn area is ");
    System.out.println(area + " square feet.");
    rate = sc.nextDouble();
    second  = (int)Math.round(area/rate);
    minute = second/60;
    second = second%60;
    hour = minute/60;
    minute = minute%60;

    if( second==1 && hour==1 && minute==1) { 
    System.out.print("The mowing time is ");
    System.out.println(hour+" hour "+minute+" minute "+second+" second. ");
    } else if (second ==1 && hour==1) { 
    System.out.print("The mowing time is ");
    System.out.println(hour+" hour "+minute+" minutes "+second+" second. ");
    } else if (second==1 && minute==1) {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hours "+minute+" minute "+second+" second. ");
    } else if (hour==1 && minute==1 ) {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hour "+minute+" minute "+second+" seconds. ");
    } else if (second==1) {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hours "+minute+" minutes "+second+" second. ");
    } else if (hour==1) {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hour "+minute+" minutes "+second+" seconds. ");
    } else if (minute==1) {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hours "+minute+" minute "+second+" seconds. ");
    } else {
    System.out.print("The mowing time is ");
    System.out.println(hour+" hours "+minute+" minutes "+second+" seconds. ");
  } 
 }
}
 
