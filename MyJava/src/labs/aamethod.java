package labs;

import java.util.Scanner;

public class aamethod {

        int toner = 0;
        int  page = 50;

    public void Levels(){
        int tonerL = toner;
        int pageL = page;
        System.out.println("Printer status: Papers "+pageL+" : Toner "+tonerL);
    }

    public void inkFill(int userfill){
        //toner= toner + userfill;
        while (toner < 0) {
            toner = 0;
            int res2 = toner + userfill;
            System.out.println("Ink level " + res2);
        }
            if (toner > 100) {
                System.out.println("Wrong entry");
                Scanner input = new Scanner(System.in);
                System.out.println("Please try it again : ");
                int inputInk2 = input.nextByte();
                if (toner > 100) {
                    System.out.println("Please call a technician.");
                }
            } else if (toner <= 0) {
                System.out.println("Wrong entry");
                Scanner input = new Scanner(System.in);
                System.out.println("Please try it again : ");
                int inputInk3 = input.nextByte();
                if (toner <= 0) {
                    System.out.println("Please call a technician.");
                }
            } else {
                System.out.println("New toner level " + toner);
            }
    }
    public void paperFill(int userfill){
        page= page + userfill;
        if(page>100){
            System.out.println("Wrong entry");
            Scanner input = new Scanner(System.in);
            System.out.println("Please try it again : ");
            int inputPaper2 = input.nextByte();
            if(page>100){
                System.out.println("Please call a technician.");
            }
        }else if(page <= 0) {
            System.out.println("Wrong entry");
            Scanner input = new Scanner(System.in);
            System.out.println("Please try it again : ");
            int inputPaper3 = input.nextByte();
            if (page <= 0) {
                System.out.println("Please call a technician.");
            }
        }else{
            System.out.println("New toner level "+page);
        }

    }
    public void userPageUsed(int newEntry){
        page = page - newEntry;
        System.out.println("Paper count left "+page+" pages");
        if(page<=0){
            System.out.println("Paper tray is empty "+page);
        }
    }
    public void userInkUsed(int newEntry){
        toner = toner - newEntry;
        System.out.println("Toner level "+toner);
        if(toner<10){
            System.out.println("Ink level Low, please refill toner.");
        }

    }
    /// double pages use
    public void userInkDouble(int newEntry){
        toner = toner - (newEntry *2);
        System.out.println("Toner level "+toner);
        if(toner<10){
            System.out.println("Ink level Low, please refill toner.");
        }

    }

}
