#include <stdio.h>
#include <math.h>
#define pi 3.14159
float f(float x)
{
	float m=sqrtf(sinf(x));
	return m;
}
int main()
{
	float a=0,b=pi/2,n=8;
	int i=0;
	float h=(b-a)/n;
	float sum=0,x=0;
	for(i=1;i<n;i++)
	{
		x=a+(i*h);
		sum+=2*f(x);
	}
	sum+=f(a)+f(b);
	sum*=h/2;
	printf("%f\n",sum);
	return 0;
}
