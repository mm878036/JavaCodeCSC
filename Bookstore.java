
package lab.pkg3;

public class Bookstore {

    private final Book[] books;
    private int totalbooks;
    private double gross;
    private final static int MAXNUMOFBOOKS = 1000;

    /**
     * Creates an empty BookStore object.
     */
    public Bookstore() {  
        books= new Book[MAXNUMOFBOOKS];
        totalbooks=0;
        gross=0.0;
    }

    /**
     * Adds a new book to this bookstore.
     *
     * @param b the book to add
     */
    public void addNewBook(Book b) {     
	if(totalbooks<books.length) {
            books[totalbooks]=b;
            totalbooks++;
        }
        else{
            System.out.println("Sorry, book cannot be added to stock.");
        }
    }

    /**
     * Adds a certain quantity of a book already in stock.
     *
     * @param title the title of the the book
     * @param quantity amount of copies to add
     */
    public void addBookQuantity(String title, int quantity) {
        for(int i=0;i<totalbooks;i++){
            if(title == books[i].getTitle()){
                books[i].addQuantity(quantity);
                System.out.println("Quantity added successfully");
                return;
            }
    }  
    }

    /**
     * Checks if at least a certain number of copies of a particular book are in
     * stock. Note: You can use this method to check if a book is already in the
     * bookstore. This way, you won't create duplicate records of the same book.
     *
     * @param title the title of the book to search for
     * @param quantity the desired number of copies
     * @return 
     * @returns true if title exists with specified quantity; otherwise false
     */
    public boolean inStock(String title, int quantity) {
        for(int i=0; i<totalbooks;i++){
            if(title.equals(books[i].getTitle())){
                if(quantity<= books[i].getQuantity()) {return true;}
                else {return false;}
            }
        }
        return false;
    }

    /**
     * Sells a particular number of copies of a certain book. If successful
     * (i.e. enough books are in stock to sell), the quantity of the book is
     * adjusted. Otherwise, no books are sold.
     *
     * @param title the title of the book to sell
     * @param quantity the amount of books to sell
     * @return 
     * @returns true if successful; otherwise false
     */
    public boolean sellBook(String title, int quantity) {
        int i;
            boolean sell=false;
            boolean retreival = inStock(title,quantity);
            if (retreival){
                for(i=0; i<totalbooks && !sell; i++){
                    if(title.equals(books[i].getTitle())){
                     books[i].subtractQuantity(quantity);
                     gross += (books[i].getPrice())*quantity;
                     sell=true;
                    }
                }
            }
            return retreival;
    }
    

    /**
     * Lists information about each book in the bookstore
     */
    public void listBooks() {	
	int i;

        System.out.println("List of Books");
        for(i=0;i<totalbooks;i++){
            System.out.println(books[i]);
        }
        System.out.println();
    }

    /**
     * Lists the titles of all the books in the bookstore
     */
    public void listTitles() {
	for(int i =0;i<totalbooks;i++){
            System.out.println(books[i].getTitle());
        }
    }

    /**
     * Returns the gross income of this bookstore.
     *
     * @return 
     * @returns gross income
     */
    public double getIncome() {
	return gross;
    }
}

