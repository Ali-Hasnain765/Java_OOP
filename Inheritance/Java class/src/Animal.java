public class Animal {
    public String name;
    public int age;
    public String breed;

    public Animal(String n,int a, String b){
        name=n;
        age=a;
        breed=b;
    }
    public void showinfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Breed:"+breed);
    }

}
