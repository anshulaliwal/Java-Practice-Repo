import java.util.*;
import java.util.stream.*;
class Solution {
    public static void StringPrefixSuffix(){
        List<String> list = Arrays.asList("Anshul","Aliwal","Bittu");
        String names = list.stream().map(n-> "["+n+"]").collect(Collectors.joining(","));
        String names2 = list.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(names);
        System.out.println(names2);
    }
    public static void main(String[] args) {
        StringPrefixSuffix();
    }
}
