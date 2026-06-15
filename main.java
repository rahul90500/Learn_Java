 import java.util.Arrays;
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
    String name = "Ayushi singh";
    System.out.println(name);
       //System.out.println(name.length());
       //String name1=new String("Ayushi singh yadav");
       //System.out.println(name1.length());
       // Concatenation
        String firstName = "Ayushi";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        //System.out.println(fullName);
        //charAt()
        //System.out.println(name.charAt(2)); 
        //replace()
        String newName = firstName.replace("Ayushi", "Rahul");
        System.out.println(newName);
        System.out.println(fullName.substring(0,6));
        // srtring are immutable in java
        int[]marks= {11,22,37,46,50};
        int[]marks1= new int[6];
        marks1[0]=45;
        marks1[1]=80;
        marks1[2]=58;
        marks1[3]=90;
        marks1[4]=75;
        marks1[5]=50;
        System.out.println(marks1[4]);
        System.out.println(marks1.length);
        //sorted array
        Arrays.sort(marks1);
        System.out.println(marks1[5]);
        // 2D array
        int[][] marks2d={{98,99,86},{85,90,95}};
        System.out.println(marks2d[0][2]);
        // casting
        double price=100.00F;
        double finalPrice=price+18.00;
        System.out.println(finalPrice);
        



        
    }
    
}
