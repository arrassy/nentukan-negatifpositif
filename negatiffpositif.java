import java.util.Scanner;

public class negatiffpositif {

    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int bilangan;
        System.out.print("masukkan bilangan: ");
        bilangan = scanner.nextInt();
        if (bilangan > 0){
            System.out.println("angka : " + bilangan + " adalah bilangan positif");
        } else if (bilangan < 0) {
            System.out.println("angka : " + bilangan + " adalah bilangan negatif");
        } else {
            System.out.println("angka : " + bilangan + " adalah bilangan 0");
        }
    }
}
