public class DeCode2{
	public static void main(String[] args){
		String str="2265";
		int n=str.length();
		if(n==0 || str.charAt(0)=='0'){
			System.out.println("0");
			return;
		}
		int[] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++){
			int cur=(str.charAt(i-1)-'0');
			int pre=(str.charAt(i-2)-'0')*10+cur;
			if(cur>0) dp[i]+=dp[i-1];
			if(pre>=10 && pre<=26) dp[i]+=dp[i-2];
		}
		System.out.println(dp[n]);		
	}
}