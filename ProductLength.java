package BiWeekly;
import java.util.*;
public class ProductLength {
	public static void main(String args[]) {
		ArrayList<String> li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			li.add(s);
		}
		System.out.println(solve(li));
		sc.close();
	}
	public static int solve(ArrayList<String> words) {
        int res=0;
        for(int i=0;i<words.size();i++){
            int[] arr1=new int[26];
            String str=words.get(i);
            for(int j=0;j<str.length();j++){
                arr1[str.charAt(j)-'a']++;
            }
            outer:for(int j=i+1;j<words.size();j++) {
            	String str2=words.get(j);
            	for(int k=0;k<str2.length();k++) {
            		if(arr1[str2.charAt(k)-'a']!=0) {
            			continue outer;
            		}
            	}
            	int cur=str.length()*str2.length();
            	res=Math.max(cur, res);
            }
        }
        return res;
    }
}
