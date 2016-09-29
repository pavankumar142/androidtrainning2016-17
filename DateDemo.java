import java.sql.Date;
public class DateDemo
{
static	long millis=System.currentTimeMillis();
public static void main(String[] args)
{
Date date=new Date(millis);
System.out.println(date);
}
}
