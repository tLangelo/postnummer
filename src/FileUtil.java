import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtil {

    private Scanner sc;
    private File file;
    private final ArrayList<Postinfo> byListe;

    //cons
    public FileUtil(String filePath) {
        file = new File(filePath);
        byListe = new ArrayList<>();

        try{
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //metode til at læse filen ned på arraylisten
    public void initFile(){

        String line = sc.nextLine();

        while(sc.hasNext()) {
            try {
                String currLine = sc.nextLine();
                String[] splitLine = currLine.split(",");

                byListe.add(createPostinfo(splitLine));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }


    private Postinfo createPostinfo(String[] data){
        int pn = Integer.parseInt(data[0]);
        String name = data[1];

        return new Postinfo(pn,name);
    }

    public ArrayList<Postinfo> getByListe() {
        return byListe;
    }
}
