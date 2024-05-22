public class FolhaPGTO{

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;
    
        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", 0, "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        men1.imprimir();
    
    
        men2 = new Mensalista("Ana", "Rua sem fim", 0, "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        men2.imprimir();
    
        // Empregado horistas
        hora1 = new Horista("Carlos", "Rua xyz", 0, 20, 50);
        hora1.calcularSalario(10);
        hora1.imprimir();
    
        hora2 = new Horista("Cristina", "Rua do centro", 0, 100, 50);
        hora2.calcularSalario(22);
        hora2.imprimir();
        // algo
    }
}