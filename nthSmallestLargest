import java.util.*;
import java.util.stream.*;
class Solution {
    public static void nthSmallest(){
        int[] arr = {20,30,50,10,60};
        int n = 4;
        Arrays.stream(arr).sorted().skip(n-1).findFirst().ifPresent(System.out::println);   
    }
    public static void nthLargest(){
        int[] arr = {20,30,50,10,60};
        int n = 1;
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().ifPresent(System.out::println);   
    }
    public static void main(String[] args) {
        nthSmallest();
        nthLargest();
    }
}
