package org.test;


public class Flow_control_ifstatement {
	public static void main(String[] args) {
	
	int x=10;
	int y=50;
	 System.out.println("------------if statment-----------");
	if(x>y)
	{
		System.out.println("x is Bigger and the x is: "+x);
	}
	else
	{
		System.out.println("Y is Bigger and y is: "+y);
	}
	

//Mark statement using if nested statement
	 System.out.println("------------if else if-----------");
     int score=93;
     int h=54;
     if(score<=h)
     {
    	 System.out.println("Excellent student ");
     }
     else if(score<y)
     {
    	 System.out.println("Average Student");
     }
     else
     {
    	 System.out.println("Not eligible");
     }
     
	
	//While loop
     System.out.println("------------While loop-----------");
     int num=1;
     while(num<=5) {
    	 System.out.println(num);
    	 num++;
    	 
     }
	
	//for loop
     System.out.println("-----------for loop-----------");
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
	
	//star shape using for loop
	int b=5;
	for(int a=0;a<=b;a++) {
		for(int j=0;j<a;j++) {
			System.out.println("*");
		}System.out.println();
		 
	}
	
	
	
	
}
}