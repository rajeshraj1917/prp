public class Array9{
public static void main(String args[]){
	int[] arr=new int[args.length];
	for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
	int[] arr1=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]==10))
				{
					arr1[j]=arr[i];
					j++;
				}
		}
	for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
   }
}