package ejercicio;

public class BancaPorInternet extends Decorator{

    private boolean enable;
    public BancaPorInternet(ICuenta iCuenta) {
        super(iCuenta);
    }

    public void operation(){
        this.enable=true;
        super.showData();
        System.out.println(" Habilitando Pagos por internet ");
    }
}
