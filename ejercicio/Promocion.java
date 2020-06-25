package ejercicio;

public class Promocion extends Decorator{

    int numero = (int)(Math.random()*10+1);
    Cuenta cuenta;

    public Promocion(ICuenta iCuenta) {
        super(iCuenta);
    }

    public void operation(){
        super.showData();
        System.out.println("Promocion");

        if (numero%2 == 0 ){
            System.out.println(numero);
            System.out.println("Felicidades su Monto se Duplico");
            cuenta.setMonto(cuenta.getMonto()*2);


        }else{
            System.out.println("NO obtuvo la promocion");
        }

        super.showData();
    }
}
