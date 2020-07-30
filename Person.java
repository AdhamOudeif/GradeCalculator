//Adham Oudeif 
// Person Class 
public class Person{
    private String name;
    private int id;
    public Person(){
        name = "no name yet"; 
        id=0;
    }//default constructor
    public Person (String newName, int newid){

        name = newName;
        id=newid;

    }//parameterized constructor
    public Person(Person otherPerson){
        name=otherPerson.name; id=otherPerson.id;
    }//copy
    public void setName(String name){
        this.name=name;
    }//non-static mutator
    public static void setName(Person p, String newName){
        p.name = newName;   
    }//static method
    public String getName(){
        return name;
    }//accessor
    public void setId(int id){
        this.id=id;   
    }

    public static void setid(Person p, int newid){
        p.id = newid;   
    }//mutator
    public int getid(){
        return id;   
    }//accesspr
    public boolean equals(Person otherPerson){
        return (name.equals(otherPerson.name)&&id==otherPerson.id);
    }//checks to see if both objects are equal
    public String toString(){
        return ("Name = " + name + " Id " + id);   
    }//returns everything as a string

    
}
    
    