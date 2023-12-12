import java.util.Scanner;

public class Login {
    public  boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.println("kullanici adi :");
        kullanici_adi= scanner.nextLine();
        System.out.println("parola :");
        parola=scanner.nextLine();
        if(hesap.getKullaniciAdi().equals(kullanici_adi)&&hesap.getParola().equals(parola)){
            return true;
        }else {
            return false;
        }
    }
}
