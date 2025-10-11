import java.util.*;
import java.util.stream.*;
class Solution {
    public static void removeDuplicatesPreserveOrder(){
        List<String> list = Arrays.asList("anshul","rishu","aman","anshul");
        list.stream().distinct().forEach(System.out::println);
    }
    public static void removeDuplicates(){
        List<String> list = Arrays.asList("anshul","rishu","aman","anshul");
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
    }
    public static void main(String[] args) {
        removeDuplicatesPreserveOrder();
        removeDuplicates();
    }
}
