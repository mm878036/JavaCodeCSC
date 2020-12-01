package lab04;

public class Dog implements Animal {
    private String myType;
    private String mySound;
    
    public Dog(){
        myType="dog";
        mySound="woof";
    }
    public String getSound(){
        return mySound;
    }
    public String getType(){
        return myType;
    }    
}
