package enums;

public enum race {
    HUMAN (0, 0, 0, 0, 0, 0, 0), 
    DWARF (1, 0, 0, 2, 0, 0, -2), 
    ELF (2, 0, 2, -2, 0, 0, 0), 
    GNOME (3, 0, 0, 2, -2, 0, 0), 
    HALFLING (4, -2, 2, 0, 0, 0, 0), 
    HALFELF (5, 0, 0, 0, 0, 0, 0),
    HALFORC (6, 2, 0, 0, -2, 0, -2);

    public final int id, strMod, dexMod, conMod, intMod, wisMod, chaMod;
    race(int id, int str, int dex, int con, int intg, int wis, int cha) {
        this.id = id;
        strMod = str;
        dexMod = dex;
        conMod = con;
        intMod = intg;
        wisMod = wis;
        chaMod = cha;
    }        
    
    public static race getRace(int id) {
        switch (id) {
            case 0:
                return race.HUMAN;
            case 1:
                return race.ELF;
            case 2:
                return race.DWARF;
            case 3:
                return race.GNOME;
            case 4:
                return race.HALFLING;
            case 5:
                return race.HALFELF;
            case 6:
                return race.HALFORC;
        }
        return race.HUMAN;
    }
}