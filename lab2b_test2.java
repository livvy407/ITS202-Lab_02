public class lab2b_test2
{
	public static void main(String []args)
	{
		lab2b obj = new lab2b(4);
		obj.enqueue(6);
		obj.enqueue(4);
		obj.enqueue(1);
		obj.enqueue(9);

		System.out.println(obj.isEmpty());
		System.out.println(obj.len());
		System.out.println(obj.first());
		System.out.println(obj.dequeue());
		System.out.println(obj.len());
	}
}