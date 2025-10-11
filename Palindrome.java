import java.util.*;
import java.util.stream.*;
class Solution {
    public static void palindrome(){
        String name = "madam";
        System.out.println(isPalindrome(name));
        System.out.println(isPalindrome2(name));
    }
    public static void palindrome2(){
        List<String> words = Arrays.asList(
        "madam",     // palindrome
        "racecar",   // palindrome
        "level",     // palindrome
        "hello",     // not
        "world",     // not
        "noon",      // palindrome
        "java",      // not
        "civic"      // palindrome
        );
        List<String> palindrome = words.stream().filter(Solution::isPalindrome2).toList();
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s){
        int size = s.length();
        for(int i=0; i<size/2; i++){
            if(s.charAt(i)!= s.charAt(size-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(String name){
        int size = name.length();
        return IntStream.rangeClosed(0,size/2).allMatch(n-> name.charAt(n) == name.charAt(size-1-n));
    }
    public static void main(String[] args) {
        palindrome();
        palindrome2();
    }
}
