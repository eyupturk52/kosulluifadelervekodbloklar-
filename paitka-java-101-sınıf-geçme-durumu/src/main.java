import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,muzık;
        int toplam=0;
        double ortalama;
        Scanner input=new Scanner(System.in);

        System.out.print("matematik notunuzu girin");
        matematik= input.nextInt();
        System.out.print("fizik notunuzu girin");
        fizik= input.nextInt();
        System.out.print("kimya notunuzu girin");
        kimya= input.nextInt();
        System.out.print("turkce notunuzu girin");
        turkce= input.nextInt();
        System.out.print("muzik notunuzu girin");
        muzık= input.nextInt();
        if(matematik>0 && matematik<100 ){
            toplam+=matematik;
        }
        if(fizik>0 && fizik<100 ){
            toplam+=fizik;
        }
        if(kimya>0 && kimya<100 ){
            toplam+=kimya;
        }
        if(turkce>0 && turkce<100 ){
            toplam+=turkce;
        }
        if(muzık>0 && muzık<100 ){
            toplam+=muzık;
        }
        ortalama=toplam/5;
        if(ortalama>55){
            System.out.println("sınıfı geçtiniz");
            System.out.println(ortalama);
        }
        else{
            System.out.println("sınıfta kaldınız seneye görüşürüz");
            System.out.println(ortalama);
        }
    }
}
