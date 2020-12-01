package lab05;

public class TestAnimals{
    public static void main(String[] args)
    {
    Fish d=new Fish();
    Cat c=new Cat("Fluffy");
    Animal a=new Fish();
    Animal e=new Spider();
    Pet p=new Cat();
    
    System.out.println("Living in water");
    a.walk();
    c.walk();
    e.walk();
    d.walk();
    c.eat();
    d.eat();
    a.eat();
    e.eat();
    c.play();
    d.play();
    p.play();
    }
}