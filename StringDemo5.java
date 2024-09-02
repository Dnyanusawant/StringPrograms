//que//manipulate the given string based on the data set:-
//input:abcdefg
//output:-ABCDEFG

import java.util.Scanner;
class StringDemo5
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the given String: ");

		String s=sc.next().toLowerCase();
		String newString=" ";

		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				newString=newString+s.subString(i,i+1).toUpperCase();
			}
			else{
				newString=newString+s.subString(i,i+1).toLowerCase();
			}
		}
		System.out.println("Before :"+s);
		System.out.println("Resultant: "+newString);
	}
}