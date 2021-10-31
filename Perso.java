
package javaapplication٨;


public class Perso {

   
     
    

 public static  class person{
    private String name;
      String address;
      double  phoneNomber;
       String mailAdderss;
       
       MyDate date;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMailAdderss() {
            return mailAdderss;
        }

        public void setMailAdderss(String mailAdderss) {
            this.mailAdderss = mailAdderss;
        }
 
       
    @Override
       public String toString(){
   
       return "name is "+getName()+ " his class is "+ this.getClass();
       
       
       }
   
   }
    public static void main(String[] args) {
        
        person p=new person();
        student s=new student();
        
        p.setName("Sara");
        s.setName("Shimaa");
        p.toString();
        s.toString();
        
    }
    
}
