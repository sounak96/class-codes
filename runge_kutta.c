#include <stdio.h>
double fx(double x,double y){
	double f=x+y;
	return f;
}
int main(){
	double x=0,y=1,h=0.1,x2=1.0,i,k1,k2,k3,k4,k;
	double n=(x2-x)/h;
	for(i=1;i<=n;i++){
		k1=h*fx(x,y);
		k2=h*fx((x+(h/2)),(y+(k1/2)));
		k3=h*fx((x+(h/2)),(y+(k2/2)));
		k4=h*fx((x+h),(y+k3));
		k=(k1+(k2+k3)*2+k4)/6;
		y=y+k;
		x=x+h;
	}
	printf("%f\n",y);
}