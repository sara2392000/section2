/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication١;

public class JavaApplication١ {
static class student{
      String name ;
      private int id;
        public  double GPA ;
      public subject SubID;
      public subject subName;
      public subject subHours;
      public Address streetNO;
       public Address city;
        public Address country;
      
      
      public student( String name, double GPA,subject SubID, subject subName, subject subHours,Address streetNO, Address city, Address country){
      
      this.name=name;
      this.id=id;
      this.GPA=GPA;
      this.SubID=SubID;
      this.subName=subName;
      this.subHours=subHours;
      this.streetNO=streetNO;
      this.city=city;
      this.country=country;
      
      
      }

        private student() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
      
      
      public void display(){
      System.out.println("student name is "+ name+"student id is "+ id + "student GPA is "+ GPA);
      System.out.println("subject name is " + subName+"subject ID is "+ SubID+ "subject hours is "+subHours);
      System.out.println("the addres is "+ streetNO+"city"+city+"country"+country);
      
      }
      
  }
  
    public static void main(String[] args) {
       
        student s1=new student();
        
        s1.setId(55);
        s1.getId();
        s1.display();
    }
    
}
