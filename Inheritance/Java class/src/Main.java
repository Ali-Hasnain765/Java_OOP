public class Main {
    public static void main(String[] args) {
     Cat cat = new Cat("Tom",3,"Persian");
        System.out.println("Cat info:");
        System.out.println("------------");
     cat.showinfo();

        Dog dog = new Dog("Bob",5,"Husky");
        System.out.println("Dog info:");
        System.out.println("------------");
        dog.showinfo();
    }
}