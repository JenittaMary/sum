import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,z;
	System.out.println("Enter The Two numbers:");
Scanner  in=new Scanner(System.in);
 x= in.nextInt();
y=in.nextInt();
z=x+y;
System.out.println(" Addition is:"+z);

in.close();

	}

}
