package ejercicio;

public class Seguro extends Decorator{

    final double X =40;
    Cuenta cuenta ;


    public Seguro(ICuenta iCuenta) {
        super(iCuenta);
    }


    public void operation(){
        super.showData();
        System.out.println("SEGURO ");
        System.out.println("Debitando dinero de Su Cuenta "+"Monto : "+ X );
        cuenta.setMonto(cuenta.getMonto()+X);
        super.showData();

    }
}
