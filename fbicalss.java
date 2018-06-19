package fibnumberseries;

public class fbicalss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
int y =1;
int fib;
//int zero;
//int number =40;
for(int i=1;i<=10;++i)
{
	fib=x+y;
	x=y;
	y=fib;
	System.out.println(fib);

}
return;
	}

}
