abstract class Animal {
  Animal(){
    System.out.println("4 footed animal");
    System.out.println("Animal eats");
  }
  abstract void sound();
}
class Dog extends Animal {
  Dog(){
    super();
  }
  void sound() {
    System.out.println("Dog Barks");
  }
}
class Cat extends Animal {
  Cat(){
    super();
  } 
  void sound() {
    System.out.println("Cat Meows");
  }
}

class Abstraction {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    Cat c = new Cat();
    c.sound();
  }  
}
