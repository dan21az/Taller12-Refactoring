public enum Departamento {
    SISTEMAS(20.0),
    CONTABILIDAD(10.0),
    MEDICO(0.0), 
    GENERAL(0.0);

    private final double bono;

    Departamento(double bono) {
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }
}
