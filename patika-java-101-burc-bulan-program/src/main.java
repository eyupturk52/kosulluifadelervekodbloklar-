import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int ay,tarih;
        Scanner input=new Scanner(System.in);
        System.out.println("dogdugunuz ayı girin:");
        ay=input.nextInt();
        System.out.println("dogum gününüzü girin:(sadece gün):");
        tarih=input.nextInt();
        if(ay==1){
            if(tarih<22){
                System.out.println("burcunuz oğlak");
            }
            else{
                System.out.println("burcunuz kova");
            }
        }
        if(ay==2){
            if(tarih<20){
                System.out.println("burcunuz kova");
            }
            else{
                System.out.println("burcunuz balık");
            }
        }
        if(ay==3){
            if(tarih<21){
                System.out.println("burcunuz balık");
            }
            else{
                System.out.println("burcunuz koç");
            }
        }
        if(ay==4){
            if(tarih<21){
                System.out.println("burcunuz koç");
            }
            else{
                System.out.println("burcunuz boğa");
            }
        }
        if(ay==5){
            if(tarih<22){
                System.out.println("burcunuz boğa");
            }
            else{
                System.out.println("burcunuz ikizler");
            }
        }
        if(ay==6){
            if(tarih<23){
                System.out.println("burcunuz ikizler");
            }
            else{
                System.out.println("burcunuz yengeç");
            }
        }
        if(ay==7){
            if(tarih<23){
                System.out.println("burcunuz yengeç");
            }
            else{
                System.out.println("burcunuz aslan");
            }
        }
        if(ay==8){
            if(tarih<23){
                System.out.println("burcunuz aslan");
            }
            else{
                System.out.println("burcunuz başak");
            }
        }
        if(ay==9){
            if(tarih<23){
                System.out.println("burcunuz başak");
            }
            else{
                System.out.println("burcunuz terazi");
            }
        }
        if(ay==10){
            if(tarih<23){
                System.out.println("burcunuz terazi");
            }
            else{
                System.out.println("burcunuz akrep");
            }
        }
        if(ay==11){
            if(tarih<22){
                System.out.println("burcunuz akrep");
            }
            else{
                System.out.println("burcunuz yay");
            }
        }
        if(ay==12){
            if(tarih<22){
                System.out.println("burcunuz yay");
            }
            else{
                System.out.println("burcunuz oğlak");
            }
        }
    }
}
