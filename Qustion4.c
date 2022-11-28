#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

/*For each integer  in the interval  (given as input) :
If , then print the English representation of it in lowercase. That is "one" for , "two" for , and so on.
Else if  and it is an even number, then print "even".
Else if  and it is an odd number, then print "odd".
Input Format
The first line contains an integer, . 
The seond line contains an integer, .
Constraints

Output Format
Print the appropriate English representation,even, or odd, based on the conditions described in the 'task' section.
Note: */

int main() 
{
    int a, b, n;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.
    char arr[10]={"Zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    for (n = a; n <=b; n++)
    {
        if(n>9){
            if(n % 2 == 0)
        printf("%d is even.", b);
    else
        printf("%d is odd.", b);
        }
        else{
            puts(arr[n]);
        }
    }
    return 0;
}

