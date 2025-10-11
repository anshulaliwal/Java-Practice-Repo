import java.util.*;
import java.util.stream.*;
class Solution {
    public static void listContainsPrimeOrNot(){
        List<Integer> list = Arrays.asList(4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20);
        boolean containsPrime = list.stream().anyMatch(Solution::isPrime2);
        System.out.println("the list has prime number - "+ containsPrime);
    }
    public static void findAllPrimes(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        list.stream().filter(Solution::isPrime2).forEach(System.out::println);
    }
    public static boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i ==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime2(int num){
        if(num<=1)
            return false;
        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(i->num%i==0);
    }
    
    public static void main(String[] args) {
        listContainsPrimeOrNot();
        findAllPrimes();
    }
}
