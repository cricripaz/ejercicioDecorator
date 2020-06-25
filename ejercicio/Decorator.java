package ejercicio;

public class Decorator implements ICuenta{


    private ICuenta iCuenta;

    public Decorator(ICuenta iCuenta){
        this.iCuenta =iCuenta;
    }
    @Override
    public void showData() {

        this.iCuenta.showData();

    }
}
