package stringnew;

import java.util.Arrays;

public class StringReverse {

	public static void main() {

		String str = "Hello World 123";
		char[] cArray = str.toCharArray();
		reverse(cArray);
		System.out.println(Arrays.toString(cArray));

	}

	static void reverse(char[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			char temp = arr[end];
			arr[end]=arr[start];
			arr[start] = temp;
			
			start++;
			end--;
			
		}
		

	}

}
