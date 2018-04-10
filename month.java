public class month{
	public static void main(String args[]){
		int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
		String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<12;i++){
			System.out.println(month[i]+"= "+days[i]);
		}
	}
}