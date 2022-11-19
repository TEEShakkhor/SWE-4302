package assignment1;

public class Calender
{
    DateIncrimentor dateIncrimentor = new DateIncrimentor();
    String dateoutput;
    public String calculateDate(Date date)
    {
        dateIncrimentor.incrimentDate(date);
        dateoutput = date.day + "/" + date.month + "/" + date.year;
        return dateoutput;
    }
}
