import java.io.File;
import java.util.Scanner;

public class Day11 {
    @SuppressWarnings("resource")
    public static void ReadFile(File name){
        try{
            Scanner sc = new Scanner(name);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                }
        } 
        catch(Exception e){
            System.out.println("Error");
            }

    }

    public static void WriteinFile(File name, String text){
        try{
            Scanner sc = new Scanner(name);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                }
                }
                catch(Exception e){
                    System.out.println("Error");
                    }
        
    }
    public static void main(String[] args) {
        File file = new File("test.txt");
        ReadFile(file);
    }
}
