import java.util.Scanner;
public class deneme2 {
    public static void main(String[] args) {


        double kilo,boy;
        Scanner inp = new Scanner(System.in);
        Scanner pin = new Scanner(System.in);

        System.out.print("KILONUZU GIRINIZ : ");
        kilo = inp.nextInt();
        System.out.print("BOYUNUZU GIRINIZ : ");
        boy = pin.nextInt();

         int cikti = (int) ((boy*boy) / kilo);

         System.out.print("VUcut KItle Indeksiniz : " +cikti);

    }
    }