public class Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(){}
    public Empleado(String nombre,String genero, double salarioBase, int horasTrabajadas, Departamento departamento) {
        this.nombre = nombre;
        this.genero= genero;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public double calcularSalario() {
        double salarioTotal = salarioBase;
        int horas_normales = 40;
        double tarifa_hora_extra = 50.0;

        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }

        if (horasTrabajadas > horas_normales) {
            salarioTotal += (horasTrabajadas - horas_normales) * tarifa_hora_extra;
        }
        
        salarioTotal += departamento.getBono();

        return salarioTotal;
    }
  
    public void imprimirDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
