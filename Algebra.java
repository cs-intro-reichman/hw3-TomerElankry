// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    //System.out.println(plus(2,3));   // 2 + 3 = 5
	    //System.out.println(minus(-3,-3));  // 7 - 2 = 5 
   		//System.out.println(minus(2,7));  // 2 - 7 = -5
 		//System.out.println(times(3,-1));  // 3 * 4 = 12
   		//System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2 = 10
   		//System.out.println(pow(5,3));      // 5^3 = 125
   		//System.out.println(pow(-3,3));      // 3^5 = 243
   		//System.out.println(div(-12,-3));   // 12 / 3 = 4 
   		//System.out.println(div(5,5));    // 5 / 5  = 1
   		//System.out.println(div(25,7));   // 25 / 7 = 3
   		//System.out.println(mod(25,7));   // 25 % 7 = 4
   		//System.out.println(mod(120,6));  // 120 % 6 = 0  
   		System.out.println(sqrt(36)); // = 6
		System.out.println(sqrt(263169)); 
   		System.out.println(sqrt(15));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if(x2>0)
		{
			for(int i=0;i<x2;i++)
			{
			   x1++;
			}
		}
		if(x2<0)
		{
			for(int i=0;i>x2;i--)
			{
			   x1--;
			}
		}
		
		   return x1;
		
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if(x2>0)
		{
			for(int i =x2;i>0;i--){
				x1--;
			}
		}
		if(x2<0)
		{
			for(int i =x2;i<0;i++){
				x1++;
			}
		}
		
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int per = x1;
		if(x1==0 || x2==0) return 0;
		if(x1>0 && x2>0 || x1<0 && x2>0)
		{
			for(int i=1;i<x2;i++) x1 = plus(x1,per);
			return x1;
		}
		if(x2<0 && x1<0)
		{
			for(int j = 0;j>minus(x2, 1);j--) x1 = minus(x1, per);
			return x1;
		}
		if(x1>0 && x2<0)
		{
		    for(int i=1;i>x2;i--) x1 = minus(x1,per);
			return x1;	
		}
		return 0;

	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int a = 1;
		for(int i = 0;i<n;i++)
		{
			a = times(x, a);
		}
		return a;

	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) 
	{
		int i = 0;
		if(x1==0||x2==0) return 0;
		if(x1>0 && x2>0)
		{
			while(x1>=x2) 
			{
				x1=minus(x1, x2);
				i++;
			}
			return i;
		}
		if(x1<0 && x2>0)
		{
			while (x1<0)
		    {
				x1 = plus(x1, x2);
				i++;			
			}
			return times(i, -1);
		}
		if(x1<0 && x2<0)
		{
			if(x1>x2)return 0;
			if (x1==x2) return 1;
			else while (x1<0) 
			{
				x1 = minus(x1, x2);
				i++;		
			} 
			return i;
		}
		return 0;
	}

	

	// Returns x1 % x2
	public static int mod(int x1, int x2) { return x1-div(x1,x2)*x2; }	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) 
	{
		if(x==0) return 0;
		int i =1;
		while (pow(i,2)<x)
		{
			i++;
			if(pow(i+1,2)>x) break;
		}
		return i;
	}	  	  
}