package javadxc;
import java.util.*;
public class anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int c=0;
		for (int i=0;i<s2.length();i++) {
			char c1=s2.charAt(i);
			for(int j=0;j<s1.length();j++) {
				if (c1==s1.charAt(j) && s1.charAt(j)!=' ')
					c++;
			}
			
		}
		if (c==s1.length())
			System.out.print("yes");

	}

}
