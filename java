Java Code: Sorting a List:
import java.util.*;

public class JavaListSorting {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));

        // Sort the list
        Collections.sort(numbers);

        // Print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}

Java ArrayList:
import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        // Создание ArrayList
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Вывод всех элементов
        System.out.println("ArrayList: " + list);
    }
}

 Java LinkedList:
import java.util.*;

public class JavaLinkedList {
    public static void main(String[] args) {
        // Создание LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Вывод всех элементов
        System.out.println("LinkedList: " + list);
    }
}

Java HashMap:
import java.util.*;

public class JavaHashMap {
    public static void main(String[] args) {
        // Создание HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Python", 8);
        map.put("C++", 7);

        // Вывод всех пар ключ-значение
        System.out.println("HashMap: " + map);
    }
}

Java HashSet:
import java.util.*;

public class JavaHashSet {
    public static void main(String[] args) {
        // Создание HashSet
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");  // Дубли будут проигнорированы

        // Вывод всех элементов
        System.out.println("HashSet: " + set);
    }
}

Java Iterator:
import java.util.*;

public class JavaIterator {
    public static void main(String[] args) {
        // Создание ArrayList
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

        // Получаем итератор
        Iterator<String> iterator = list.iterator();

        // Используем итератор для вывода элементов
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

Java Wrapper Classes:
public class JavaWrapperClasses {
    public static void main(String[] args) {
        // Пример использования Wrapper классов
        int primitive = 100;
        Integer wrapper = Integer.valueOf(primitive);  // Преобразование примитивного типа в объект

        // Вывод значений
        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapper: " + wrapper);
    }
}

Java OOP (Object-Oriented Programming):
// Object-Oriented Programming in Java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class JavaOOP {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
    }
}

 Java Classes/Objects:
 // Example of Class and Object
class Car {
    String model;
    int year;

    // Method to display information
    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class JavaClassesObjects {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car car1 = new Car();
        car1.model = "Toyota";
        car1.year = 2020;

        car1.displayInfo();  // Output: Model: Toyota, Year: 2020
    }
}

Java Class Attributes:
// Class Attributes
class Person {
    String name;  // Class attribute
    int age;      // Class attribute

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class JavaClassAttributes {
    public static void main(String[] args) {
        // Creating a Person object and assigning values to attributes
        Person person = new Person();
        person.name = "Alice";
        person.age = 25;

        person.display();  // Output: Name: Alice, Age: 25
    }
}

Java Class Methods:
// Class Methods
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }
}

public class JavaClassMethods {
    public static void main(String[] args) {
        // Creating a Calculator object
        Calculator calc = new Calculator();

        // Calling methods
        System.out.println("Addition: " + calc.add(5, 3));  // Output: Addition: 8
        System.out.println("Subtraction: " + calc.subtract(5, 3));  // Output: Subtraction: 2
    }
}
Java Constructors:
  // Constructor of the class
class Book {
    String title;
    String author;

    // Constructor to initialize attributes
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class JavaConstructors {
    public static void main(String[] args) {
        // Creating an object using the constructor
        Book book = new Book("Java Programming", "John Doe");

        book.display();  // Output: Title: Java Programming, Author: John Doe
    }
}

Java Modifiers:
  // Access Modifiers and other modifiers
class Employee {
    public String name;  // Accessible everywhere
    private int salary;  // Accessible only within this class
    protected String department;  // Accessible within this class and subclasses

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class JavaModifiers {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John";
        employee.setSalary(50000);

        // Output the details
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}

Java Encapsulation:
// Java Encapsulation Example
class Employee {
    private String name;  // Private attribute
    private int age;      // Private attribute

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class JavaEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John");
        emp.setAge(30);

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}

Java Packages / API:
// Importing the Scanner class from the java.util package
import java.util.Scanner;

public class JavaPackagesAPI {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}

Java Inheritance:
// Java Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class JavaInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks
    }
}

Java Polymorphism:
// Java Polymorphism Example
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class JavaPolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();  // Output: Dog barks
        animal2.sound();  // Output: Cat meows
    }
}

Java Inner Classes
// Java Inner Classes Example
class OuterClass {
    private String message = "Hello from Outer Class";

    class InnerClass {
        void printMessage() {
            System.out.println(message);
        }
    }
}

public class JavaInnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printMessage();  // Output: Hello from Outer Class
    }
}

Java Abstraction
 // Java Abstraction Example
abstract class Animal {
    abstract void sound();  // Abstract method

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class JavaAbstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Dog barks
        dog.breathe();  // Output: Animal is breathing
    }
}

Java Interface:
// Java Interface Example
interface Animal {
    void sound();  // Abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Dog barks
    }
}

Java Enums:
  // Java Enums Example
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class JavaEnums {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);  // Output: Today is: MONDAY
    }
}

Java User Input:
// Java User Input Example
import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);
    }
}

 Java Date:
   // Java Date Example
import java.util.Date;

public class JavaDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date and Time: " + date.toString());
    }
}
