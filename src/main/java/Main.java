

import controller.ControllerToDoList;
import model.Dia;
import view.ViewToDoList;

public class Main {

    public static void main(String[] args){

        ControllerToDoList controller = new ControllerToDoList();
        Dia dia = new Dia();
        ViewToDoList view = new ViewToDoList();

        controller.iniciar();
        
    }
}

