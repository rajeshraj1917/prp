class Flow14
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
 int sum=0;
int  rem=0;
while(a>0)
{
rem=a%10;
sum=sum+rem;
a=a/10;
}
System.out.println(sum);
}
}