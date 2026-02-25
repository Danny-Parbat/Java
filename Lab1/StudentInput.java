import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();
        
        //Output
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: " + marks);
        sc.close();
    }
}