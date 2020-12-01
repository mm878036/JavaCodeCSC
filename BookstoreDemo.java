//Matt Minchhoff CSC 240_01, Lab 3
package lab.pkg3;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author mcmin
 */
public class BookstoreDemo {
    private static int temp;
    private static int quantity;
    private static String title;
    private static String store;
    private static double cost;
    private static int gross;
    private static boolean quit;
    
    public static void main(String[] args){
        Bookstore myBookStore=new Bookstore();
        
        
        int y=1;
        
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("[][]                                            [][]");
        System.out.println("[][]         Welcome to WCUPA Bookstore!        [][]");
        System.out.println("[][]                                            [][]");
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][]");        
        
        do{
            System.out.println("==============================================");
            System.out.println("What would you like to do today?");
            System.out.println("    1) Add a book to the stock");
            System.out.println("    2) Sell a book in stock");
            System.out.println("    3) List the titles of books in stock");
            System.out.println("    4) List all info about books in stock");
            System.out.println("    5) Print out gross income");
            System.out.println("    6) Quit");
            System.out.println();
            System.out.println("Enter choice[1-6]:");
            System.out.println("==============================================");
            Scanner sc=new Scanner(System.in);
            
            try{
                temp = sc.nextInt();
            }
            catch(InputMismatchException nfe){
                }
            System.out.println("==============================================");
            
            switch (temp) {
                case 1: System.out.println("Enter a title");
                String title;
                title = sc.next();
                if(myBookStore.inStock(title,y)){
                    System.out.println("How many more should be added to stock");
                    quantity=sc.nextInt();
                    myBookStore.addBookQuantity(title,y);
                }
                else{
                    System.out.println("Enter the number of pages");
                    int pages=sc.nextInt();
                    System.out.println("Enter the price");
                    double price;
                price = sc.nextDouble();
                    System.out.println("Enter the quantity of books to add");
                    int quantity=sc.nextInt();
                    if(quantity>1000){
                        System.out.println("Cannot hold that many books, try again.");
                        System.out.println("==============================================");
                        break;
                    }
                    
                    
                    Book b = new Book(title,pages,quantity, price);
                    myBookStore.addNewBook(b);
                    
                }
                
                break;


                case 2: System.out.println("Enter title to purchase");
                String str;
                str = sc.next();
                myBookStore.sellBook(str,y);
                System.out.print("How many copies to sell?");
                String subtractQuantity=sc.next();
                if(myBookStore.sellBook(str,quantity)){
                   System.out.println("Success! You have sold"+quantity+"copie(s) of"+str); 
                }
                else{
                    System.out.println("Book is not in stock");
                }
                break;
                case 3: 
                System.out.println("Titles of Books");
                System.out.println("===============");
                myBookStore.listTitles();          
                break;
                case 4:
                System.out.println("List of Books");
                myBookStore.listBooks();
                break;
                case 5:
                System.out.println("Gross Income: $"+myBookStore.getIncome());
                break;
                case 6: System.out.println("We hope to see you again!");
                quit = true;
                break;
                default: System.out.println("Invalid Input");
            }
            
        }
        while(!quit);
    }
}