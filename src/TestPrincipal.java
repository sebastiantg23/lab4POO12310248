import animales.*;
import figuras.*;
import otros.*;
import personas.*;

public class TestPrincipal {
    public static void main (String [] args) {

        Punto punto1 = new Punto(0.0, 0.0);
        Punto punto2 = new Punto(0.0, 0.0);
        Punto punto3 = new Punto(0.0, 0.0);
        punto1.setCoordenadaX(2.1);
        punto1.setCoordenadaY(3.4);
        punto2.setCoordenadaX(2.0);
        punto2.setCoordenadaY(3.4);
        punto3.setCoordenadaX(5.0);
        punto3.setCoordenadaY(2.7);


        Circulo circulo1 = new Circulo(2.3, "red", punto1);
        circulo1.setRadio(1.0);
        circulo1.setColor("red");

        Rectangulo rectangulo1 = new Rectangulo(2.71828F, 3.14159F);
        rectangulo1.setLargo(1.0F);
        rectangulo1.setAncho(1.0F);

        Triangulo triangulo1 = new Triangulo(punto1, punto2, punto3);
        triangulo1.setVertice1(punto1);
        triangulo1.setVertice2(punto2);
        triangulo1.setVertice3(punto3);

        Empleado empleado1 = new Empleado(76912, "Pedro", "Sanchez", 1499);
        empleado1.setIdt(76912);
        empleado1.setNombre("Pedro");
        empleado1.setApellido("Sanchez");
        empleado1.setSalario(1499);

        Pelota pelota1 = new Pelota(25.98F, "Verde");
        pelota1.setTamaño(25.98F);
        pelota1.setColor("Rojo");

        Perro perro1 = new Perro("Thor", "Pastor aleman", "gris", 2);
        perro1.setNombre("Manchas");
        perro1.setRaza("Pitbull");
        perro1.setColor("Negro");
        perro1.setEdad(4);


        Automovil automovil1 = new Automovil("23FA1D2", "Nissan", "GTR 34", "negro", "Deportivo");
        automovil1.setPlaca("45F8K12");
        automovil1.setMarca("Toyota");
        automovil1.setModelo("Supra");
        automovil1.setColor("Blanco");
        automovil1.setTipo("Deportivo");

        Mesa mesa1 = new Mesa(3.0F, 5.0F, "Marron oscuro", "Madera", "circular");
        mesa1.setAncho(4.0F);
        mesa1.setAltura(7.5F);
        mesa1.setColor("Plateado");
        mesa1.setMaterial("Metal");
        mesa1.setForma("Rectangular");

        Estudiante estudiante1 = new Estudiante(32570, "Alonso", "Marquez", 21, "Matematica", 17.0F);
        estudiante1.setId(78924);
        estudiante1.setNombre("Carlos");
        estudiante1.setApellido("Torres");
        estudiante1.setEdad(22);
        estudiante1.setCurso("Ingles");
        estudiante1.setCalificacion(12.6F);

        Celular celular1 = new Celular(987543721, "Huawei", "negro", "S43", "Ilimitado");
        celular1.setNumero(953678320);
        celular1.setMarca("Iphone");
        celular1.setColor("rojo");
        celular1.setModelo("12S");
        celular1.setPlan("Ilimitado");

        Figura figura1 = new Figura("cuadrilatero");
        figura1.setTipo("paralepipedo");







    }
}
