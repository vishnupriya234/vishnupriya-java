// Parent class
class Vehicle{
void run(){
System.out.print("Vehicle is running");
}
}
//child class 
class Car extends Vehicle{
//overriding the run() method
@Override
void run(){
System.out.println("car is running safely");
}
}
//Main class 
public class MethodOverridingDemo{
public static void main (String[]args){
Vehicle v= new Vehicle();
v.run();
Car c = new Car();
c.run();
//Runtime polymorphism 
Vehicle obj = new Car();
obj.run();
}
}
