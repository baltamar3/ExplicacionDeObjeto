package clases;

/**
 *
 * @author baltamar3
 */
public class Cuenta {

    private long numero_cuenta;
    private long identificacion;
    private double saldo_actual;

    public Cuenta(long numero_cuenta, long identificacion, double saldo_actual) {
        this.numero_cuenta = numero_cuenta;
        this.identificacion = identificacion;
        this.saldo_actual = saldo_actual;
    }

    public Cuenta(long numero_cuenta, long identificacion) {
        this.numero_cuenta = numero_cuenta;
        this.identificacion = identificacion;
        this.saldo_actual = 0;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void actualizarSaldo(double interes_anual) {

        double aux, aux2;
        aux = this.getSaldo_actual() * (interes_anual / 365);
        aux2 = this.getSaldo_actual() + aux;
    }

    public void ingresar(double ingreso) {
        double aux;

        aux = this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(aux);
    }

    public void retirar(double egreso) {
        double aux;
        aux = this.saldo_actual - egreso;
        this.setSaldo_actual(aux);
    }

    public String mostrar() {
        String aux;
        aux = "No. de la cuenta: " + this.numero_cuenta + "\n"
                + "No. de identificacion: " + this.identificacion + "\n"
                + "Saldo actual: " + this.getSaldo_actual();
        return aux;
    }

}
