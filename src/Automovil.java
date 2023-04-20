public class Automovil {
    private int id;
    private  String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private int cantidad = 400;
    private static Color patenteColor = Color.BLANCO;
    private static int capacidadstatic = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public final static Integer VELOCIDAD_MAXIMA_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";


    public  Automovil(){
        this.id = ++ultimoId;

    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int cantidad) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.cantidad = cantidad;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }


    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color =  color;
    }

    public static Color getPatenteColor() {
        return Automovil.patenteColor;
    }

    public static void setPatenteColor(Color patenteColor) {
        Automovil.patenteColor = patenteColor;
    }

    public Double getCilindrada(){
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }



    public String Detalle() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " +this.fabricante);
        sb.append("\n auto.modelo = "+this.modelo);
        sb.append("\n auto.color = "+this.color);
        sb.append("\n auto.cilindrada = "+this.cilindrada);
        return sb.toString();*/

        return "auto.id = "+this.id+
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = "+Automovil.patenteColor+
                "\nauto.cilindrada = " + this.cilindrada;
        }
    public String Acelerar(int rpm){
        return ("El auto de modelo "+this.modelo+" tiene una acelaracion de "+ rpm +"revoluciones por minuto");
        }

    public String Frenar(){
        return("El auto se frenara!!");
    }

    public  String acelerarFrenar(int rpm){
        String acelera = this.Acelerar(rpm);
        String frenar = this.Frenar();

        return (acelera+"\n"+frenar);
    }

    public String calcularConsumo(int km, float porcentajeBencina){
        return ("La cantidad de km por litro es  = "+ km/(cantidad*porcentajeBencina));

    }

    public  String calcularConsumo(int km, int porcentajeBencina){
        return("La cantida de km por litro en float es  = "+km/(cantidad*porcentajeBencina/100f));
    }
    public static String calcularConsumoStatic(int km, int porcentajeBencina){
        return("La cantida de km por litro en float es  = "+km/(Automovil.capacidadstatic*porcentajeBencina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;

        return (this.fabricante!=null && this.modelo!= null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }
}



