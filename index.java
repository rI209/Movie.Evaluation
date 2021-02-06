import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("原題:");
        String title = scanner.next();
        System.out.print("評価:");
        double star = scanner.nextDouble();
        System.out.println(title + "の評価は☆" + star + "です");
        
    }
}
