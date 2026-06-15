 import java.util.Arrays;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //byte- 1 [-128 to 127]
        //short- 2 [-32,768 to 32,767]
        //int- 4 [-2,147,483,648 to 2,147,483,647]
        //long- 8 [-9,223,372,036,854,775,          
        //float- 4 [1.4E-45 to 3.4028235E38]
        //double- 8 [4.9E-324 to 1.7976931348623157E308]
        //Char- 2 [0 to 65535]
        //Boolean- 1 [true or false]
        //String- 2 [0 to 65535]
        //Array- 2 [0 to 65535]
        //List- 2 [0 to 65535]
        //char- 2 [0 to 65535]
        //byte age = 25;
        //int age = 25;
        //float age = 25.5f;
        //char grade = 'A';
       // Boolean isJavaFun = true;

       //NON PRIMITIVE DATA TYPES
    //String name = "Ayushi singh";
    //System.out.println(name);
       //System.out.println(name.length());
       //String name1=new String("Ayushi singh yadav");
       //System.out.println(name1.length());
       // Concatenation
        //String firstName = "Ayushi";
        //String lastName = "Singh";
        //String fullName = firstName + " " + lastName;
        //System.out.println(fullName);
        //charAt()
        //System.out.println(name.charAt(2)); 
        //replace()
        //String newName = firstName.replace("Ayushi", "Rahul");
        //System.out.println(newName);
        //System.out.println(fullName.substring(0,6));
        // srtring are immutable in java
        //int[]marks= {11,22,37,46,50};
        //int[]marks1= new int[6];
        //marks1[0]=45;
        //marks1[1]=80;
        //marks1[2]=58;
        //marks1[3]=90;
        //marks1[4]=75;
        //marks1[5]=50;
        //System.out.println(marks1[4]);
        //System.out.println(marks1.length);
        //sorted array
        //Arrays.sort(marks1);
        //System.out.println(marks1[5]);
        // 2D array
        //int[][] marks2d={{98,99,86},{85,90,95}};
        //System.out.println(marks2d[0][2]);
        // casting
        //double price=100.00F;
        //double finalPrice=price+18.00;
        //System.out.println(finalPrice);
        //uneary operator
        //int x=15;
        //x++;
        //System.out.println(x);
        //maths- have many method in java find and perform mathematical operations
        //System.out.println(Math.max(20, 50));
        //System.out.println(Math.min(20,50));
        //System.out.println(Math.sqrt(64));
        //System.out.println((int)(Math.random()*1000));
        // input from user, you can use Scanner class to take input from user in any type of data
       // Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your age");
       // int age=sc.nextInt();
       // System.out.println("Your age is "+age);

       //Comparrison operators
       // ==, !=, >, <, >=, <=
       // conditional statements
       //boolean israinning=false;
         //f(israinning== true){
          //  System.out.println("Take an umbrella");
         //}
        // else{
          //  System.out.println("Enjoy the day its not rainnig");
         //}
    // logical operators
    //&&,||,!
    //int num=55;
    //int num1=101;
    //if (num>50 && num1>50){
      //  System.out.println("Both numbers are greater than 50");
    //}
    //else{
       // System.out.println("at least one number is not greater that 50");

    //if (num<50|| num1<150){
       // System.out.println("atleast one number is less than 50");
    //}
    //else{
     //   System.out.println("both number are greater than 50");
    //}
    
    
    Scanner scan=new Scanner(System.in);
    System.out.println("enter your cash");
    int cash=scan.nextInt();
    if (cash>=100000){
        System.out.println("you can buy a laptop");
    }
    else if (cash<=100000 &&  cash>=50000){
        System.out.println("you cant buy a laptop");
    
    }
    else{
        System.out.println("you need more cash to buy a laptop");}
        
    
    

    }

         
           
         
    








        
    
    
}
