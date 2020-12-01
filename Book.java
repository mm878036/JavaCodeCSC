
package lab.pkg3;

/**
 *
 * @author Matt Minchhoff
 */
public class Book {
    private String title;
    private final int numOfPages;
    private double price;
    private int quantity;   

    /**
     *
     * @param title
     * @param numOfPages
     * @param price
     * @param quantity
     */
    public Book (String title, int numOfPages, double price, int quantity){
        this.title=title;
        this.numOfPages=numOfPages;
        this.price=price;
        this.quantity=quantity;
    }

    Book(String title, int pages, int quantity, double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getTitle(){
        return title;
       }
        public void setTitle(String title){
            this.title=title;
        }
    
    public double getPrice(){
        return price;
    }
    public void getPrice(double price){
            this.price=price;
        }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
            this.quantity=quantity;
        }


    @Override
    public String toString(){
        return "Title: " + title + "\nNumber of pages: " + 
                numOfPages + "\nPrice:" + price +"\nQuantity: " + quantity + "\n";
    }
    public void subtractQuantity(int amount){
        if(amount>0 && quantity>= amount)
        quantity=- amount;  
    }
    public void addQuantity (int amount){
        if(amount>0)
        quantity=+amount;
    }
}