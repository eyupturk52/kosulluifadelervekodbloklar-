import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int yıl;
        Scanner input=new Scanner(System.in);
        System.out.println("yılı giriniz");
        yıl= input.nextInt();
        if(yıl%4==0){
            if(yıl%100==0){
                if(yıl%400==0){
                    System.out.println("girdiğiniz yıl artık yıl");
            }
                else{
                    System.out.println("artık yıl değil");
                }

        }else{
                System.out.println("artık yıl");
            }
        }
        else {
            System.out.println("artık yıl değil");
        }
        }
        }


