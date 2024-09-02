import java.util.Scanner;
class ToLowerCase
{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter a string : ");
		str=SC.nextLength();
		System.out.println(str+ " : "+op);
	}
	public static String userToLowerCase()
	{
	   	String nstr=" ";
	   	for(int i=0;i<str.length();i++)
	   	{
	   		char ch =str.chartAt(i);
	   		if(ch<='a' && ch>='z')
	   		{
	   			nstr=nstr+(char)(ch+32)
	   		}
	   		else{
	   			nstr=nstr=nstr+ch;
	   		}
	   	}
	}
	return nstr;
}