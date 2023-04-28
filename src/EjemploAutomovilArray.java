import java.util.Arrays;

public class EjemploAutomovilArray {
    public static void main(String[] args) {
            Persona conductor_auto_1 = new Persona("luci", "Martinez");
            Automovil auto_1 = new Automovil("EEUU","KIA");
            auto_1.setColor(Color.Amarillo);
            auto_1.setMotor(new Motor(2.8,TipoMotor.BENCINA));
            auto_1.setEstanque(new Estanque(40));
            auto_1.setTipo(TipoAutomovil.HATCHBACK);
            auto_1.setConductor(conductor_auto_1);


            Persona conductor_auto_2 = new Persona("Pato","Rodriguez");
            Automovil auto_2 =  new Automovil("Anastasia","WOLFVAGEN", Color.GRIS, new Motor(4.8,TipoMotor.DIESEL), new Estanque(50));
            auto_2.setConductor(conductor_auto_2);
            auto_2.setTipo(TipoAutomovil.PICKUP);


            Persona conductor_auto_3 = new Persona("Lalo", "Mena");
            Automovil auto_3 = new Automovil("Rusia","BEBE",Color.ROJO, new Motor(8.7, TipoMotor.BENCINA),new Estanque(50));

            auto_3.setConductor(conductor_auto_3);
            auto_3.setColor(Color.Amarillo);
            auto_3.setTipo(TipoAutomovil.PICKUP);
            Automovil.setPatenteColor(Color.Verde);

            Automovil auto_4 = new Automovil("Surcorea","A3");
            auto_4.setConductor(new Persona("Jano","Perez"));



            Automovil[] autos = new Automovil[4];
            autos[0] = auto_1;
            autos[1] = auto_2;
            autos[2] = auto_3;
            autos[3] = auto_4;

            Arrays.sort(autos);
            for(int i =0; i<autos.length; i++){
                    System.out.println(autos[i]);
            }




    }
}
