public class BuySell{
	public static void main(String[] args){
		int[] arr={7,1,5,3,6,4,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min) min=arr[i];
			arr[i]-=min;
		}
		int res=0;
		for(int i=0;i<arr.length;i++){
			if(res<arr[i]) res=arr[i];
		}
		System.out.println(res);
	}
}