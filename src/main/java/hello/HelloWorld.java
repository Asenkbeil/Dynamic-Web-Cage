package hello;

public class HelloWorld {
  public static void main(String[] args) {
    //LocalTime currentTime = new LocalTime();
    //System.out.println("The current time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}