import java.util.*;
import java.util.stream.*;
class Solution {
    public static void StringStartsWithNum(){
        List<String> list = Arrays.asList("1abc","2abc","abc","3abc");
        list.stream().filter(str-> Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        StringStartsWithNum();
    }
}
