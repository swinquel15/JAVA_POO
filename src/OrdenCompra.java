import java.util.Date;

public class OrdenCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Productos[] productos;
    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Productos[4];
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public void addProducto(Productos productos){
        if(indiceProductos<this.productos.length){
            this.productos[indiceProductos++] = productos;
        }

    }
    public int getGranTotal() {
        int total = 0;
        for (Productos p : productos) {
            total += p.getPrecio();
        }
        return total;

    }
}
