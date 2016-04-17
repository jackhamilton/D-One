package enums;

public enum charClass {
    BARBARIAN (0), 
    BARD (1), 
    CLERIC (2), 
    DRUID (3), 
    FIGHTER (10), 
    MONK (7),
    PALADIN (8), 
    RANGER (4), 
    ROGUE (9), 
    SORCERER (5), 
    WIZARD (6);
    
    public final int id;
    charClass(int id) {
        this.id = id;
    }
    
    public static charClass getClass(int id) {
        switch (id) {
            case 0:
                return BARBARIAN;
            case 1:
                return BARD;
            case 2:
                return CLERIC;
            case 3:
                return DRUID;
            case 4:
                return RANGER;
            case 5:
                return SORCERER;
            case 6:
                return WIZARD;
            case 7:
                return MONK;
            case 8:
                return PALADIN;
            case 9:
                return ROGUE;
            default:
                return FIGHTER;
        }
    }
}