//5

class Student {

    private String name;
    private String Address;
    private int Salary;
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String newEmail) {
        Email = newEmail;

    }

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public void setSalary(int newSalary) {
        Salary = newSalary;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAddress(String newAddress) {
        Address = newAddress;
    }
}

public class data_Encapsulation {
    public static void main(String args[]) {
        Student e = new Student();
        e.setName("ROHAN");
        e.setSalary(70900);
        e.setAddress("solapur");
        e.setEmail("rohan@gmail.com");
        System.out.print(
                " Name   : " + e.getName() + "\n" + " Address  : " + e.getAddress() + "\n" + " Salary : "
                        + e.getSalary()
                        + "\n" + " Email  : " + e.getEmail() + "\n");
    }
}
