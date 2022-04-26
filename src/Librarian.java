public class Librarian extends User implements Librarianable{
    public Librarian(String function, String name) {
        super(function, name);
    }

    @Override
    public void orderBook(Supplierable supplierable) {
        System.out.printf(this.function + " " + this.name + "заказывает новые книги у %s", supplierable.toString());
        System.out.println();
    }
}
