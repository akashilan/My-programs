#include <stdio.h>

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
        //this line is summa
    //this line added temporarily...
    return 0;
}