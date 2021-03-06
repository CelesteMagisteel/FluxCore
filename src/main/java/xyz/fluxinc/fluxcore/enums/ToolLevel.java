package xyz.fluxinc.fluxcore.enums;

public enum ToolLevel {

    WOODEN,
    STONE,
    IRON,
    GOLD,
    DIAMOND,
    NETHERITE;

    public static String getName(ToolLevel level) {
        switch (level) {
            case WOODEN:
                return "Wooden";
            case STONE:
                return "Stone";
            case IRON:
                return "Iron";
            case GOLD:
                return "Gold";
            case DIAMOND:
                return "Diamond";
            case NETHERITE:
                return "Netherite";
            default:
                return "";
        }
    }
}
