public class Day4 {
    public void Grade(int a){
        switch (a) {
            case 70:
            System.out.println("A");
            break;
            case 60:
            System.out.println("B");
            break;
            case 50:
            System.out.println("C");
            break;
            
            default:
                break;
        }
    }
    public void CheckSign(int a){
        if (a>0) System.out.println("Positive");
        else if (a<0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    public static void main(String[] args) {
        Day4 obj = new Day4();
        obj.Grade(60);
    }
}
