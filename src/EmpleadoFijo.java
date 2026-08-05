public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre,genero, salarioBase, horasTrabajadas, departamento);
        this.bonoAnual = bonoAnual;
        
    }
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
    
}
