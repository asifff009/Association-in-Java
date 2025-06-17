public class Borrow {
    private String borrowDate;
    private String dueDate;
    private Book book;

    public Borrow(Book book, String borrowDate, String dueDate) {
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public void setBorrowDate(String date) {
        this.borrowDate = date;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setDueDate(String date) {
        this.dueDate = date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void display() {
        System.out.println("Borrow Date: " + borrowDate);
        System.out.println("Due Date: " + dueDate);
        book.display();
    }
}