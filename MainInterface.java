// Interface: Food
interface Food {
    void prepare();  
}

class Pizza implements Food {
    public void prepare() {
        System.out.println("Pizza is being prepared with all toppings.");
    }
}

class Burger implements Food {
    public void prepare() {
        System.out.println("Burger is being prepared with patty and sauce.");
    }  
}

class Pasta implements Food {
    public void prepare() {
        System.out.println("Pasta is being prepared with sauce and cheese.");
    }

}

public class MainInterface {
    public static void main(String[] args) {
        
        Food pizza = new Pizza();
        pizza.prepare();

        System.out.println(); 

        Food burger = new Burger();
        burger.prepare();
       
        System.out.println(); 

        Food pasta = new Pasta();
        pasta.prepare();
       
}
}
