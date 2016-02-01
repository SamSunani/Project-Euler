
public class Solution2 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lmao=0;
		lmao = result();
		System.out.println(lmao);
		
	}
	
	private static long fib(int x){
		
		long a = 0;
		long b=1;
		
		for(int i=0; i<x;i++){
			long c=a+b;
			a=b;
			b=c;
			
		}
		
		return a;
		
	}
	
	public static long result(){
		long fibn=0;
		long sum=0;
		
		for(int i=0; ;i++)
		{
			fibn = fib(i);
			
			if(fibn>4000000){
				break;
			}
			if(fibn%2==0){
				sum += fibn;
			}
			
		}
		
		
	return sum;
	}
	

}
