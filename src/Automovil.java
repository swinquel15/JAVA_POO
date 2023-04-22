public class Automovil {
    private int id;
    private  String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private TipoAutomovil tipo;
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

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String Detalle() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " +this.fabricante);
        sb.append("\n auto.modelo = "+this.modelo);
        sb.append("\n auto.color = "+this.color);
        sb.append("\n auto.cilindrada = "+this.cilindrada);
        return sb.toString();*/

        String detalle ="auto.id = "+this.id+"\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();
        if(this.getTipo() != null){
            detalle += "\nauto.tipo descri ="+ this.getTipo().getDescripcion();
        }

        detalle += "\nauto.color = " + this.getColor() +"\nauto.patenteColor = "+Automovil.patenteColor;

        if(this.getMotor() !=null){
            detalle+="\nauto.cilindrada = " + this.motor.getCilindrada();
        }

        if(getConductor()!= null) {
            detalle += "\n"+"conductor " + this.getConductor();
        }
        if(getRuedas() != null) {
            detalle += "\n"+"Ruedas de automovil: ";
            for (Rueda r : this.getRuedas()) {
                detalle +="\n"+ "fabricante = " + r.getFabricante() + " Aro = " + r.getAro() + " Ancho = " + r.getAncho();
            }
        }

        return  detalle;




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
        return ("La cantidad de km por litro es  = "+ km/(this.estanque.getCapacidad()*porcentajeBencina));

    }

    public  String calcularConsumo(int km, int porcentajeBencina){
        return("La cantida de km por litro en float es  = "+km/(this.estanque.getCapacidad()*porcentajeBencina/100f));
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

    @Override
    public String toString() {
        return this.id + ";"+ fabricante +" "+ modelo;
    }
}



