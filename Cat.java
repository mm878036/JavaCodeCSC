package lab05;
public class Cat extends Animal implements Pet{
    public String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        super(4);
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
    public void eat(){
    }           
}
