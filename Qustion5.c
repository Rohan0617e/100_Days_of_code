#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    int n, i;
    n = 5;
    int arr[n];
    int sum = 0;
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        sum = sum + arr[i];
    }
    
    
    printf("%d", sum);
    // Complete the code to calculate the sum of the five digits on n.
    return 0;
}

/*
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
scanf("%d", &n);
int digit, temp, sum = 0;
temp = n;
//Complete the code to calculate the sum of the five digits on n.
while (n>0) {
        sum += (n%10);
        n=n/10;
    }
printf("%d\n",sum);
return 0;
}
*/