
public class Reader extends User implements ReaderImpl {

    public Reader(String name, String transport, String position) {
        super(name, transport, position);
    }

    @Override
    public void dinner() {
        System.out.println("Обедает в столовой");
    }

    @Override
    public void takeBook(User user) {
        System.out.println(name + " Берет книги у " +user.name);
    }

    @Override
    public void bakeBook(User user) {
        System.out.println(name +" Возвращает книги " +user.name);
    }
}
