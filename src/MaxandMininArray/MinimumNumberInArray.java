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
public class MinimumNumberInArray {
    public static void main(String[]args)
    {
    //find minimum number in array
    //variable diclaration area
    int i;
    
    Scanner input=new Scanner(System.in);
    System.out.print("Enter any Five Numbers:\n");
    double[] myArray= new double[5];
    
    for(i=0;i<myArray.length;i++)
    {
    
    myArray[i]=input.nextDouble();
    
    }
    
    double min=myArray[0];
    
    for(i=1;i<myArray.length;i++)
        {
        
        if(myArray[i]<min)
        {
        min=myArray[i];
        
        }
        
        }
    
    System.out.println("Minimum Number is:"+min);
    
   }
    
}
