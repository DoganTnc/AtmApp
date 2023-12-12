import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap){
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("banakamıza hoşgeldiniz");
        System.out.println("**************");
        System.out.println("kullanici girişi");
        System.out.println("***************");
        int girişHakki=3;
        while (true){
            if (login.login(hesap)){
                System.out.println("giriş başarılı");
                break;
            }
            else {
                System.out.println("giriş başarısız");
                girişHakki-=1;
                System.out.println("kalan giriş hakkı: "+girişHakki);
            }if (girişHakki==0){
                System.out.println("giriş hakkiniz kalmadi");
                return;
            }
        }
        System.out.println("***************");
        String islemler="1.bakiye görüntüle \n"
                +"2.para yatırma\n"+
                "3.para çekme\n"+
                "çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("****************");
        while (true){
            System.out.println("işlemi seçin");
            String islem=scanner.nextLine();
            if (islem.equals("q")){
                break;
            }else if (islem.equals("1")){
                System.out.println(hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar :");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("çekmek istediğiniz tutar");
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }else {
                System.out.println("geçersiz işlem");
            }
        }
    }
}
