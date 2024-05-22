public class Horista extends Empregado{
    
    private double horas;
    private double v1_horas;

    public double getV1_horas() {
        return v1_horas;
    }

    public void setV1_horas(double v1_horas) {
        this.v1_horas = v1_horas;
    }

    // Construtor
    public Horista(String n, String e,double s, double h, double v1_horas) {
        super(n, e, s);
        horas = h;
        this.v1_horas = v1_horas;
    }
    // Metodos de acesso

    public void set_horas(double h) {
        horas = h;

    }

    public double get_horas(){
        return horas;

    }

    public void calcularSalario(double v1_horas){
        salario = horas * v1_horas;

    }
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.printf("Valor Inss: %.2f\n" , calcularInss());
        System.out.printf("Valor Irpf: %.2f\n" , calcularIRPF());
        System.out.println("Hora: " + getV1_horas());
    }
}
