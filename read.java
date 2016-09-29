import java.io.*;
import java.util.Scanner;
class read
{
public void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
String names[i]=new String names[i];
System.out.println("enter the numbers");
n=s.nextInt();
System.out.println("enter the names");

for(int i=0;i<n;i++)
{
names[i]=s.next();
}
System.out.println("the names are");
for(int i=0;i<n;i++)
{
System.out.println(names[i]);
}
}
}
