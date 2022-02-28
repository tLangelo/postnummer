import java.util.Scanner;

public class Controller {
    private FileUtil fu = new FileUtil("resources/danske-postnumre-byer-ny - Sheet 1.csv");
    private Scanner sc = new Scanner(System.in);


    public void exec(){
        fu.initFile();
        String userInput;
        do {
            welcomeMSG();
            userInput = sc.nextLine();
            switch (userInput){
                case "1":
                    System.out.println("Indtast et postnummer: ");
                    System.out.println(findBy(sc.nextInt()));
                    sc.nextLine();
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }while(true);

    }

    private void welcomeMSG(){
        System.out.println("\nVelkommen til postnummer programmet." +
                "\nHvad vil du gerne?" +
                "\n1.\tFind by" +
                "\n2.\tLuk");
    }


    private Postinfo findBy(int postNummer){

    for (Postinfo pi : fu.getByListe()) {
        if(pi.getPostnummer() == postNummer)
            return pi;
    }

    return null;
}

}
