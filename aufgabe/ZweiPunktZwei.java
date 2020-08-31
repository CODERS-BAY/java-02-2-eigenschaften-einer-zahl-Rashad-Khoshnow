public class ZweiPunktZwei {
    public static void main(String[] args) {
        int number = 30;
        int luckyNumber = -10;

        System.out.println("number is: " + number);

        if(number % 10 == 0){
            System.out.println("Volle");
        }   if (number % 2 == 0) {
            System.out.println("gerade");
        } else {
            System.out.println("ungerade");
        }

        System.out.println("lucky Number: " + luckyNumber);
        if (luckyNumber == 2) {
            System.out.println("That is my lucky number");
        }
            if (luckyNumber > 9 && luckyNumber <= 99 || luckyNumber <-9 && luckyNumber >=-99) {
                System.out.println("zweistellig");
            }
        }
    }