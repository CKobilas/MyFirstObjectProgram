import java.util.*;

public class Main {
  public static void main(String[] args) {

    Fan fan1 = new Fan(); // first fan
    fan1.setSpeed(3);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);

    Fan fan2 = new Fan(); // second fan
    fan2.setSpeed(2);
    fan2.setRadius(5);
    fan2.setColor("blue");
    fan2.setOn(false);

    System.out.println(fan1.toString()); // print details of both fans
    System.out.println(fan2.toString());
  }
}