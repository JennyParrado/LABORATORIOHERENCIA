
package herencia;

import javax.swing.JOptionPane;

public class Empleado extends Persona
{
    private double salario;
    private String codigoLaboral;
    private boolean esEmpleadoFijo;
    
        //constructor de la clase
    public Empleado()
    {
    }
    
    //constructor de la subclase
    public Empleado (String nombre, String apellido, int edad, int peso, double salario, String codigoLaboral, boolean esEmpleadoFijo)
    {
      super(nombre,apellido,edad, peso);
      this.salario = salario;
      this.codigoLaboral = codigoLaboral;
      this.esEmpleadoFijo = esEmpleadoFijo;  
    }
    
    //metodos de encapsulamiento
    public double getSalario (double salario)
    {
        return salario;
    }
    public void setSalario (double salario)
    {
        this.salario = salario;
    }
    public String getCodigoLaboral (String codigoLaboral)
    {
        return codigoLaboral;
    }
    public void setCodigoLaboral (String codigoLaboral)
    {
        this.codigoLaboral = codigoLaboral;
    }
    public boolean getEsEmpleadoFijo (boolean esEmpleadoFijo)
    {
        return esEmpleadoFijo;
    }
    public void setEsEmpleadoFijo (boolean esEmpleadoFijo)
    {
        this.esEmpleadoFijo = esEmpleadoFijo;
    }
    
    //metodos propios del empleado
     //metodo para calcular el salario
    public double calcularSalario (boolean esEmpleadoFijo, double valorHora, int numeroHorasTrabajadas)
    {
        double salario = 0.0;
        double bono =0.0;
        if (esEmpleadoFijo == true)
        {
            bono = 5200.00;
        }
        else
        {
            bono = 1200.00;
        }
        salario = numeroHorasTrabajadas*valorHora+bono;
        return (salario);
    }
    
    //metodo para imprimir el sueldo del empleado
    public void imprimirAsignacionSalario (String nombre, double sueldo)
    {
        JOptionPane.showMessageDialog(null,"el empleado"+ nombre +"recibe de salario"+ sueldo);
    }
    
    //metodo para ingresar los datos del empleado
    public Empleado ingresarDatosEmpleado()
    {
        Empleado nuevoEmpleado = new Empleado();
        String nombre = "",apellido = "",codigo= " ";
        int edad = 0,numeroHoras = 0;
        double peso = 0.0, salario = 0.0,valorHora=0.0;
        boolean esEmpleadoFijo = false;
        
        codigo = JOptionPane.showInputDialog("ingrese el codigo del empleado");
        nombre= JOptionPane.showInputDialog("ingrese el nombre del empleado");
        apellido = JOptionPane.showInputDialog("ingrese el apellido del empleado");
        edad = Integer.parseInt("ingrese la edad del empelado ");
        peso = Double.parseDouble("ingrese el peso del empleado");
        
        numeroHoras = Integer.parseInt("ingrese el numero de horas trabajadas por el empelado ");
        valorHora= Double.parseDouble("ingrese el valor de la hora");
        esEmpleadoFijo = Boolean.parseBoolean("¿el empleado es fijo(true/false)?");
    
        //calculamos el salario
        salario= calcularSalario(esEmpleadoFijo, valorHora, numeroHoras);
        
        //definimos los datos para el constructor 
        nuevoEmpleado.setNombre(nombre);
        nuevoEmpleado.setApellido(apellido);
        nuevoEmpleado.setCodigoLaboral(codigoLaboral);
        nuevoEmpleado.setEdad(edad);
        nuevoEmpleado.setPeso(peso);
        nuevoEmpleado.setSalario(salario);
        nuevoEmpleado.setEsEmpleadoFijo(esEmpleadoFijo);
        
        //retornamos el objeto
        return (nuevoEmpleado);
    }
    
    //metodo para imprimir el reporte de estatus del empleado 
    public void imprimirReporteEstadoEmpleado()
    {
        //usamos herencia para llamar los metodos que imprimen los datos del empleado
        imprimirDatosPersona();
          // ahora imprimimos los datos propios del empleado 
        JOptionPane.showMessageDialog(null,"El codigo laboral del empleado es:"+ codigoLaboral);
        //asignamos el salario
        imprimirAsignacionSalario(nombre, salario);
        if(esEmpleadoFijo == true)
        {
            JOptionPane.showMessageDialog(null,"El empleado es un trabajador fijo de la empresa");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"el empleado es un trabajador contratado por la empresa");
        }
    }   
    
    //metodo sobreescrito para definir el estado del empleado 
    public void definirEstadoPersona(int edad)
    {
        String estado = "";
        if ( edad < 21)
        {
            estado = " menor de edad legal";
        }
        else
        {
            estado = "mayor de edad legal";
        }
        JOptionPane.showMessageDialog(null, "la persona"+ nombre + " "+ apellido+ "es "+ estado);
    }
}
