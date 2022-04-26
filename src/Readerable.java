public interface Readerable {

    void takeBook(Book... books);

    void returnBook(Book... books);

    boolean overDue();
}
