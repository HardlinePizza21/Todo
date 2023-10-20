import Renders.Renders;
import Users.Users;

public class Main {
  public static void main(String[] args) {
    
    Renders render = new Renders();
    Users usuarios = new Users();
    int opt = render.menuInicio();
    
    System.out.println(opt);
    
    switch (opt) {
        case 1:
            render.logIn();
            break;
        case 2:
            render.crearCuenta();
            break;
        default:
            System.out.println("Opción no reconocida");
    }

    System.out.println(usuarios.cantidadUsuarios());
    System.out.println(usuarios.cantidadTareas());
  }
}

