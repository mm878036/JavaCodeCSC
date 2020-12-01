package lab04;

public class Chick implements Animal {
    private String myType;
    private String mySound;
    private boolean confused;
    
    public Chick(){
        myType="chick";
        mySound="cheep";
        confused=false;
    }
    public Chick(boolean confused){
        myType="chick";
        mySound="cheep";
        this.confused=confused;
    }
    public String getSound(){
        if(confused){
            if(Math.random()<.5)
                return"cluck";
            else
                return mySound;
        }
        else
        return mySound;
    }
    public String getType(){
        return myType;
    }    
}
