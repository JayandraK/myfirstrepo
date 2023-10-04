public class Car {
public static void printSpeed(int speed)
{
System.out.println("Speed:"+speed);
}
}
class Demo {
public static void main(String[]args) {
Car car = new Car();
car.printSpeed(100);
}
}

