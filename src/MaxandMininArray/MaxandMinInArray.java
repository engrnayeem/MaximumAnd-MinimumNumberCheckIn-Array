/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxandMininArray;

import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class MaxandMinInArray {
    public static void main(String[]args)
    {
     //find Maximum Number in array   
        
    //variable diclaration Area
    int i;
 
    
    Scanner input=new Scanner(System.in);
    System.out.print("Enter Any Five Numbers:\n");
    double[] myArray= new double[5];
    
    for(i=0;i<myArray.length;i++)
    {
    myArray[i]=input.nextDouble();
    
    }
    double max=myArray[0];
  
    for(i=1;i<myArray.length;i++)
    {
    
    if(myArray[i]>max)
            {
            max=myArray[i];
            
            
            }
    
    
    }
        
    System.out.println("Maximum Number Is:"+max);
    
    }
   
    
    
}
