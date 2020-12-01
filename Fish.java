package lab05;
public class Fish extends Animal implements Pet{
    public String name;
    public Fish(){
        super(0);
    }   
    @Override
    public String getName(){
        return name;
    }   
    @Override
    public void setName(String name){
        this.name=name;
    }   
    @Override
    public void play(){
    }   
    @Override
    public void walk(){
    System.out.println("Fish can't walk and do not have legs.");
    }
    @Override
    public void eat(){
    }
}
