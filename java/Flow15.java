class Flow15
{
public static void main(String[] args)
{
int len=args.length;
if(len>=1)
{
for(int i=1;i<=3;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println("	");
}
}
else
{
System.out.println("please enter an integer");

}
}
}