class Flow17
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
int b=a;
int reverse=0;
while(a!=0)
{
int rem=a%10;
reverse=reverse*10+rem;
a=a/10;
}
if(b==reverse)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}