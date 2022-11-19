package assignment2.ControlCoupling;

public class AdultChecker {
    public void check(int age)
    {
        if(age>18)
            System.out.println("Adult");
        else
            System.out.println("Go away kid");
    }
}
