public final class Solution4{
	
	public static void main(String[] args) {
		System.out.println(new Solution4().run());
	}
	
	
	public String run() {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				if (isPalindrome(prod) && prod > maxPalin)
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}
	
	
	// Tests whether the given integer is a palindrome in decimal (base 10).
	public static boolean isPalindrome(int x){
		String oldS = Integer.toString(x);
	return oldS.equals(new StringBuilder(oldS).reverse().toString());
	}
	


}