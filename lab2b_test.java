public class lab2b_test
{
	public static void main(String []args)
	{
		lab2b obj = new lab2b(4);
		obj.enqueue(4);
		obj.enqueue(9);
		obj.enqueue(7);
		obj.enqueue(1);

		System.out.println(obj.len());
		System.out.println(obj.first());
		System.out.println(obj.isEmpty());
		System.out.println(obj.dequeue());
	}
}