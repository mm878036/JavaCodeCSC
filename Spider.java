package lab05;

public class Spider extends Animal{
    Spider(){
        super(8);
    }
    @Override
    public void eat(){
        System.out.print("Spiders can eat");
    }
}
