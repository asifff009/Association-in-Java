import java.util.ArrayList;
import java.util.Scanner;

public class Member {
    private int id;
    private String name;
    private String membershipDate;
    private ArrayList<Borrow> borrowList;

    public Member(int id, String name, String membershipDate) {
        this.id = id;
        this.name = name;
        this.membershipDate = membershipDate;
        this.borrowList = new ArrayList<>();
    }

    public void addBorrow(Borrow record) {
        if (borrowList.size() < 3) {
            borrowList.add(record);
        } else {
            System.out.println("Cannot borrow more than 3 books.");
        }
    }

    public void display() {
        System.out.println("\nMember ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Membership Date : " + membershipDate);
        System.out.println("\n--- Borrowed Books ---");
        for (Borrow b : borrowList) {
            b.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Member input
        System.out.print("Enter Member ID: ");
        int memberId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Membership Date: ");
        String membershipDate = sc.nextLine();
        Member member = new Member(memberId, name, membershipDate);

        // Borrow up to 3 books
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nDo you want to borrow book " + i + "? (yes/no): ");
            String choice = sc.nextLine();
            if (!choice.equalsIgnoreCase("yes")) break;

            // Book input
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Book Author: ");
            String author = sc.nextLine();
            Book book = new Book(bookId, title, author);

            // Borrow date input
            System.out.print("Enter Borrow Date: ");
            String borrowDate = sc.nextLine();
            System.out.print("Enter Due Date: ");
            String dueDate = sc.nextLine();

            Borrow borrow = new Borrow(book, borrowDate, dueDate);
            member.addBorrow(borrow);
        }

        // Display member info
        member.display();

        sc.close();
    }
}
