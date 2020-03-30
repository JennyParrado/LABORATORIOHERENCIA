
package herencia;
import javax.swing.JOptionPane;
public class  Estudiante extends Persona {
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;
     
    public Estudiante()
    {
    }
    public Estudiante (String nombre, String apellido, int edad, int peso,String carnet, double promedioNotas,int numeroMaterias)
    {
      super(nombre,apellido,edad, peso);
      this.carnet= carnet;
      this.promedioNotas = promedioNotas;
      this.numeroMaterias = numeroMaterias;  
    }
    
    //metodos de encapsulamiento
    public String getCarnet(String carnet)
    {
        return carnet;
    }
    public void setCarnet(String carnet)
    {
        this.carnet =  carnet;
    }
     public double getPromedioNotas(double promedioNotas)
    {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas)
    {
        this.promedioNotas =  promedioNotas;
    }
     public int getNumeroMaterias(int numeroMaterias)
    {
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias)
    {
        this.numeroMaterias=  numeroMaterias;
    }
    public double calcularPromedioNotas (double notas , int numeroMaterias)
    {
        promedioNotas = 0.0;
        promedioNotas = notas/numeroMaterias;
        return (promedioNotas);
    }
    
    public void leerNotasEstudiante (double notas)
    {
       notas=0.0;
       for(int i= 0; i < numeroMaterias; i++)
       {
       notas += Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota"));
       }
    }
    public void imprimirAsignacionPromedioNotas(String nombre, double promedioNotas)
    {
        JOptionPane.showMessageDialog(null,"el estudiante"+ nombre +" tiene como promedio en al nota "+ promedioNotas);
    }
    public Estudiante ingresarDatosEstudiante()
    {
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "",apellido = "",carnet= " ";
        int edad = 0;
        double peso = 0.0;
        int numeroMaterias= 0;
    

        carnet = JOptionPane.showInputDialog("ingrese el carnet del estudiante");
        nombre= JOptionPane.showInputDialog("ingrese el nombre del estudiante");
        apellido = JOptionPane.showInputDialog("ingrese el apellido del estudiante");
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del estudiante "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso del estudiante"));
        numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de materias"));
        
        promedioNotas= calcularPromedioNotas(numeroMaterias);
        
        //definimos los datos para el constructor 
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        
        //retornamos el objeto
        return (nuevoEstudiante);
    }
    
    public void imprimirReporteNotasEstudiante()
    {
        //usamos herencia para llamar los metodos que imprimen los datos del empleado
        imprimirDatosPersona();
          // ahora imprimimos los datos propios del empleado 
        JOptionPane.showMessageDialog(null,"El carnet de el estudiante es:"+ carnet);
        //asignamos el salario
        imprimirAsignacionPromedioNotas(nombre, promedioNotas);
    }   
}
