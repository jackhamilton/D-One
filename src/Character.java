
import enums.charClass;
import enums.race;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.paint.Color;


/**
 *
 * @author Jack
 */
public class Character {
    
    public int id = 0;
    private static int idCounter = 0;
    public String name = "";
    public boolean player = false;
    //false = male
    public boolean gender = false;
    public String alignment = "NN";
    public int age = 0;
    public int weight = 120;
    public String group = "";
    public String location = "";
    public List<String> languages = new ArrayList();
    public String notes = "";
    public Color hair = Color.BROWN;
    public Color eyes = Color.BROWN;
    public Color skin = Color.WHITE;
    public int str = 0, dex = 0, con = 0, intg = 0, wis = 0, cha = 0;
    public race race;
    public charClass charClass;
    
    public Character() {
        id = idCounter;
        idCounter++;
    }
    
}