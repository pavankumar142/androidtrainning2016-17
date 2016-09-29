import java.util.Scanner;
public class remo
{
public static void main(String args[])
{
int d[]={4,8,6,7,4,8};
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int pos=s.nextInt();
for(int i=0;i<d.length;i++)
{
if(pos!=i)
{
System.out.println(" "+d[i]);
}
}
}
}
