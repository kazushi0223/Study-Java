package bunki;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class date {

    public static void main(String[] args) throws ParseException {
        // String datetime = "2021/08/03";
        // Date covDate = new SimpleDateFormat("yyyy/mm/dd").parse(datetime);
        // System.out.println("date =" + covDate);
        //
        // String retDate = new SimpleDateFormat("yyyy/mm/dd").format(covDate);
        // System.out.println("date =" + retDate);

        Date date = new Date();
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);

        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH);
        int dt = cl.get(Calendar.DATE);

        System.out.println("YEAR : " + year);
        System.out.println("MONTH : " + month);
        System.out.println("DATE : " + dt);
        System.out.println((cl.getTime()));

    }
}
