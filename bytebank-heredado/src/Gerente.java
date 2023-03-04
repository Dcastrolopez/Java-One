
public class Gerente extends Funcionario implements Autenticable {

   
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    public void setClave(String clave) {
        // TODO Auto-generated method stub

    }

    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        return false;
    }
}
