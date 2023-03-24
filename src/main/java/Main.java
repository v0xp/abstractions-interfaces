


public class Main {

    public static void main(String[] args) {

        Librarian librarian = new Librarian("Max", "bus", "librarian");
        Administrator administrator = new Administrator("Fil", "car", "administrator");
        Reader reader = new Reader("Ksenia", "taxi", "reader");
        Supplier supplier = new Supplier("Victor", "velo", "supplier");


        librarian.getToLibrary(librarian.name, librarian.transport, librarian.position);
        librarian.dinner();
        librarian.bookingBook(supplier);
        administrator.dinner();
        administrator.bookingBook(supplier);
        supplier.takeBook(librarian);
    }

}
