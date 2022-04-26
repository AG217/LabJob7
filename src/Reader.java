public class Reader extends User implements Readerable{
    public Reader(String function, String name) {
        super(function, name);
    }

    @Override
    public void takeBook(Book... books) {
        System.out. println(this.name +" взял следующие книги:");
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
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean overDue() {
        return true;
    }
    }

