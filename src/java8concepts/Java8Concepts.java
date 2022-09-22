package java8concepts;

import java.util.Collection;

interface FirstInterface {

     void m1();
}

interface SecondInterface {

    public void add(int a, int b);
}

interface ThirdInterface {

    public String str(String str);
}

public class Java8Concepts  {

    //without using Lambda Expression
    public void m1() {
        System.out.println("first Method");
    }

    //without using Lambda Expression
    public void add(int a, int b) {
        System.out.println("second Method" + " " + a + b);
    }

    //without using Lambda Expression
    public String str(String str) {
        return str;
    }

    public static void main(String[] args) {

        //with Lambda Expression
        FirstInterface firstInterface = () -> {
            System.out.println("with lambda expression");
        };
        firstInterface.m1();

        //with Lambda Expression
        FirstInterface firstInterface1 = () -> System.out.println("with lambda expression");
        firstInterface1.m1();

        //with Lambda Expression
        SecondInterface secondInterface = (int a, int b) -> System.out.println(a + b);
        secondInterface.add(3, 3);

        //with Lambda Expression
        SecondInterface secondInterface1 = (a, b) -> System.out.println(a + b);
        secondInterface1.add(3, 3);

        //with Lambda Expression
        ThirdInterface thirdInterface = (String str) -> {
            System.out.println(str);
            return str;
        };
        thirdInterface.str("test string");
    }

    Collection col;
}
