//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee eevee = new Eevee("Normal",200,5.5);
        Joelteon joelteon = new Joelteon("Elétrico",250,6.3);
        Vaporeon vaporeon = new Vaporeon("Água", 300, 7.0);

        System.out.println("Eu sou o Eevee");
        System.out.println("Tipo: " + eevee.getTipo());
        System.out.println("Health Points: " + eevee.getHP());
        System.out.println("Peso: " + eevee.getPeso());
        System.out.println("Ataque: " + eevee.ataque());
        System.out.println("Defesa: " + eevee.defesa());
        System.out.println("Especial: " + eevee.especial());
        System.out.println("\n");

        System.out.println("Eu sou o Joelteon");
        System.out.println("Tipo: " + joelteon.getTipo());
        System.out.println("Health Points: " + joelteon.getHP());
        System.out.println("Peso: " + joelteon.getPeso());
        System.out.println("Ataque: " + joelteon.ataque());
        System.out.println("Defesa: " + joelteon.defesa());
        System.out.println("Especial: " + joelteon.especial());
        System.out.println("\n");

        System.out.println("Eu sou o Vaporeon");
        System.out.println("Tipo: " + vaporeon.getTipo());
        System.out.println("Health Points: " + vaporeon.getHP());
        System.out.println("Peso: " + vaporeon.getPeso());
        System.out.println("Ataque: " + vaporeon.ataque());
        System.out.println("Defesa: " + vaporeon.defesa());
        System.out.println("Especial: " + vaporeon.especial());
    }
}