class StringBufferDemo
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("dinga");
		sb.insert(0,"penga");
		System.out.println(sb);

		sb.delete(0,5);
		System.out.println(sb);
	}
}