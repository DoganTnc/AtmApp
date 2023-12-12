//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Atm atm=new Atm();
        Hesap hesap=new Hesap("Dogantnc34","8390",2000);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor");
    }
}