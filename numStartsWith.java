// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;
class Solution {
    public static void findNumberStartsWith(){
        List<Integer> list = Arrays.asList(1,2,3,11,12,112,21,22,122,1234);
        list.stream().map(x->x.toString()).filter(x->x.startsWith("1")).forEach(System.out::println);
    }
    public static void findNumberStartsWith2(){
        List<Integer> list = Arrays.asList(1,2,3,11,12,112,21,22,122,1234);
        List<Integer> list2 = list.stream().filter(n->String.valueOf(n).startsWith("1")).toList();
        System.out.println(list);
    }
    public static void main(String[] args) {
        findNumberStartsWith();
        findNumberStartsWith2();
    }
}
