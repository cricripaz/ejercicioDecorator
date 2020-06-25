package ejercicio;

public class Client {
    public static void main(String[] args) {

        ICuenta cuenta = new Cuenta("Pedro",500);

        ICuenta cuenta2 = new Cuenta("Juan",800);


        cuenta = new Promocion(cuenta);
    
        cuenta.showData();

        cuenta2 = new BancaPorInternet(cuenta2);


        cuenta2 = new Seguro(cuenta2);

        cuenta2 = new Promocion(cuenta2);
        cuenta2.showData();








    }

}
