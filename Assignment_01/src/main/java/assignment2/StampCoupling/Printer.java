package assignment2.StampCoupling;

public class Printer {
    private int[] semester_array = {1, 2, 3, 4, 5};
    Student student = new Student();
    Result result = new Result();
    public void print() {
        result.getAll(semester_array, student);
    }
}
