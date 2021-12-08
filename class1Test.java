package lab1;

import lab1.class1;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class class1Test {

	class1 ob1 = new class1();
	
	@org.junit.jupiter.api.Test
	void testInteger() {
	 assertEquals(5, ob1.integerTask(35, 10));
	}
	
	@org.junit.jupiter.api.Test
	void testIf() {
		int masiv[]={1,1};
		int masiv1[] = ob1.ifTask(-5,0,5);
		for(int i = 0; i < 2; i++) {
			assertEquals(masiv[i],masiv1[i]);
		}
	}
	
	@org.junit.jupiter.api.Test
     void testForTask() {
		float masiv[] = new float[10];
		float k=0.1f;
		for (int i=0;i<10;i++)
		{
			masiv[i] = 21.5f*k;
			k+=0.1;
		}
		
		float masiv1[] = ob1.forTask(21.5f);
		for(int i=0;i<10;i++)
		{
			assertEquals(masiv[i],masiv1[i],0.001);
		}
	}
	
	public float[][] DataCaseTask(){
		float Object1[][] = {{28,3,4,7,0.001f},{35,1,22.5f,12.5f,0.001f},
				             {10.5f,4,105,10,0.001f},{7,2,10,3,0.001f}};;
		
				     
	    return Object1;
			
	}
	@org.junit.jupiter.api.Test
	void testCaseTask() {
		float Object2[][] = DataCaseTask();
		int j = 1;
		for(int i = 0; i<4;i++)
		{
		assertEquals(Object2[i][0],ob1.caseTask((int)Object2[i][j], Object2[i][j+1], Object2[i][j+2]),Object2[i][j+3]);
		
		}
	}
	
	@org.junit.jupiter.api.Test
	void testBooleanTask() {
		assertEquals(false,ob1.booleanTask(5,-2));
	}
	
	@org.junit.jupiter.api.Test
	void testWhileTask() {
		assertEquals(4,ob1.whileTask(16));
	}
	
	

}
