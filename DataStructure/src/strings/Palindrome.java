/*
Is it a palindrome? Let's find out.
*/

public class Palindrome {
    
  public static void main(String[] args) {
      
      String str = "racecaar";
      
     System.out.println(isPalindrome(str));
    
  }
  
  static boolean isPalindrome(String str){
      
      int start = 0;
      int end = str.length()-1;
      
      
      while(start<end){
          if(str.charAt(start) != str.charAt(end)) return false;
          start++;
          end--;
      }
      
      return true;
  }
      
}