package ClassDesignHints;

/**
 *
 * @author Fardan
 */
public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    
    @Override
    void printDojutsu() {
        super.printDojutsu();
        System.out.println(this.Dojutsu);
    }
}
