public class Horista {
    
    private double horas;

    // Construtor
    public Horista(String n, String e, double h) {
        super(n, e);
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
        System.out.println("Salario: " + calcularSalario());
        System.out.println("Valor Inss: " + calcularInss());
        System.out.println("Valor Irpf: " + calcularIRPF());

    }
}
