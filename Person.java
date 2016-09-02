public class Person {
   private String name;
   private String address;
   public Person(String name,String address){
       this.name = name;
       this.address = address;
   }
   public String getName(){
       return this.name;
   }
   public String getAddress(){
       return this.address;
   }
   public void setName(String name){
       this.name = name;
   }
   public void setAddress(String address){
       this.address = address;
   }
   @Override
   public String toString(){
       String string = "name = " + this.name + "\n" + "address = " + this.address + "\n";
       return string;
   }    
}
class Student extends Person{
    String program;
    int year;
    double fee;
    public Student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return this.program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    @Override
    public String toString(){
        String string = super.toString() + "program = " + this.program +  "\n" + "year = " + String.valueOf(this.year) +  "\n" + "fee = " + String.valueOf(fee) + "\n";
        return string;
    }
    
}
class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name,String address,String school,double pay){
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    @Override
    public String toString(){
        String string = super.toString()  + "School = " + this.school +  "\n" + "pay = " + String.valueOf(pay) + "\n";
        return string;
    }
}
