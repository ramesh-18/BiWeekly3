public class CloseSum{
	public static void main(String[] args){
		int[] arr={0,0,0};
		int target=1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int cur=0;
		for(int i=0;i<3;i++){
			cur+=arr[i];
		}
		int res=cur;
		for(int i=1;i<=arr.length-3;i++){
			cur-=arr[i-1];
			cur+=arr[i+2];
			if(Math.abs(Math.abs(target)-Math.abs(cur))<Math.abs(Math.abs(target)-Math.abs(res))) res=cur;
		}
		System.out.println(res);
	}
}