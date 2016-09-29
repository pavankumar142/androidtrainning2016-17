import java.io.*;
import java.util.*;
class order
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter the no.of names");
n=s.nextInt();
System.out.println("enter the names");
String names[]=new String[n];
String temp;
for(int i=0;i<n;i++)
{
	names[i]=s.next();
}
for(int i=0;i<n;i++)
{
		for(int j=i+1;j<n;j++)
		{
				if(names[i].compareTo(names[j])>0)
				{
						temp=names[i];
						names[i]=names[j];
						names[j]=temp;
				}
		}
}
System.out.println("after the names are");
for(int i=0;i<n;i++)
System.out.println(names[i]);
}
}
