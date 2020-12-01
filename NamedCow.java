package lab04;

public class NamedCow extends Cow{
    private String myType;
    private String mySound;
    private String myName;
    
    public NamedCow(String name){
        super();
        myName=name;
    }
    public String getName(){
        return myName;
    }
}
