class MyClass {
    public int publicVariable = 10; // Accessible from anywhere
    private int privateVariable = 20; // Accessible only within MyClass
    protected int protectedVariable = 30; // Accessible within MyClass, its subclasses, and within the same package
    int defaultVariable = 40; // Accessible only within the same package
}
public class accspe
{
	public static void main(String args[])
	{
		MyClass m=new MyClass();
		System.out.println(m.publicVariable);
		System.out.println(m.privateVariable);
		System.out.println(m.protectedVariable);
		System.out.println(m.defaultVariable);
	}
}
