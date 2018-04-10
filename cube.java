class cube{
	void vol(double length,double width,double height){
		double res=length*width*height;
		System.out.println("Volume: "+res);
	}
}
class run{
	public static void main(String args[]){
		cube ob=new cube();
		ob.vol(10,10,10);
		ob.vol(20,12,10);
	}
}