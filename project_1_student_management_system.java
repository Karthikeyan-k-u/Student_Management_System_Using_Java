import java.util.*;

class book {
    String name;
    String author;
    String type;
    String price;
    String buy;

    book(String name, String author, String type, String price, String buy) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.buy = buy;
    }

    void details() {
        System.out.println("Book Name   : " + name);
        System.out.println("Author Name : " + author);
        System.out.println("Book Type   : " + type);
        System.out.println("Book Price  : " + price);
        System.out.println("Book Status : " + buy);
        System.out.println("..................................");
    }
}

public class project_2_library_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the book details in the format: name,author,type,price,buy/return");
        book[] books = new book[n];
        for (int i = 0; i < n; i++) {
            String bk = sc.nextLine();
            String[] bookinfo = bk.split(",");
            books[i] = new book(bookinfo[0],bookinfo[1],bookinfo[2],bookinfo[3],bookinfo[4]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Book code = " + ("10025"+(i + 1)) + "\n Details:");
            books[i].details();
        }
        sc.close();
    }
}

