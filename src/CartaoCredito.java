import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    //constructor
    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    //metodo pra ver se o lançamento da compra é possivel ou nao (com base no limite/saldo)
    public boolean lancaCompra(Compra compra) {

        if (this.saldo > compra.getValor()){ //saldo maior que a compra
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false; //else
    }

    //getters
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
