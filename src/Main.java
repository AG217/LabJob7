public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Идиот");
        Book book2 = new Book("Преступление и наказание");
        Book book3 = new Book("Король Артур");
        Book book4 = new Book("Спартак");
        Book[] books = {book1, book2, book3, book4};


        Admin admin = new Admin(" Администратор ", "Ирина ");
        Reader reader = new Reader(" Читатель ", "Борис ");
        Supplier supplier = new Supplier(" Поставщик ", "Гена ");
        Librarian librarian = new Librarian(" Библиотекарь", "Лариса ");
        ReaderSupp readerSupp = new ReaderSupp("Читатель", "Гена ");

        librarian.orderBook(supplier);
        supplier.bringBook();

        reader.takeBook(book1);
        reader.returnBook(book2);

        readerSupp.takeBook(book3);

        admin.overdueNotification(reader);
    }

    }
