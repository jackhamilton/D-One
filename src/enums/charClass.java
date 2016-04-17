package enums;

public enum charClass {
    BARBARIAN (0, 1, 3, 2, 5, 4, 6), 
    BARD (1, 6, 2, 5, 3, 4, 1), 
    CLERIC (2, 4, 6, 2, 5, 1, 3), 
    DRUID (3, 5, 2, 3, 4, 1, 6), 
    FIGHTER (10, 1, 3, 2, 5, 6, 4), 
    MONK (7, 2, 3, 4, 5, 1, 6),
    PALADIN (8, 1, 6, 4, 5, 2, 3), 
    RANGER (4, 2, 1, 5, 4, 3, 6), 
    ROGUE (9, 2, 1, 4, 3, 5, 6), 
    SORCERER (5, 6, 2, 3, 4, 5, 1), 
    WIZARD (6, 6, 2, 3, 1, 5, 4);
    
    public final int id, strp, conp, dexp, intp, wisp, chap;
    charClass(int id, int strp, int dexp, int conp, int intp, int wisp, int chap) {
        this.id = id;
        this.strp = strp;
        this.dexp = dexp;
        this.conp = conp;
        this.intp = intp;
        this.wisp = wisp;
        this.chap = chap;
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