
public class Supplier extends User implements SupplierImpl, ReaderImpl{

    public Supplier(String name, String transport, String position) {
        super(name, transport, position);
    }

    @Override
    public void dinner() {
        System.out.println("Обедает в заусочной");
    }

    @Override
    public void briningBook() {
        System.out.println("Поставляет книги");
    }

    @Override
    public void takeBook(User user) {
        System.out.println( position + " " + name + " берет книги у " + user.position +" "+ user.name);
    }

    @Override
    public void bakeBook(User user) {
        System.out.println( position + " " + name + " возвращает книги " + user.position +" "+ user.name);
    }
}
