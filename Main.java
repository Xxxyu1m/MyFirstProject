import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        try {
            File file1 = new File("grades.txt");
            Scanner input = new Scanner(file1);
            System.out.println("Student Grade:");

            while(input.hasNext()){
                String name = input.next();
                int grade = input.nextInt();
                System.out.println(name + " " + grade);
            }
        }catch(Exception e){
            System.out.println("Files not found");
        }
    }
}