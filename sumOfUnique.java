import java.util.*;
import java.util.stream.*;
class Solution {
    public static void sumOfUnique(){
        List<Integer> list = Arrays.asList(10,20,30,40,10,20);
        int sum = list.stream().distinct().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfUnique();
    }
}
