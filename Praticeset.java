import java.util.*; 

import java.util.stream.*; 

 
 

public class DataSet { 

    int id; 

    String name; 

    int age; 

    String department; 

    double salary; 

 
 

    // Constructor (used for employees only) 

    DataSet(int id, String name, int age, String department, double salary) { 

        this.id = id; 

        this.name = name; 

        this.age = age; 

        this.department = department; 

        this.salary = salary; 

    } 

 
 

    // ? Getters 

    public int getId() { return id; } 

    public String getName() { return name; } 

    public int getAge() { return age; } 

    public String getDepartment() { return department; } 

    public double getSalary() { return salary; } 

 
 

    // ? Setters 

    public void setId(int id) { this.id = id; } 

    public void setName(String name) { this.name = name; } 

    public void setAge(int age) { this.age = age; } 

    public void setDepartment(String department) { this.department = department; } 

    public void setSalary(double salary) { this.salary = salary; } 

 
 

    @Override 

    public String toString() { 

        return id + " - " + name + " - " + age + " - " + department + " - " + salary; 

    } 

 
 

    // ? Simple numbers dataset 

    public static List<Integer> getNumbers() { 

        return Arrays.asList(1,2,3,4,5,6,7,8,9,10); 

    } 

 
 

    // ? Employees dataset (using same class as Employee) 

    public static List<DataSet> getEmployees() { 

        return Arrays.asList( 

            new DataSet(1, "Alice", 24, "IT", 45000), 

            new DataSet(2, "Bob", 28, "HR", 40000), 

            new DataSet(3, "Charlie", 32, "Finance", 60000), 

            new DataSet(4, "David", 26, "IT", 50000), 

            new DataSet(5, "Eva", 29, "Finance", 70000), 

            new DataSet(6, "Frank", 35, "HR", 55000), 

            new DataSet(7, "Grace", 30, "IT", 65000), 

            new DataSet(8, "Hannah", 27, "Finance", 48000), 

            new DataSet(9, "Ivy", 31, "HR", 52000), 

            new DataSet(10, "Jack", 25, "IT", 47000), 

            new DataSet(9, "Ivy", 31, "HR", 52000), 

            new DataSet(10, "Jack", 25, "IT", 47000) 

        ); 

    } 

 
 

    // Nested dataset: each employee has a list of skills 

    public static List<List<String>> getEmployeeSkills() { 

    return Arrays.asList( 

        Arrays.asList("Java", "Spring", "SQL"),            // Alice 

        Arrays.asList("Communication", "Recruitment"),    // Bob 

        Arrays.asList("Excel", "Finance Analysis"),       // Charlie 

        Arrays.asList("Java", "Spring Boot"),             // David 

        Arrays.asList("Accounting", "Excel"),             // Eva 

        Arrays.asList("Recruitment", "Payroll"),          // Frank 

        Arrays.asList("Java", "Microservices"),           // Grace 

        Arrays.asList("Finance Analysis", "Reporting"),   // Hannah 

        Arrays.asList("HR Policies", "Communication"),    // Ivy 

        Arrays.asList("Java", "SQL")                      // Jack 

    ); 

    } 

 
 
 

    public static void log(String msg){ 

        System.out.println(); 

        System.out.println("LOG "+msg); 

        System.out.println(); 

    } 

 
 

    public static void filterDemo(){ 

        log("filter simple demo"); 

        List<Integer> list = DataSet.getNumbers(); 

        List<Integer> even = list.stream().filter(n->n%2==0).collect(Collectors.toList()); 

        even.forEach(System.out::println); 

 
 

        log("filter object demo"); 

        List<DataSet> dataset = DataSet.getEmployees(); 

        dataset.stream().filter(emp->emp.getSalary()>50000) 

        .forEach(System.out::println); 

    } 

 
 

    public static void mapDemo(){ 

        log("map simple demo"); 

        List<Integer> list = DataSet.getNumbers(); 

        List<Integer> square = list.stream().map(n->n*n).collect(Collectors.toList()); 

        square.forEach(System.out::println); 

 
 

        log("map object demo using lambda"); 

        List<DataSet> dataset = DataSet.getEmployees(); 

        dataset.stream().map(emp->emp.getName().toUpperCase()) 

        .forEach(System.out::println); 

 
 

        log("map object demo using reference"); 

        List<DataSet> dataset2 = DataSet.getEmployees(); 

        dataset2.stream().map(DataSet::getDepartment).map(String::toLowerCase) 

        .forEach(System.out::println); 

    } 

 
 

    public static void flatMapDemo(){ 

        log("flatmap simple demo"); 

        List<List<String>> list = DataSet.getEmployeeSkills(); 

        list.stream().flatMap(List::stream).forEach(System.out::println); 

    } 

 
 

    public static void distinctDemo(){ 

        log("distinct simple demo"); 

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10); 

        list.stream().distinct().forEach(System.out::println); 

 
 

        log("distinct object demo"); 

        List<DataSet> dataset2 = DataSet.getEmployees(); 

        dataset2.stream().distinct().forEach(System.out::println); 

    } 

 
 

    public static void sortedDemo(){ 

        log("sorted simple demo"); 

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10); 

        list.stream().sorted().forEach(System.out::println); 

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); 

 
 

        log("sorted object demo"); 

        List<DataSet> dataset2 = DataSet.getEmployees(); 

        dataset2.stream().sorted(Comparator.comparing(DataSet::getName)).forEach(System.out::println);         

        log(" "); 

        dataset2.stream().sorted(Comparator.comparingDouble(DataSet::getSalary)).forEach(System.out::println); 

        log(" "); 

        dataset2.stream().sorted(Comparator.comparingInt(DataSet::getAge)).forEach(System.out::println); 

        log(" "); 

        dataset2.stream().sorted(Comparator.comparing(DataSet::getName).thenComparing(DataSet::getDepartment)).forEach(System.out::println); 

        log(" "); 

        dataset2.stream().sorted(Comparator.comparingInt(DataSet::getId).thenComparingInt(DataSet::getAge)).forEach(System.out::println); 
    } 

    public static void peekDemo(){
        log("peek object demo"); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        dataset2.stream().peek(e->System.out.println("before map "+e.getName())).map(e->e.getName().toUpperCase()).peek(e->System.out.println("after map "+e)).forEach(System.out::println);
    }

    public static void limitDemo(){
        log("limit custom demo"); 
        List<Integer> list = DataSet.getNumbers(); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        list.stream().limit(4).forEach(System.out::println);
        log("limit object demo");
        dataset2.stream().limit(5).forEach(System.out::println);
    }

    public static void skipDemo(){
        log("skip custom demo"); 
        List<Integer> list = DataSet.getNumbers(); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        list.stream().skip(4).forEach(System.out::println);
        log("skip object demo");
        dataset2.stream().skip(5).forEach(System.out::println);
    }

    public static void mapToIntDemo(){
        log("maptoint custom demo"); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        int sum = dataset2.stream().mapToInt(DataSet::getAge).sum();
        System.out.println(sum);
    }

    public static void mapToDoubleDemo(){
        log("maptodouble custom demo"); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        double avg = dataset2.stream().mapToDouble(DataSet::getSalary).average().orElse(0);
        System.out.println(avg);
    }
 
     public static void asDoubleStreamDemo(){
        log("asDoubleStream custom demo"); 
        List<Integer> list = DataSet.getNumbers(); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        double avg = list.stream().mapToInt(n->n).asDoubleStream().average().orElse(0);
        System.out.println(avg);
        log("asDoubleStream object demo");
        DoubleSummaryStatistics stats =  dataset2.stream().mapToInt(DataSet::getAge).asDoubleStream().summaryStatistics();
        System.out.println(stats);
    }

    public static void unorderedDemo(){
        log("unordered custom demo"); 
        List<Integer> list = DataSet.getNumbers(); 
        List<DataSet> dataset2 = DataSet.getEmployees();
        list.parallelStream().unordered().forEach(System.out::println);
        log("unordered object demo");
        dataset2.parallelStream().unordered().forEach(System.out::println);
    }

    // ? Demo main 

    public static void main(String[] args) { 

        DataSet.filterDemo(); 

        DataSet.mapDemo(); 

        DataSet.flatMapDemo(); 

        DataSet.distinctDemo(); 

        DataSet.sortedDemo(); 

        DataSet.peekDemo();

        DataSet.limitDemo();

        DataSet.skipDemo();

        DataSet.mapToIntDemo();

        DataSet.mapToDoubleDemo();

        DataSet.asDoubleStreamDemo();

        Dataset.unorderedDemo();

    } 

} 

 
 

 
