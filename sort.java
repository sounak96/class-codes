public class sort{
	public static void main(String args[]){
		int arr[]={8,4,7,3,1,9,8,4};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=(arr.length-1);j++){
				if(arr[i]<arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		//System.out.println();
	}
	
}
