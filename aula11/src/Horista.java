public class Horista extends Empregado{
    
    private double horas;

    // Construtor
    public Horista(String n, String e,double s, double h) {
        super(n, s, e);
        horas = h;

    }
    // Metodos de acesso

    public void set_horas(double h) {
        horas = h;

    }

    public double get_horas(){
        return horas;

    }

    public void calcularSalario(){
        salario = horas * 50;

    }
    public void imprimir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salario: " + getSalario());
        System.out.println("Valor Inss: " + calcularInss());
        System.out.println("Valor Irpf: " + calcularIRPF());

    }
}
