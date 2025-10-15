import java.util.*;
import java.util.stream.*;
class Solution {
    public static void FirstNonReapeatingChar(){
        int k = 3;
        String word = "swiss";
        word.chars().mapToObj(c->(char)c)
                    .collect(Collectors.groupingBy(c-> c, LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry-> entry.getValue() == 1)
                    .map(Map.Entry::getKey)
                    .findFirst().ifPresent(System.out::println);
    }
    public static void FirstReapeatingChar(){
        int k = 3;
        String word = "swiss";
        word.chars().mapToObj(c->(char)c)
                    .collect(Collectors.groupingBy(c-> c, LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry-> entry.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .findFirst().ifPresent(System.out::println);
    }

    public static void main(String[] args) {
        FirstNonReapeatingChar();
        FirstReapeatingChar();
    }
}
