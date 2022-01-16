import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.print("lutfen degerleri giriniz:");
        n1= input.nextInt();
        n2= input.nextInt();
        System.out.println("yapmak istediginiz işlemi seciniz");
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        int islem;
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.println("toplam="+ (n1+n2));
                break;
            case 2:
                System.out.println("kalan="+ (n1-n2));
                break;
            case 3:
                System.out.println("çarpım="+ (n1*n2));
                break;
            case 4:
                System.out.println("bölüm="+ (n1/n2));
                break;
            default:
                System.out.println("yanlış bir şey seçtiniz");
        }
    }
}
