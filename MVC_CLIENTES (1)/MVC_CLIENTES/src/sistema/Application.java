package sistema;

import sistema.presentation.ventana_patron.Controller;
import sistema.presentation.ventana_patron.Model;
import sistema.presentation.ventana_patron.View;


public class Application {

    public static void main(String[] args) {
        Model model=new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.show();
    }

}
