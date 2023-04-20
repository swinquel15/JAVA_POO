public enum Color {
    Amarillo("Amarillo"),
    ROJO("Rojo"),
    Verde("Verde"),
    BLANCO("Blanco"),
    GRIS("Gris");
    private final  String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
