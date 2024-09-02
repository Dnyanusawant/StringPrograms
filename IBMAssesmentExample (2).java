import java.util.*;
class IBMAssesmentExample
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str= sc.next();
		String []words=str.split();
		String op=" ";
		int max=0;
		for(String i : words )
		{
			if(max<i.length())
			{
				if{
					op=i;
					max=i.length();
				}
			}
		}
		System.out.println(str + " : "+op);
		
	}
}