import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int dogumyılı,kalan;
        Scanner input=new Scanner(System.in);
        System.out.println("dogum yılınızı giriniz:");
        dogumyılı= input.nextInt();
        kalan=dogumyılı%12;
        if(kalan==0){
            System.out.println("çin zodyağı burcunuz:maymun");
        }
        else if(kalan==1){
            System.out.println("çin zodyağı burcunuz:horoz");
        }
        else if(kalan==2){
            System.out.println("çin zodyağı burcunuz:köpek");
        }
        else if(kalan==3){
            System.out.println("çin zodyağı burcunuz:domuz");
        }
        else if(kalan==4){
            System.out.println("çin zodyağı burcunuz:fare");
        }
        else if(kalan==5){
            System.out.println("çin zodyağı burcunuz:öküz");
        }
        else if(kalan==6){
            System.out.println("çin zodyağı burcunuz:kaplan");
        }
        else if(kalan==7){
            System.out.println("çin zodyağı burcunuz:tavşan");
        }
        else if(kalan==8){
            System.out.println("çin zodyağı burcunuz:ejderha");
        }
        else if(kalan==9){
            System.out.println("çin zodyağı burcunuz:yılan");
        }
        else if(kalan==10){
            System.out.println("çin zodyağı burcunuz:at");
        }
        else {
            System.out.println("çin zodyağı burcunuz:koyun");
        }
    }
}
