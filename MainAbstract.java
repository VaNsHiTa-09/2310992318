// Abstract class
abstract class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow says: Moo Moo!");
    }
} 
public class MainAbstract{
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();  
        dog.sound();   

        System.out.println();

        Animal cat = new Cat();
        cat.eat();    
        cat.sound();   

        Animal cow = new Cow();
        cow.eat();
        cow.sound();
    }
}
