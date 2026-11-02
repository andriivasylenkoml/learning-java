//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Inheritance
        Dog dog = new Dog();

        dog.eat();
        dog.bark();

        // Dynamic Polymorphism or Runtime Polymorphism
        Animal animal1 = new Dog(); // Animal – Variablentyp
        Animal animal2 = new Cat();
        // Obwohl die Variable den Typ „Animal“ hat, ruft Java die überschriebene Methode des Objekts „Dog“ auf.
        animal1.makeSound();
        animal2.makeSound();

        System.out.printf("\nCompile-time Polymorphism:\n");
        //Static Polymorphism (Compile-time Polymorphism)
        makeAnimalSound(new Dog());
        makeAnimalSound(new Cat());
    }

    //Static Polymorphism (Compile-time Polymorphism)
    static void makeAnimalSound(Animal animal){
        animal.makeSound();
    }
}