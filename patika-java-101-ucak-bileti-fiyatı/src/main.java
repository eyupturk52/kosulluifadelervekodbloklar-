import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    int yas,mesafe,gdtipi;
    Scanner input=new Scanner(System.in);
        double yindirimioranı;
        double gdindirimoranı;
        double gdindirimi;
        double yindirimi;
        System.out.println("yasınızı giriniz:");
        yas=input.nextInt();
        System.out.println("mesafeyi giriniz:");
        mesafe= input.nextInt();
        System.out.println("yolculuk tipini seciniz:1-tek yön 2-gidiş-dönüş");
        gdtipi=input.nextInt();
        if(yas>0 && mesafe>0 && (gdtipi==1||gdtipi==2)){
            double ntutar = mesafe * 0.10;
            if(yas<12 && gdtipi==1) {
            yindirimioranı = 0.5;
            yindirimi = ntutar * yindirimioranı;
            ntutar=ntutar-yindirimi;
            System.out.println("tutar=" +ntutar);
            }
            else if(yas<12 && gdtipi==2) {
                yindirimioranı = 0.5;
                yindirimi = ntutar * yindirimioranı;
                ntutar=ntutar-yindirimi;
                gdindirimoranı = 0.2;
                gdindirimi= ntutar * gdindirimoranı;
                ntutar=ntutar-gdindirimi;
                ntutar=ntutar*2;
                System.out.println("tutar=" +ntutar);
            }
             else if(yas>12 && yas<24 && gdtipi==1) {
                yindirimioranı = 0.1;
                yindirimi = ntutar * yindirimioranı;
                ntutar=ntutar-yindirimi;
                System.out.println("tutar=" +ntutar);
            }
            else if(yas>12 && yas<24 && gdtipi==2) {
                yindirimioranı = 0.1;
                yindirimi = ntutar * yindirimioranı;
                ntutar=ntutar-yindirimi;
                gdindirimoranı = 0.2;
                gdindirimi= ntutar * gdindirimoranı;
                ntutar=ntutar-gdindirimi;
                ntutar=ntutar*2;
                System.out.println("tutar=" +ntutar);
            }
            else if(yas>65 && gdtipi==1) {
                yindirimioranı = 0.3;
                yindirimi = ntutar * yindirimioranı;
                ntutar=ntutar-yindirimi;
                System.out.println("tutar=" +ntutar);
            }
            else if(yas>65 && gdtipi==2) {
                yindirimioranı = 0.3;
                yindirimi = ntutar * yindirimioranı;
                ntutar=ntutar-yindirimi;
                gdindirimoranı = 0.2;
                gdindirimi= ntutar * gdindirimoranı;
                ntutar=ntutar-gdindirimi;
                ntutar=ntutar*2;
                System.out.println("tutar=" +ntutar);
            }
        else{
                System.out.println("tutar=" +ntutar);
            }
        }
        else{
            System.out.println("hatalı veri girdiniz!!!");
        }







    }

}

