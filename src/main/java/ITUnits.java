/**
 * Created by Krisztian_Barabas on 13.02.2017.
 */
public enum ITUnits {
    bit("Bit", 1),
    Byte("Byte",8),
    Kib("KibiByte",1024),
    KB("KiloByte",1000);

    private String unitName;
    private int unitBits;
    ITUnits(String unitName, int unitBits) {
        this.unitName = unitName;
        this.unitBits = unitBits;
    }
    String getName(){return unitName;}
    int getBits() {return unitBits;}

    static String getUnitNames() {
        String unitNames = "(";
        for (ITUnits unit: ITUnits.values()) {
            unitNames += unit.unitName;
            unitNames += ", ";
        }
        unitNames = unitNames.substring(0,unitNames.length()-2);
        unitNames += ")";
        return unitNames;
    }
    static ITUnits getUnit(String fromUnit) {
        for (ITUnits unit : ITUnits.values()) {
            if (unit.name().equals(fromUnit)) {
                return ITUnits.valueOf(fromUnit);
            }
        }
        return null;
    }
}
