import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limitCard;
    private double saldo;
    private List<Compra> compras;

    public CreditCard(double limitCard) {
        this.limitCard = limitCard;
        this.saldo = limitCard;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }else{
            return false;
        }
    }

    public double getLimitCard() {
        return limitCard;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
