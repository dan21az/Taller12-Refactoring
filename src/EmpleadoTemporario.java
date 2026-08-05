public class EmpleadoTemporario extends Empleado {
rama-diego
    private String genero;

    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
 main
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.mesesContrato = mesesContrato;
        
    }
    @Override
    public void imprimirDetalles() {
rama-diego
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + genero);
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());

        super.imprimirDetalles();
 main
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
    
}
