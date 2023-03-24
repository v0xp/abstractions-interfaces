
public abstract class User {
    String name;
    String transport;
    String position;

    public User(String name, String transport, String position){
        this.name = name;
        this.transport = transport;
        this.position = position;
    }

    public void getToLibrary( String name, String transport, String position){
        System.out.println(position +" "+ name +" Добирается до библиотеки на " + transport);
    }

    public abstract void dinner();
}
