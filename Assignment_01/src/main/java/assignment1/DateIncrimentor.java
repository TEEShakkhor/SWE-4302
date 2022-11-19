package assignment1;

public class DateIncrimentor
{
    public void incrimentDate(Date date)
    {
        if(date.lastday==date.day)
        {
            if(date.month==12)
            {
                date.year++; date.month=1; date.day=1;
            }
            else
            {
                date.month++; date.day=1;
            }
        }
        else
        {
            date.day++;
        }
    }
}
