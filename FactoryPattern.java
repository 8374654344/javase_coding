/* create the interface */
/* create implementation classes */
/* create factory class */
/* use the factory class in some class */

Interface Animal {
void speak();
}
public class Dog implements Animal {
  void speak() {
    System.out.println("bow bow");
  }
}
public class Cat implements Animal {
  void speak() {
    System.out.println("mew mew");
  }
}
public class Factory {
   Animal dogFactory() {
     return new Dog();
   }
  Animal catFactory() {
    return new Cat();
  }
}

public class Main {
  public static void main(String[] args){
    Factory factory = new Factory();
    Animal dog = factory.dogFactory();
    Animal cat = factory.catFactory();
    dog.speak();
    cat.speak();
}











