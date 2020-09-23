package ua.academy.lgs;

public class Lesson1 {
public static void main(String[] args) {
	
	//Завдання 1
	byte y=1;
	short s = 1;
	int c = 1;
	long l = 1l;
	double d =1.6;
	float f = 1.6f;
	char ch = 'a';	
	boolean bool= true;
	
	// Завдання 2
	
	System.out.println("byte max = " + Byte.MAX_VALUE + "; byte min = " + Byte.MIN_VALUE);
	System.out.println("short max = " +Short.MAX_VALUE + "; short min = " + Short.MIN_VALUE );
	System.out.println("int max = " +Integer.MAX_VALUE + "; int min = " + Integer.MIN_VALUE );
	System.out.println("long max = " +Long.MAX_VALUE + "; long min = " + Long.MIN_VALUE );
	System.out.println("double max = " +Double.MAX_VALUE + "; double min = " + Double.MIN_VALUE );
	System.out.println("float max = " +Float.MAX_VALUE + "; float min = " + Float.MIN_VALUE );
	System.out.println("char max = " +Character.MAX_VALUE + "; char min = " + Character.MIN_VALUE );


	// Завдання 3
	int[] array= {6,7,1,8,2,3,4,9,10,5};
	int b;
	boolean isSorted=false;
	while (!isSorted) {
		isSorted=true;
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1]) {
				isSorted=false;
				b=array[i];
				array[i]=array[i+1];
				array[i+1]=b;
			
			}
		}	
	}
	System.out.println(array[0]);
	System.out.println(array[9]);
	
}
}
