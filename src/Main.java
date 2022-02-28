class Application{
private Controller ctrl = new Controller();

    public void run(){
        ctrl.exec();


    }



}

public class Main {
    public static void main(String[] args) {
        new Application().run();
    }
}
