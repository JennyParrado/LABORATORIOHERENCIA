
package herencia;

import javax.swing.JOptionPane;


//CLASE SISTEMA INFORMACION
public class SistemaInformacion
{
    //constructor de la clase
    public SistemaInformacion()
    {
    }
    public static void main (String[] args)
    {
        int opcion = 0;
        Persona sistemaInformacion = new Persona();
        try
        {
            //usamos la herencia de la suoer clase para acceder a los metodos de lectura de datos 
            do
            {
                opcion = sistemaInformacion.leerDatoTipoEntero("ingrese la opcion 1 para procesar los datps del empleado , 3 para salir");
                if( opcion == 1 )
                {
                    JOptionPane.showMessageDialog(null,"procesando datos del empelado ");
                    Empleado manejadorEmpleado = new Empleado();
                    //leer los datos 
                    manejadorEmpleado = manejadorEmpleado.ingresarDatosEmpleado();
                    //mostramos el reporte de los datos 
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                }
                else if (opcion == 3)
                {
                    JOptionPane.showMessageDialog(null, "saliendo del sistema");
                    break;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"opcion invalida ");
                }
            }while(opcion<1|| opcion >= 3 );
        }
        catch(Exception errorMain)
        {
           JOptionPane.showMessageDialog(null,"error en la digitacion");
        }
    }
}
