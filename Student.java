//Student Class 
class Student extends Person{
    private int score1;
    private int score2;
    private double average;
    public Student(){
        super(); // from super class Person
    }
    public Student(String name, int id, int score1,int score2){
        super(name,id);
        this.score1 = score1;
        this.score2 = score2;
        double average = (score1 + score2)/2.0;
        this.average = average;
        
        
    }
    public int getScore1(){
        return score1;
    }//accesor
    public void setScore1(int score1){
        this.score1=score1;
    }//mutator
    public int getScore2(){
     return score2;   
    }
    public void setScore2(int score2){
      this.score2=score2;  
    }
    public double getAverage(){
        return average;
    }
    public void setAverage(double average){
      this.average=average;  
    }
    
    
}
    
