#include <stdio.h>
float f(float x)
{
	float m=1/(1+(x*x));
	return m;
}
int main()
{
	float a=0,b=6,n=6;
	float h=(b-a)/n;
	float sum=0,x=0;
	int i=0;
	for(i=1;i<n;i++)
	{
		x=a+(i*h);
		if((i%2)==0)
		sum+=2*f(x);
		else
		sum+=4*f(x);
	}
	sum+=f(a)+f(b);
	sum*=h/3;
	printf("%f\n",sum);
}
