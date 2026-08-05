public class Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;

    public Empleado(){}
    public Empleado(String nombre,String genero, double salarioBase, int horasTrabajadas, String departamento) {
        this.nombre = nombre;
        this.genero= genero;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public double calcularSalario() {
    validarSalarioBase();
    validarHorasTrabajadas();
    double salarioTotal = salarioBase;
    salarioTotal += calcularHorasExtra();
    salarioTotal += calcularBonificacionDepartamento();
    //Aplicamos Extract Method, cada responsabilidad va respectvamente con su metodo separado
    return salarioTotal;
    }
    private void validarSalarioBase() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
    }
    private void validarHorasTrabajadas() {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }
    private double calcularHorasExtra() {
        if (horasTrabajadas > 40) {
            return (horasTrabajadas - 40) * 50;
        }
        return 0;
    }
    private double calcularBonificacionDepartamento() {
        switch (departamento) {
            case "Sistemas": return 20;
            case "Contabilidad": return 10;
            default: return 0;
        }
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
