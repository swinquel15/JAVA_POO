import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden_1 = new OrdenCompra("Compras componentes pc");
        orden_1.setCliente(new Cliente("Andrez", "Guzman"));
        orden_1.setFecha(new Date());

        orden_1.addProducto(new Productos("Wester Digital","Unidad SSD 480GB", 10));
        orden_1.addProducto(new Productos("MSI","Monitor optx g271", 20));
        orden_1.addProducto(new Productos("AMD","Procesador Ryzem 9 5900x", 30));
        orden_1.addProducto(new Productos("EVGA","Tarjeta de video EVGA RTX 3080TI", 40));

        OrdenCompra orden_2 = new OrdenCompra("Compras Electrodomesticos");
        orden_2.setCliente(new Cliente("John", "Hitler"));
        orden_2.setFecha(new Date());

        orden_2.addProducto(new Productos("Fensa","Cocina",10));
        orden_2.addProducto(new Productos("Samsung","Refrigerador", 20));
        orden_2.addProducto(new Productos("Midea","Lavadora", 30));
        orden_2.addProducto(new Productos("Irobot","Aspiradora",40));



        OrdenCompra orden_3 = new OrdenCompra("Compras de utiles escolares");
        orden_3.setCliente(new Cliente("Carlos","Pelinco"));
        orden_3.setFecha(new Date());

        orden_3.addProducto(new Productos("Faber Castell","Crayones",10));
        orden_3.addProducto((new Productos("Vinifan","papel lustre", 20)));
        orden_3.addProducto(new Productos("Artesco","Cuaderno 100 hojas", 30));
        orden_3.addProducto(new Productos("Pilot", "Lapicero azul", 40));

        OrdenCompra[] ordenes = {orden_1, orden_2, orden_3};

        for(OrdenCompra orden : ordenes){
            System.out.println("Identificador: " + orden.getId() );
            System.out.println("Cliente: "+ orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Productos p : orden.getProductos()){
                System.out.println("Producto "+ i +": "+ p.getNombre()+" "+p.getFabricante()+" "+"Precio: "+" "+p.getPrecio());
                i++;
            }
            System.out.println("------------siguiente!!-------------");
        }


    }
}
