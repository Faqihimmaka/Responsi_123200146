package Responsi_123200146;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewAslab view = new ViewAslab();
        ModAslab model = new ModAslab();
        Cont controller = new Cont(model, view);
    }
    
}
