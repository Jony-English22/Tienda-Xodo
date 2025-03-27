package cls;

public class Detalle_Compra {
    
    private Integer id;
    private Venta venta;
    private Producto producto;
    private Integer cantidad;
    private Double precio_unitario;
    
    public Detalle_Compra(Integer pId, Venta pVenta, Producto pProducto, Integer pCantidad, Double pPrecio_unitario) {
        this. id             = pId;
        this.venta           = pVenta;
        this.producto        = pProducto;
        this.cantidad        = pCantidad;
        this.precio_unitario = pPrecio_unitario;
        
    }

    public Integer getId() {
        return id;
    }

    public Venta getVenta() {
        return venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setId(Integer pId) {
        this.id = pId;
    }

    public void setVenta(Venta pVenta) {
        this.venta = pVenta;
    }

    public void setProducto(Producto pProducto) {
        this.producto = pProducto;
    }

    public void setCantidad(Integer pCantidad) {
        this.cantidad = pCantidad;
    }

    public void setPrecio_unitario(Double pPrecio_unitario) {
        this.precio_unitario = pPrecio_unitario;
    }

    
    
}
