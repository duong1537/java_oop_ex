package oopprinciples.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        //lớp con Cat được thừa kế từ lớp Animal nên nó có toàn bộ các thuộc tính từ lớp cha
    }
}
