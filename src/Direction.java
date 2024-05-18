enum Direction {
    NORTH(0, "ჩრდილოეთი"),
    EAST(90, "აღმოსავლეთი"),
    SOUTH(180,"სამხრეთი"),
    WEST(270, "დასავლეთი");
    private final int degrees;
    private final String translate;

    Direction(int degrees, String translate) {
        this.degrees = degrees;
        this.translate = translate;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getTranslate() {
        return degrees;
    }
}