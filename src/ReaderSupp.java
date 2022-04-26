public class ReaderSupp extends User implements Readerable, Supplierable{
    public ReaderSupp(String function, String name) {
        super(function, name);
    }

    @Override
    public void takeBook(Book... books) {
        System.out. println(this.name +"взял следующие книги:");
        for (Book book : books){
            System.out.println(" " +book.getName());
        }
        System.out.println();
    }

    @Override
    public void returnBook(Book... books) {
        System.out. println(this.name +"вернул следующие книги:");
        for (Book book : books){
            System.out.println(book.getName());
        }
        System.out.println();
    }

    @Override
    public boolean overDue() {
        return false;
    }

    @Override
    public void bringBook() {
        System.out.println(super.function + super.name + " принёс новые книги в библиотеку");
    }
}
