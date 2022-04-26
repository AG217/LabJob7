public class Admin extends User implements Administratorable{
    public Admin(String function, String name) {
        super(name, function);
    }

    @Override
    public void findBooks() {

    }

    @Override
    public void overdueNotification(Reader reader) {
        if (reader.overDue()) {
            System.out.println("У вас пророченно время возврата");
        } else {
            System.out.println("Всё хорошо, до свидания");
        }
    }
    }


