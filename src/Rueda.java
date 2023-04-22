public class Rueda {
    private String fabricante;
    private Integer aro;
    private Double ancho;

    public Rueda(String fabricante, Integer aro, Double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;

    }

    public String getFabricante() {
        return fabricante;
    }

    public Integer getAro() {
        return aro;
    }

    public Double getAncho() {
        return ancho;
    }
}
