public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru","impresa");
        subaru.setMotor(new Motor(2.6,TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.STATION_WAGON);

        TipoAutomovil tipo_subaru =subaru.getTipo();
        System.out.println("tipo subaru = "+ tipo_subaru.getNombre());
        System.out.println("tipo desc. subaru= "+ tipo_subaru.getDescripcion());

        switch (tipo_subaru){
            case SEDAN ->
                    System.out.println("El equipo es Auto mediano y descapotable en 4 puertas");
            case STATION_WAGON ->
                    System.out.println("El equipo es Auto Grande y descapotable en 4 puertas");
            case HATCHBACK ->
                    System.out.println("El equipo es Auto Compacto y descapotable en 4 puertas");
            case PICKUP ->
                    System.out.println("El equipo es Camioneta y descapotable en 4 puertas");
            case COUPE ->
                    System.out.println("El equipo es Auto pequeño y descapotable en 2 puertas");
            case CONVERTIBLE ->
                    System.out.println("El equipo es Auto Deportivo y descapotable en 4 puertas");
            case FURGON ->
                    System.out.println("El equipo es Auto Utilitario y descapotable en 4 puertas");
        }

        TipoAutomovil[] tipo = TipoAutomovil.values();
        for(TipoAutomovil ta:tipo){
            System.out.println(ta+" => "+ ta.getNombre()+","+ta.getDescripcion()+","+ta.getNumeroPuerta());
        }

    }
}
