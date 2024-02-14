import java.util.*;

public class Calculator
{
    // In this program we will calculate the percentage of the marks obtained by students in the 12th class and assign grade to it

    public static void main(String args [])
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Calculator");

        System.out.println();
        System.out.println("The marks are outoff 100");
        System.out.println("Enter the marks of the students");

        System.out.print("Physics :");
        int Physics = sc.nextInt();

        System.out.print("Chemistry :");
        int Chemistry =sc.nextInt();

        System.out.print("Maths :");
        int Maths =sc.nextInt();

        System.out.print("Biology :");
        int Biology =sc.nextInt();

        System.out.print(" P.E:");
        int PE =sc.nextInt();

        double sum = (Physics+Chemistry+Maths+Biology+PE);
        System.out.println();
        System.out.print("Total marks obtained by student are :"+" "+sum);

        System.out.println();
        double percentage =(sum/(5*100))*100;
        System.out.print("Percentage :"+ " "+percentage+ "%");

        //Here we will assign the grade

        char grade;

        if(percentage>=90){
        
            grade = 'A';
        }
        else if(percentage>=80){
        
            grade = 'B';
        }
        else if(percentage>=70){
            grade = 'C';
        }
        else if(percentage>=60){
            grade = 'D';
        }
        else if(percentage>=50){
            grade = 'E';
        }

        else{
            grade = 'F';
        }
        System.out.println();
        System.out.print("Grade :"+ grade);
        }
}