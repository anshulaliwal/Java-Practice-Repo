import java.util.*;
import java.util.stream.*;
class Solution {
    public static void joinTwoStream(){
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        Stream<Integer> joined = Stream.concat(list.stream(),list2.stream());
        joined.forEach(System.out::println);
    }
    public static void joinTwoStreamAndSort(){
        List<Integer> list = Arrays.asList(3,2,1);
        List<Integer> list2 = Arrays.asList(6,5,4);
        List<Integer> joined = Stream.concat(list.stream(),list2.stream()).sorted().toList();
        System.out.println(joined);
    }
    public static void main(String[] args) {
        joinTwoStream();
        joinTwoStreamAndSort();
    }
}
