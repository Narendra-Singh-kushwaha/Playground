#include<stdio.h>
int main()
{
  int a,n;
  scanf("%d ",&n);
  a=(((n%10000)%1000)%100)/10;
  printf("%d",a);
  return 0;
}