/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
// #define x 5+2

int main()
{
    int s, n, m;
    scanf("%d %d %d", &s, &n, &m);
    if(n < m){
        printf("not possible");
    }else if(n == m){
        printf("%d", s);
    }else{
        if(s%(n/m) == 0){
            printf("%d", s/(n/m));
        }else{
            
            printf("%d", (s/(n/m))+1);
        }
    }

    return 0;
}