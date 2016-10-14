/* Sphere.c */

#include<stdio.h>
#include<stdlib.h>

int main(void) {
  const double pi= 3.141592654;
  double volume,area,r;
  
  printf("Enter the radius of the sphere: ");
  scanf(" %lf",&r);
  volume = (4.0/3)*pi*(r*r*r);
  area = 4.0*pi*(r*r); 
  printf("The volume is %lf",volume);
  printf(" and the surface area is %lf.\n", area);

  return 0;
}

