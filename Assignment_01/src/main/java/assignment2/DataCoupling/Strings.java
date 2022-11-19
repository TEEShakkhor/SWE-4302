package assignment2.DataCoupling;

public class Strings {
    String first = "Never";
    String second = "Gonna";
    String third = "Let";
    Printer printer = new Printer();
    public void caller() {
        printer.print(first, second, third);
    }
}
