import java.util.*;
import java.util.stream.*;
class Solution {
    public static void VowelsInString(){
        int k = 3;
        String sentence = "Motion agency optical animal ability awesome";
        Arrays.stream(sentence.split(" "))
              .filter(c-> countVowelInWord(c)==k)
              .forEach(System.out::println);
    }
    public static long countVowelInWord(String word){
        return word.chars().mapToObj(c-> (char)c)
                    .filter(c-> "aeiouAEIOU".indexOf(c)!=-1)
                    .count();
    }
    public static void main(String[] args) {
        vowelsInString();
    }
}
