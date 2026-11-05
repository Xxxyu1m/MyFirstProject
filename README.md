# File Read Lab
This program reads student names and scores from a text file, and displays the letter grade.

## How to Run
1.Open the program in your IDE.
2.Enter student names and scores.
3.View the output.

## Example Input 
John 
Sarah 

## Example Output
Student grade:
John 85
Sarah 92

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        // TODO A2: Use try–catch to handle FileNotFoundException

        try {
            // TODO B1: Create a Scanner to read the file
            // TODO B2: Print "Student Grades:"
            // TODO B3: Read and print each line from the file
        }
        catch (Exception e) {
            // TODO C1: Print "File not found!" if grades.txt is missing
        }
    }
}
```



## Author 
Sherry

Updated README with lab instructions.
Edit added by Emaan Taquie 

## Collaboration Acknowledgement
This project was reviewed and edited by Emman Taquie on GitHub.
