

 class oops
 {
    public static void main(String args[])
    {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        v.Vehicle1();
        c.Car1();
        c.Vehicle1();
        b.Bike1();

        customerDetails cd =new customerDetails();
        cd.setName("Sruthi");
        cd.getName();
        cd.setvehicleRented("SUV");
        cd.getvehicleRented();
        cd.setRent(1000);
        cd.getRent();
        rentDetails rd = new rentDetails();
        rd.show(2);
        rd.show(2,4);










    }
 }

 


class Vehicle
{
    void Vehicle1()
    {
       System.out.println("Welcome to Vehicle Management System\n");
}
    }
    

class Car extends Vehicle{
    void Car1(){

    System.out.println("We have cars available for rent\n");
    }
}
class Bike extends Vehicle{
    void Bike1(){
         System.out.println("We have bikes available for rent\n");
}
    }
  
    

class customerDetails
{
    private String name;
    private String vehicleRented;
    private int rent;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    } 
    public void setvehicleRented(String vehicleRented)
    {
        this.vehicleRented=vehicleRented;
    }
    public String getvehicleRented()
    {
        return vehicleRented;
    } 
    public void setRent(int rent)
    {
        this.rent=rent;
    }
    public int getRent()
    {
        return rent;
    } 
 }

 class rentDetails{

     void show(int a){
        System.out.println("Are you sure you requested for "+ a +"seater vehicles");

    }
    void show(int a , int b ){
        System.out.println("Are you sure you requested for "+ a +" and "+b+" seater vehicles");
        
    }
 }



