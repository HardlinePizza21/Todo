package Users;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Users { 
  //Asi se ve el usuario
  //Nombre-contraseña-titulo-tarea-titulo-tarea-titulo-tarea-titulo-tarea
  File archivo = new File("Users/archivo.txt");
  public String[][] usuarios;

  
  public int cantidadUsuarios(){
    int cantidad = 0;
    try{
      Scanner sc = new Scanner(archivo);
      while(sc.hasNextLine()){
        cantidad++;
        sc.nextLine();
      }
      sc.close();
    
    }catch(FileNotFoundException e){
      System.out.println("Algo fallo contando los usuarios");
    }
    return cantidad;
  }

  //Debe retornar el usuario con la mayor cantidad de tareas
  public int largoUsuarios(){
    int cantidad = -1;

    try{
      Scanner sc = new Scanner(archivo);
      while(sc.hasNextLine()){
        
      }
      sc.close();

    }catch(FileNotFoundException e){
      System.out.println("Algo fallo contando los usuarios");
    }
    return cantidad;
  }

  // public void cargarUsuarios(){

  //   try{
  //     Scanner sc = new Scanner(archivo);
  //     while(sc.hasNextLine()){
  //       String usuario = sc.nextLine();
  //       for(int i = 0; i < usuario.length(); i++){
          
  //       }
  //     }
  //     sc.close();

  //   }catch(FileNotFoundException e){
  //     System.out.println("Algo fallo contando los usuarios");
  //   }
    
  // }
  
  
  public Users(){

    
    if (archivo.exists()) {
      
      usuarios = new String[cantidadUsuarios()][2 + largoUsuarios()];
      
    } else {
        try {  
          archivo.createNewFile();
        } catch(IOException e){
          System.out.println("La cagaste en lo siguiente: " + e.getMessage());
        }
        
    }
  }

  

  // public void addUser(){
  //   try{
  //     FileWriter escribir = new FileWriter("Users/archivo.txt");    
  //     escribir.write("Hola mundo");
  //     escribir.close();

  //   }catch(IOException e){
  //     System.out.println("NO funciono la escritura");
  //   }


  // public int cantidadUsuarios(){
  //   int cantidad = 0;
  //   try{
  //     Scanner sc = new Scanner(archivo);
  //     while(sc.hasNextLine()){
  //       cantidad++;
  //     }
  //     sc.close();
  //   }catch(FileNotFoundException e){
  //     System.out.println("No se encontro el archivo");
  //   }
  //   return cantidad;
  // }

  // public void guardar(){
  //   try{
  //     FileWriter archivo = new FileWriter("Users/archivo.txt");
  //     archivo.write("samuel-1404");
  //     archivo.close();
  //   }catch(IOException e){
  //     System.out.println("Error");
  //   }
  // }
  
  // public void addUser(String username, String password){
    
  // }

  // public void searchUser(String username){
    
  // }
      

  
  // public File crearArchivo() {
  //   try {
  //     File file = new File("Users/archivo.txt");
  //     file.createNewFile();
  //     return file;
  //   } catch(IOException e){
  //     System.out.println("Error");
  //   }
  //   return null;
  // }
  
  // public void leer(){

  //   try{
  //     Scanner scanner = new Scanner(this.archivo);
  //     while (scanner.hasNextLine()) {
  //         String linea = scanner.nextLine();
  //         System.out.println(linea);
  //     }
  //   }catch(FileNotFoundException e){
  //     System.err.println("El archivo no pudo ser encontrado: " + e.getMessage());
  //     return;
  //   }
  // }
}





