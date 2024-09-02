import java.util.Scanner;
class StartsWith
{
	public static void main(String[] args)
	 {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str = SC.nextLine();

		System.out.print("Enter String to check : ");
		String str1 = SC.next();
		System.out.println("Enter a Index : ");
		int searchIndex=SC.nextInt();
		boolean op =userStratsWith(str1,searchIndex);
		System.out.println(str+" : "+op);
	}
	public static boolean userStratsWith(string str1)
	{
		boolean flag =true;
		for(int i=0;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag =false;
				break;
			}
		}
		return flag;
	}
	public static boolean userStartsWith(String str1,int startsIndex)
	 {
	 	if(startsIndex<0 && startsIndex.str.length())
	 	{
	 		throw new StringIndexOutOfBoundsException("Wrong Index"+startIndex);
	 	}
	 	boolean flag=true;
	 	for(int i=startIndex;i<str1.charAt(i);i++)
	 	{
	 		char ch =str1.charAt(i);
	 		if(ch!=str.charAt(i))
	 		{
	 			flag=false;
	 		    break;
	 		}
	    }
	    return flag;
   }
}
































































