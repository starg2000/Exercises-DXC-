package javadxc;

import java.util.Scanner;

public class shortname {
	public static void main(String[] args ) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String[] s2=s1.split(" ");
		String res="";
		for (int i=0;i<s2.length-1;i++) {
			res+=Character.toUpperCase(s2[i].charAt(0))+".";
		}
		res+=" "+s2[s2.length-1];
		System.out.print(res);
		
	}

}
