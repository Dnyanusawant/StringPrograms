class StringBufferDemo4
{
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");

		String sb1=new String("java");
		String sb2=new String("java");

		System.out.println(sb1.equals(s1));
		System.out.println(sb2.equals(s2));

		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(s2));

		System.out.println(s1.contentEuals(sb1));

		System.out.println(sb1==sb2);
		System.out.println(s1==s2);
	}
}