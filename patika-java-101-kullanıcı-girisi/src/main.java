import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sifre,kullanıcıadı;
        System.out.print("kullanıcı adınızı girin");
        kullanıcıadı=input.nextLine();
        System.out.print("sifrenizi giriniz");
        sifre= input.nextLine();
        int secim;
        if(kullanıcıadı.equals("patika") && sifre.equals("java123")){
            System.out.println("bilgiler dogru.Sisteme girdiniz");
        }
        else{
            System.out.println("bilgiler yanlış.sifrenizi değiştirmek ister misiniz:");
            System.out.println("1-evet 2-hayır");
            secim= input.nextInt();
            if(secim==1){
                Scanner girdi=new Scanner(System.in);
                System.out.println("yeni sifrenizi giriniz");
                sifre= girdi.nextLine();
                if(sifre.equals("java123")){
                    System.out.println("şifre oluşturulamadı");
                }
                else{
                    System.out.println("yeni şifreniz oluşturuldu");
                }
            }
            else{
                System.out.println("sisteme girmeyi yeniden deneyin");
            }
        }
    }
}