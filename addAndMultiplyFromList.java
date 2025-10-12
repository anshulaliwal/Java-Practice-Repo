import java.util.*;
import java.util.stream.*;
class Solution {
    public static void addAndMultiplyFromList(){
        List<Integer> list = Arrays.asList(10,20,30,40);
        int sum = list.stream().limit(2).mapToInt(Integer::intValue).sum();
        int multiply = list.stream().limit(2).reduce((a,b)->a*b).orElse(0);
        System.out.println(sum);
        System.out.println(multiply);
    }
    public static void main(String[] args) {
        addAndMultiplyFromList();
    }
}
