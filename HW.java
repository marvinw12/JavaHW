package JavaHW;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("ENTER A GRADE BETWEEN 0-100");
        int grade = Integer.parseInt(userInput.nextLine());
        

        char letterGrade = 'x';
        if (grade >= 0 && grade <= 100){
            if(grade >= 90) {
                letterGrade = 'A';
            } else if(grade >= 80 && grade < 90) {
                letterGrade = 'B';
            } else if (grade >= 70 && grade < 80) {
                letterGrade = 'C';
            } else if(grade >= 60 && grade < 70) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
    }

        switch(letterGrade) {
            case 'A':
                System.out.println("GREAT!");
                break;
            case 'B': 
                System.out.println("GOOD!");
                break;
            case 'C':
                System.out.println("OK");
                break;
            case 'D':
                System.out.println("NEEDS IMPROVEMENT");
                break;
            case 'F':
                System.out.println("FAIL");
                break;
        }

        System.out.printf("You have earned %s\n", letterGrade);
        userInput.close();  
    }
    
}
