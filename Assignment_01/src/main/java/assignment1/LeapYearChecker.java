package assignment1;

public class LeapYearChecker
{
    public boolean LeapYear(int year)
    {
        boolean f = ((year%400==0) || (year%4==0 && year%100!=0));
        return f;
    }
    public boolean LeapMonth(int month)
    {
        return month==2;
    }

}
