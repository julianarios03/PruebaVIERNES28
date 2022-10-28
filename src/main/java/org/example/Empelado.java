package org.example;

public class Empelado {
    //ATRIBUTOS
    // (VARIABLES DE JAVA)
    //(FUERTES TIPADAS)
     public String id;
     public String nombre;
    String apellido;
    String email;
    String direccion;
    String telefono;
    String documento;
    char tipoAfiliacioCajaCompensacion;

    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double dedeccionesGimnacio;
    double demandaAlimento;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompesacion;
    double subsicioCajaCompesacion;
    double auxilioTransprote;
    double dotacion;
    double auxilioEscolar;


    //CONSTRUCTOR
    //(METODO ESPECIAL)
    //(CREAR OBJECTOS DE LA CLASE)

    public Empelado () {

    }
    //METODOS DE LA CLASE
    //(FUNCIONES DE JAVA)
    //(TODA FUNCION RETORNA ALGO EN JAVA)
    //CUANDO RETORNO NADA (VOID)

    public void saludar () {
        System.out.println("Hola Buenos Dias");
    }

}
