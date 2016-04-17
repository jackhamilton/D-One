package enums;

public enum race {
    HUMAN (0, 0, 0, 0, 0, 0), 
    DWARF (0, 0, 2, 0, 0, -2), 
    ELF (0, 2, -2, 0, 0, 0), 
    GNOME (0, 0, 2, -2, 0, 0), 
    HALFLING (-2, 2, 0, 0, 0, 0), 
    HALFELF (0, 0, 0, 0, 0, 0),
    HALFORC (2, 0, 0, -2, 0, -2);

    public final int strMod, dexMod, conMod, intMod, wisMod, chaMod;
    race(int str, int dex, int con, int intg, int wis, int cha) {
        strMod = str;
        dexMod = dex;
        conMod = con;
        intMod = intg;
        wisMod = wis;
        chaMod = cha;
    }        
}