class Area{
	int area(int a){
		return (a*a);
	}
	int area(int l,int b){
		return (l*b);
	}
	
	public static void main(String args[]){
		Area ob =new Area();

		
		System.out.println(ob.area(10));
		System.out.println(ob.area(10,20));
	}
}