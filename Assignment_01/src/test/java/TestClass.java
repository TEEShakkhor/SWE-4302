import assignment1.Date;
import assignment1.Calender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass
{
    @Test
    void test1(){
        Calender calender=new Calender();
        Date date = new Date(2,6,2020);
        assertEquals("3/6/2020",calender.calculateDate(date));
    }
    @Test
    void test2() {
        Calender calender = new Calender();
        Date date = new Date(28, 2, 2016);
        assertEquals("29/2/2016", calender.calculateDate(date));
    }
    @Test
    void test3(){
        Calender calender=new Calender();
        Date date = new Date(31,1,2022);
        assertEquals("1/2/2022",calender.calculateDate(date));
    }

}
