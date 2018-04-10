class cube{
	int volume(){
		int height=10,width=10,length=10;
		int volume=height*width*length;
		return volume;
	}
}

class test{
	public static void main(String[] args){
		cube ob= new cube();
		System.out.println(ob.volume());
	}
}