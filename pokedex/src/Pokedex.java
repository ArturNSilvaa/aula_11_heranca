public class Pokedex {
    public static void main(String[] args) throws Exception {
    
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();

        System.out.println("Meu nome: Eevee");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());

        System.out.println("Meu nome: Jolteon");
        System.out.println("Ataque: "+j.ataque());
        System.out.println("Defesa: "+j.defesa());
        System.out.println("Especial: "+j.especial());

    }
}
