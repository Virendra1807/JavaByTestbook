import java.util.HashMap;
import java.util.Scanner;


public class library {
    static HashMap<String, Integer> listOfBooks = new HashMap<String, Integer>();

    public static void addBook(String bookname) {
        System.out.println();
        listOfBooks.put(bookname, 1);
        System.out.println("************ Book added! ************");
    }

    public static void displayAllBooks() {
        System.out.println("\n ************ All Books List ************ ");
        for (String i : listOfBooks.keySet()) {
            System.out.println(i);
        }
    }

    public static void displayAvailableBooks() {
        System.out.println("\n ************ Available Books List ************ ");
        for (String i : listOfBooks.keySet()) {
            if (listOfBooks.get(i) == 1) {
                System.out.println(i);
            }
        }
    }

    public static void borrowBook(String bookname) {
        for (String i : listOfBooks.keySet()) {
            System.out.println();
            if (i.equals(bookname)) {
                if(listOfBooks.get(i) == 1){
                    System.out.println("************ You have Borrowed the " + bookname + " book ************");
                    listOfBooks.put(i, 0);
                    return;
                }else{
                    System.out.println("************ Sorry the book " + bookname + " is out of stock. Comeback later! ************");
                    return;
                }  
            }
        }
        System.out.println("************ Sorry the book " + bookname + " is not in Stock. We will add it later ! ************");
    }

    public static void returnBook(String bookname) {

        if (listOfBooks.containsKey(bookname)) {

            if (listOfBooks.get(bookname) == 0) {
                listOfBooks.put(bookname, 1);
                System.out.println("************ Thank you for returning the book: " + bookname + " ************");
            } else {
                System.out.println("************ This book is not currently borrowed. ************");
            }

        } else {
            System.out.println("************ Sorry the book " + bookname + " doesn't exist ************");
        }
    }

    public static void main(String[] args) {
        // Book book1 = new Book("Harry Potter");
        // System.out.println(book1.bookname);

        addBook("The Secret");
        addBook("The angel next door");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Choose your option");
            System.out.println("1.Add a book");
            System.out.println("2.Borrow a book");
            System.out.println("3.Return a book");
            System.out.println("4.Display all books");
            System.out.println("5.Display available books");
            System.out.println("6.exit");
            System.out.print("Choose an Option : ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Book name?");
                    String bookname = sc.nextLine();
                    if (bookname != "") {
                        addBook(bookname);
                    }
                    break;
                case 2:
                    System.out.println("Book name?");
                    String bookToBorrow = sc.nextLine();
                    borrowBook(bookToBorrow);
                    break;
                case 3:
                    System.out.println("Book name?");
                    String bookToReturn = sc.nextLine();
                    returnBook(bookToReturn);
                    break;
                case 4:
                    displayAllBooks();
                    break;
                case 5:
                    displayAvailableBooks();
                    break;
                case 6:
                    System.out.println("Exiting from library management system!");
                    return;

            }
        }
    }
}
