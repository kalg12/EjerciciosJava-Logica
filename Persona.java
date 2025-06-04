public class Persona {
    //Todas las personas puede hacer muchas cosas, las personas tienen nombre, edad
    //etc, así que vamos a simular algunas actividades mediante métodos.

    //Una buena práctica es declarar variables en la parte más alta del código

    int edad = 20;

    void mayorDeEdad(){
        if(edad >= 18){
            System.out.println("Eres un mayor de edad 🤩");
        }else{
            System.out.println("Eres un menor de edad 😕");
        }
    }

    void descanar(){

    }
}
