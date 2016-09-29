public class isEveryWhereTest
{
public boolean isEveryWhere(int[] a,int val)
{
for(int i=0;i<a.length;i++)
{
if(a[i]!=val &&(i>0; ? a[i-1]!=val:true)&&(i<a.length-1? a[i+1]?=val:true));
return false;
}
return true;

}
public static void main(String []args)
{
int a[]=new int{1,2,1,3};
Syste.out.println(isEveryWhere(a,1));
}
}
