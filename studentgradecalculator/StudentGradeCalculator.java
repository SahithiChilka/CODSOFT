/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradecalculator;

/**
 *
 * @author chilk
 */
import java.util.*;
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter the number of subjects : ");
        int n=sc.nextInt();
        int total=0;
        for(int i=1;i<n+1;i++){
            System.out.println("Enter the marks obtained in " + i + ":");
            int marks=sc.nextInt();
            total+=marks;
        }
        double Avg=(double)total/n;
        char grade;
        if(Avg>=90){
            grade='O';
        }
        else if(Avg>=80 && Avg<90){
            grade= 'A';
        }
        else if(Avg>=70 && Avg<80){
            grade='B';
        }
        else if(Avg >=60 && Avg<70){
            grade='C';
        }
        else if(Avg >=50 && Avg <60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("Total marks scored is : "+total);
        System.out.println("Average percentage Gained is : " +Avg+"%");
        System.out.println("Grade : "+grade);
    
    }
    
}
