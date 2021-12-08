package lab1;

public class class1 {

	
	public static int integerTask(int A, int B)
	{
		return A%B;
	}
	
	public static int[] ifTask(int A, int B, int C)
	{			
		
		int count1 = 0, count2 = 0;
		int array[]=new int[2];
		if(A<0) 
		{
			count1++;
		}
		else if (A>0)
		{
			count2++;
		}
		
		if(B<0) 
		{
			count1++;
		}
		else if (B>0)
		{
			count2++;
		}
		
		if(C<0) 
		{
			count1++;
		}
		else if (C>0)
		{
			count2++;
		}
	    
		array[0] = count1;
		array[1] = count2;
		return array;
	}
	
	public static float[] forTask(float count) {
		float array[]=new float[10];
		float k=0;
		k+=0.1;
		for(int i=0; i < 10; i++)
		{
			array[i] =count*k;
			k+=0.1;
		}
		return array;
	}
	
	public static boolean booleanTask(int A, int B)
	{
		return (A==0) || (B <-2);
	}
	
	public static float caseTask(int N, float A, float B)
	{
		switch(N) {
		case 1: return A+B;
		case 2: return A-B;
		case 3: return A*B;
		case 4: return A/B;
		default: return 0;		
		}
	
	}
	
	public static int whileTask(int N) {
		int K=0;
		while((Math.pow(2, K) != N) && Math.pow(2, K) < N)
		{
			K++;
			if (Math.pow(2, K) > N)
			{
				return -1;
			}
		}
		
		return K;
	
	}
	
	public static void main(String args[]) {
	}
}


