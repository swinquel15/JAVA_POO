public class EjemploAutomovil {
    public static void main(String[] args) {
            Automovil auto_1 = new Automovil("EEUU","KIA");

            auto_1.setColor(Color.Amarillo);
            auto_1.setCilindrada(6.8);
            Automovil.setPatenteColor(Color.ROJO);

            Automovil auto_2 =  new Automovil("CHINA","WOLFVAGEN");

            System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
            System.out.println(Automovil.VELOCIDAD_MAXIMA_CIUDAD);

            auto_2.setColor(Color.Verde);
            auto_2.setCilindrada(8.9);

            Automovil auto_3 = new Automovil();

            System.out.println(auto_1.getFabricante());
            System.out.println(auto_2.getColor());

            System.out.println(auto_1.Acelerar(4000));
            System.out.println(auto_2.Acelerar(8000));

            System.out.println(auto_1.Frenar());
            System.out.println(auto_2.Frenar());

            System.out.println(auto_2.acelerarFrenar(1000));

            System.out.println(auto_2.calcularConsumo(1000,0.60f));
            System.out.println(auto_1.calcularConsumo(5000,70));

            System.out.println(auto_1.Detalle());
            System.out.println(auto_2.Detalle());
            System.out.println(auto_3.Detalle());
    }
}
