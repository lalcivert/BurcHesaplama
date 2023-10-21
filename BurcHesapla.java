package day01;

import java.util.Scanner;

public class BurcHesapla {
    public static void main(String[] args) {

        int gun,ay;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz: ");
        ay=input.nextInt();

        System.out.println("Doğduğunuz günü giriniz: ");
        gun=input.nextInt();

        if((ay==12 && gun>21)||(ay==1 && gun<=21)){
            System.out.println("Burcunuz OĞLAK");
        }else if((ay==1 && gun>21)||(ay==2 && gun<=19)) {
            System.out.println("Burcunuz KOVA");
        }else if((ay==2 && gun>19)||(ay==3 && gun<=20)){
            System.out.println("Burcunuz BALIK");
        }else if((ay==3 && gun>20)||(ay==4 && gun<=20)){
            System.out.println("Burcunuz KOÇ");
        }else if((ay==4 && gun>20)||(ay==5 && gun<=21)){
            System.out.println("Burcunuz BOĞA");
        }else if((ay==5 && gun>21)||(ay==6 && gun<=22)){
            System.out.println("Burcunuz İKİZLER");
        }else if((ay==6 && gun>22)||(ay==7 && gun<=22)){
            System.out.println("Burcunuz YENGEÇ");
        }else if((ay==7 && gun>22)||(ay==8 && gun<=22)){
            System.out.println("Burcunuz ASLAN");
        }else if((ay==8 && gun>22)||(ay==9 && gun<=22)){
            System.out.println("Burcunuz BAŞAK");
        }else if((ay==9 && gun>22)||(ay==10 && gun<=22)){
            System.out.println("Burcunuz TERAZİ");
        }else if((ay==10 && gun>22)||(ay==11 && gun>=21)){
            System.out.println("Burcunuz AKREP");
        }else System.out.println("Burcunuz YAY");
        
    }
}
