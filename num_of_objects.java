public class num_of_objects
{
	static int obj_count = 0;
	num_of_objects()
	{
		obj_count++;
	}
	public static void main(String args[])
	{
		num_of_objects obj1 = new num_of_objects();
		num_of_objects obj2 = new num_of_objects();
		num_of_objects obj3 = new num_of_objects();
		System.out.println("No. of Objects created::"+obj_count);
	}
}