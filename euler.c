#include <stdio.h>
double fx(double x,double y){
	double f=x-y;
	return f;
}
int main(){
	double x=0,y=1,h=0.2,x2=0.6,i,b;
	double n=(x2-x)/h;
	for(i=0;i<=n;i++){
		b=fx(x,y);
		y=y+(h*b);
		x=x+h;
	}
	printf("%f\n",y);
}