package ejercicio;

public class Cuenta implements ICuenta{
    private String nombre;
    private double monto;


    public Cuenta(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void showData() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Monto :" +
                " " + monto);
    }
}
