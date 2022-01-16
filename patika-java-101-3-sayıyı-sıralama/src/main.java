import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a,b,c;
        int enkucuk,orta,enbuyuk;
        Scanner input=new Scanner(System.in);
        System.out.println("3 tane sayı giriniz:");
        a=input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        if(a<b && a<c){
            enkucuk=a;
            if(b<c){
                orta=b;
                enbuyuk=c;
            }
            else{
                enbuyuk=b;
                orta=c;
            }
        }
        else if(b<a && b<c){
            enkucuk=b;
            if(a<c){
                orta=a;
                enbuyuk=c;
            }
            else{
                orta=c;
                enbuyuk=a;
            }
        }
        else{
            enkucuk=c;
            if(a<b){
                orta=a;
                enbuyuk=b;
            }
            else{
                orta=b;
                enbuyuk=a;
            }
        }
        System.out.println("girilen sayıların en küçüğü:"+enkucuk);
        System.out.println("girilen sayıların ortancası:" +orta);
        System.out.println("girilen sayıların en büyüğü:"+enbuyuk);
    }
}
