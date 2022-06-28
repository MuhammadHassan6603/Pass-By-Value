class Test
{
	void swap(int x,int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
}
class PassByValue
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		Test obj=new Test();
		System.out.println("Before Calling Swap x = " + a + "y = " + b);
		obj.swap(a,b);
		System.out.println("After Calling Swap x = " + a + "y = " + b);
	}
}