public class Joelteon extends Eevee{


    public Joelteon(String tipo, int HP, double peso) {

        super(tipo, HP, peso);
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String ataque(){
        return "Trovoada - Thunder - Shock";
    }
    @Override
    public String defesa() {
        return "Carga - Wild Charge";
    }
    @Override
    public String especial() {
        return "Raio - Thunder";
    }
}
