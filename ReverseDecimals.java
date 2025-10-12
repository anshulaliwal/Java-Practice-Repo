import java.util.*;
import java.util.stream.*;
class Solution {
    public static void revDecimals(){
        List<Double> list = Arrays.asList(2.4,5.5,7.2,1.7,9.5);
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
   
    public static void main(String[] args) {
        revDecimals();
    }
}
