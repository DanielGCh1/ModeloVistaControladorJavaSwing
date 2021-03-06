package sistema.presentation.ventana_patron;

import java.util.Observable;
import java.util.Observer;
import sistema.logic.Cliente;

public class Model extends Observable{
    
    // Model attributes here
    // Model gets and sets here
    
    Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();
    }
    
}











