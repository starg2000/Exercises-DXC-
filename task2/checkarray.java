package javadxc;
import java.util.*;
public class checkarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,5,6,42,6,293,57};
int f=0;
Scanner s=new Scanner(System.in);
int x=s.nextInt();
for (int i=0;i<a.length;i++) {
	if (x==a[i]) {
		System.out.print("found");
f=1;break;

	}
	else
		f=0;
	}
if (f==0)
	System.out.print("no");
}
}
