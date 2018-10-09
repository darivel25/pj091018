package edu.school.september;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner input=new Scanner(System.in);
                int n = input.nextInt();
                int [] array=new int [n];
                for(int i=0;i<array.length;i++)
                {
                	array[i]=input.nextInt();
                }
		         int sum =0;
		         for(int e: array) {
		        	 sum+=e;
		         }
		         double avarage =(double)sum/(double)n;
		         int nearest=0; 
		         double minDistance=Math.abs(avarage-array[nearest]);
		         for(int i=1;i<array.length;i++)
		         {
		        	 if (minDistance>Math.abs(avarage-array[i])){
		        		 minDistance= Math.abs(avarage-array[i]);
		        		 nearest=i;
		        	 }
		        	 
		         }
		         System.out.println(avarage);  
		         System.out.println(array[nearest]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
