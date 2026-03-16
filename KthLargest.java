package BiWeekly;
import java.util.*;
public class KthLargest {
	public static void main(String args[]) {
		ArrayList<Integer> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			li.add(a);
		}
		int k=sc.nextInt();
		System.out.println(solve(li,k));
		sc.close();
	}
	public static int solve(ArrayList<Integer> nums, int k) {
		 int n=nums.size();
		 boolean[] arr=new boolean[n];
	        int i=1;
	        while(i<=k){
	            int max=Integer.MIN_VALUE;
	            int idx=0;
	            for(int j=0;j<n;j++){
	                if(nums.get(j)>max && !arr[j]){
	                    max=nums.get(j);
	                    idx=j;
	                }
	            }
	            if(i==k) return max;
	            arr[idx]=true;
	            i++;
	        }
	        return 0;
    }
}
