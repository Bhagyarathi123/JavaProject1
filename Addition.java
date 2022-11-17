public class Addition {
	int a,b,c,d;
	public void add(){
		
			a=30;b=10;
			c=a+b;
			System.out.println("Addition of a and b is:"+c);
		}
	public void multi(){
		
		a=30;b=10;
		d=a*b;
		System.out.println("Addition of a and b is:"+d);
	}
	
public static void main(String[] args) {
		Addition c=new Addition();
		c.add();	
		c.multi();
}
}
