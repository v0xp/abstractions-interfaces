
public class Librarian extends User implements LibrarianImpl {

    public Librarian(String name, String transport, String position) {
        super(name, transport, position);
    }

    @Override
    public void dinner() {
        System.out.println(position +" "+ name +" Обедает дома");
    }

    @Override
    public void bookingBook(User user) {
        System.out.println(position +" "+ name + " Заказывает книги у " + user.position+ " " + user.name);
    }
}
