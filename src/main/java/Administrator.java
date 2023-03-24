
public class Administrator extends User implements AdministratorImpl, LibrarianImpl{

    public Administrator(String name, String transport, String position) {
        super(name, transport, position);
    }

    @Override
    public void dinner() {
        System.out.println(position+ " " + name +" Обедает на работе");
    }

    @Override
    public void findBook() {
        System.out.println("Находит книги");
    }

    @Override
    public void givBook() {
        System.out.println("Выдает книги");
    }

    @Override
    public void sendMessage() {
        System.out.println("Уведомляет о сроках возврата книги");
    }

    @Override
    public void bookingBook(User user) {
        System.out.println("Когда нет библиотекаря "+ position+ " " + name +" заказывает книги у " + user.position+" "+user.name);
    }
}
