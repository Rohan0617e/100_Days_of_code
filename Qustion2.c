#include <stdio.h>


int main()
{   
    int a,b;
    float c,d;
    
	scanf("%d%d", &a,&b);
    printf("%d\t%d\n",a+b,a-b);
    
    scanf("%f%f",&c,&d);
    printf("%.1f\t%.1f",c+d,c-d);
    
    return 0;
}