import java.util.Scanner;
public class Project3{
    public static char calcGrade(double average){
        if(average>=90){
            return 'A';
        }else if(average>=80){
            return 'B';
        }else if(average>=70){
            return 'C';
        }else if(average >= 60){
            return 'D';
        }else{
            return 'E';
        }
    }//method that calculates grade
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        Student s[]=new Student[5];
        for(int i=0; i<5;i++){
            System.out.println( " Student "+ (i+1)+ ":");
            String name = scan.next();
            int id = scan.nextInt();
            int score1 = scan.nextInt();
            int score2 = scan.nextInt();
            s[i] = new Student(name, id, score1, score2);
        }//gets input for each student

        for(int i = 0;i<5;i++) {
            System.out.println("Grade for " + s[i].getName() + " is " + String.valueOf(calcGrade(s[i].getAverage())));
        }//displays average scores 

        for(int i = 0;i<5;i++) {
            double currentMax = 0;
            int currentIndex = -1;
            for(int j = 0;j<5;j++) {
                if(s[j].getAverage() > currentMax) {
                    currentIndex = j;
                    currentMax = s[j].getAverage();
                }
            }
            System.out.println("Name: " + s[currentIndex].getName() + " ID: " + s[currentIndex].getid() + " Average: " + currentMax) ;
            s[currentIndex].setAverage(0.0);
        }//prints scores in order of high to low
    }
}

        
