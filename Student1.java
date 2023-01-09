class Student1{
    String name, branch;
    int roll_no;

//Constructor initialized
    public Student1(String name, String branch, int roll_no){
        this.name = name;
        this.branch = branch;
        this.roll_no = roll_no;
    } 
    public static void main(String args[]){ 

//Object created
        Student1 s1 = new Student1("abhi","cse",8);
        Student1 s2= new Student1("Samsung","entc",13);
       

/*Smartphone details displayed for each user
        System.out.println(s1.name );
        System.out.println("Rahul  " + rahul.brand +" "+ rahul.color + " color smartphone having "+ rahul.camera+ "MP"+ " camera");
        System.out.println("Ravi  " + ravi.brand +" "+ ravi.color + " color smartphone having "+ ravi.camera+ "MP"+ " camera");*/

        System.out.println("Student1 Name is: " + s1.name);
        System.out.println("Student1 Branch is: " + s1.branch);
        System.out.println("Student1 roll_no is: " + s1.roll_no);

         System.out.println("Student2 Name is: " + s2.name);
        System.out.println("Student2 Branch is: " + s2.branch);
        System.out.println("Student2 roll_no is: " + s2.roll_no);


    } 
}