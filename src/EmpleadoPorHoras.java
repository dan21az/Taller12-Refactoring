public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre,genero, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.tarifaHora= tarifaHora;
        
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