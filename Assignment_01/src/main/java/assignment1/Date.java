package assignment1;
import java.util.Arrays;
import java.util.List;
public class Date
{
    int day,month,year,lastday;


    public Date(int day,int month,int year)
    {
        this.day=day; this.month=month; this.year=year; checklastday();
    }
    void checklastday()
    {
        List<Integer> monthswith31days= Arrays.asList(new Integer[]{1,3,5,7,8,10,12});
        LeapYearChecker leapyearChecker=new LeapYearChecker();

        if(leapyearChecker.LeapMonth(this.month))
        {
            if(leapyearChecker.LeapYear(this.year))
            {
                this.lastday=29;
            }
            else
            {
                this.lastday=28;
            }
        }
        else
        {
            if(monthswith31days.contains(this.month))
            {
                this.lastday=31;
            }
            else
            {
                this.lastday=30;
            }
        }
    }
}
