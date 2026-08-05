public class EmpleadoTemporario extends Empleado {
    
    private String genero;

    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;

    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
        super(nombre, genero, salarioBase, horasTrabajadas, departamento);
        this.mesesContrato = mesesContrato;
        
    }
    @Override
    public void imprimirDetalles() {

        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
    
}
