public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station_Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback","Auto Compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto Pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto Utilitario", 4);


    private final String nombre;
    private final String descripcion;
    private final int numeroPuerta;

    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuerta = numeroPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

}

