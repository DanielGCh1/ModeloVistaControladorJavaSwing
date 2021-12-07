package sistema.logic;

import java.util.HashMap;
import java.util.Map;
import sistema.data.Data;
import sistema.data.XmlPersister;

public class Service {
    
    // Singleton implementation
    private static Service theInstance;
    public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    
    // Service data
      private Data data;
    //Map<String, Cliente> clientes;
    

    
    // Service methods
    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result=data.getClientes().stream().filter(c->c.getCedula().equals(cedula)).findFirst().orElse(null);
       //Cliente result=clientes.get(cedua);
        if (result!=null) return result;
        else throw new Exception("Cliente no existe");   
    }
    
    public Service() {
        try{
            data=XmlPersister.instance().load();
        }
        catch(Exception e){
            data =  new Data();
        }
        
        //        clientes = new HashMap<>();
        //        clientes.put("111", new Cliente("111","Juan","212121"));
        //        clientes.put("222", new Cliente("222","Maria","222222"));
    }
    
}
