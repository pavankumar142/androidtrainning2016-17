import java.util.*;
public class guna
{
 static String months[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
public static void main(String[] agrs)
{
	int year;
GregorianCalendar gc=new GregorianCalendar();
System.out.print("Date:");
System.out.print(months[gc.get(Calendar.MONTH)]+"-");
System.out.print(""+gc.get(Calendar.DATE)+"-");
System.out.print(year=gc.get(Calendar.YEAR));
System.out.print("Time");
System.out.print(gc.get(Calendar.HOUR)+":");
System.out.print(gc.get(Calendar.MINUTE)+":");
System.out.print(gc.get(Calendar.SECOND)+":");
}
}
