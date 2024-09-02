
class StringBufferDemo3
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(15000);

		sb.append("My Name Is Dinga");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}