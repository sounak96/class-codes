import java.util.*;
class sort
{
	public static void main(String args[])
	{
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all the elements : ");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("Ascending Order : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	
}
