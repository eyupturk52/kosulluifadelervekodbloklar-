import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner input=new Scanner(System.in);
        System.out.println("sıcaklık (derece cinsinden) giriniz:");
        sıcaklık=input.nextInt();
        if(sıcaklık<5) {
            System.out.println("bu havada kayak yapılır.");
        }
        else if(sıcaklık>5 && sıcaklık<15){
            System.out.println("sinemaya gitmek için bir sıcaklık");
        }
        else if(sıcaklık>15 && sıcaklık<25){
            System.out.println("bu havada piknik patlar");
        }
        else{
            System.out.println("bu havada sadece yüzülür");
        }
    }
}
