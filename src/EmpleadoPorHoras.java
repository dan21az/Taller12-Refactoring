public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre,genero, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora= tarifaHora;
        
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * this.getTarifaHora();
        return salario;
    }
    public double getTarifaHora(){
        return tarifaHora;
    }
    public void setTarifaHora(double tarifaHora){
        this.tarifaHora= tarifaHora;
    }

    // Más metodos
    
}