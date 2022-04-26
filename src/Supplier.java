public class Supplier extends User implements Supplierable{
    public Supplier(String function, String name) {
        super(function, name);
    }

    @Override
    public void bringBook() {
        System.out.println(super.function + super.name + " принёс новые книги в библиотеку");
    }
}
