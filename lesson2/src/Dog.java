//Inheritance
public class Dog extends Animal{
    void bark(){
        System.out.println("Woof!");
    }

    //Dynamic Polymorphism or Runtime Polymorphism
    @Override
    void makeSound(){
        System.out.println("WOOF!");
    }
}
