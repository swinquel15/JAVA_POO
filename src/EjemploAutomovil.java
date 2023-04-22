public class EjemploAutomovil {
    public static void main(String[] args) {
            Automovil auto_1 = new Automovil("EEUU","KIA");
            Automovil subaru = new Automovil("subaru","impresa");

            auto_1.setColor(Color.Amarillo);
            auto_1.setMotor(new Motor(2.8,TipoMotor.BENCINA));
            auto_1.setEstanque(new Estanque(40));
            auto_1.setConductor(new Persona("Joaquin", "Mendez"));

            Rueda[] ruedas_auto1 = new Rueda[5];
            ruedas_auto1[0] = new Rueda("pirelli", 20, 11.5);
            ruedas_auto1[1] = new Rueda("pirelli", 20, 11.5);
            ruedas_auto1[2] = new Rueda("pirelli", 20, 11.5);
            ruedas_auto1[3] = new Rueda("pirelli", 20, 11.5);
            ruedas_auto1[4] = new Rueda("pirelli", 20, 11.5);

            auto_1.setRuedas(ruedas_auto1);

            Automovil.setPatenteColor(Color.ROJO);
            auto_1.setTipo(TipoAutomovil.FURGON);
            Automovil auto_2 =  new Automovil("CHINA","WOLFVAGEN");
            Rueda[] ruedas_auto2 = {new Rueda("yokohama",25,17.8),
                        new Rueda("yokohama",25,17.8),
                        new Rueda("yokohama",25,17.8),
                        new Rueda("yokohama",25,17.8),
                        new Rueda("yokohama",25,17.8)};
            System.out.println(Automovil.VELOCIDAD_MAXIMA_CARRETERA);
            System.out.println(Automovil.VELOCIDAD_MAXIMA_CIUDAD);

            auto_2.setColor(Color.Verde);
            auto_2.setEstanque(new Estanque(60));
            auto_2.setTipo(TipoAutomovil.COUPE);
            auto_2.setRuedas(ruedas_auto2);

            Automovil auto_3 = new Automovil("Rusia","price",Color.ROJO, new Motor(8.7, TipoMotor.DIESEL),new Estanque(50));
            Rueda[] ruedas_auto3 = {new Rueda("nikita",22,15.9),
                    new Rueda("nikita",22,15.9),
                    new Rueda("nikita",22,15.9),
                    new Rueda("nikita",22,15.9),
                    new Rueda("nikita",22,15.9)};
            auto_3.setConductor(new Persona("carlos","pelinco"));
            auto_3.setTipo(TipoAutomovil.CONVERTIBLE);
            auto_3.setRuedas(ruedas_auto3);

            System.out.println(auto_1.getFabricante());
            System.out.println(auto_1.getTipo().getDescripcion());
            System.out.println(auto_2.getColor());
            System.out.println(auto_2.getTipo().getNumeroPuerta());

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
