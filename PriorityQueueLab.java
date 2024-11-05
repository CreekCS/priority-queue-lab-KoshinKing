import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PriorityQueueLab {
    public static void main(String[] args) {
        PriorityQueue<Integer> prioQ = new PriorityQueue<Integer>();
        File file = new File("RandIntegers.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextInt()) {
                int value = fileScanner.nextInt();
                prioQ.add(value);
            }
            fileScanner.close();
            System.out.println("Integers in the PriorityQueue:");
            while (!prioQ.isEmpty()) {
                System.out.println(prioQ.poll());  
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
    }
}

