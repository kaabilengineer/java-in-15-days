
public class Day1 {

    public void Details(String Name, int marks){
        System.out.println("Name: " + Name + " Marks: " + marks);
    }
    public static void main(String[] args) {
        Day1 d = new Day1();

        d.Details("Atharva", 15);
    }
}