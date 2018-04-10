class Bank{
	double amount=50;
	Bank(){
		
	}
	Bank(double x){
		//amount=50;
		amount=amount+x;
	}
	public static void main(String args[]){
		Bank ob=new Bank();
		Bank ob2=new Bank(10);
		System.out.println("Without parameter: "+ob.amount);
		System.out.println("With parameter: "+ob2.amount);
	}
}