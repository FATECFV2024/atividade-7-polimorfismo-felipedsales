public class Eevee {
    protected String tipo;
    protected int HP;
    protected double peso;

    public Eevee(String tipo, int HP, double peso) {
        this.tipo = tipo;
        this.HP = HP;
        this.peso = peso;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String ataque() {
        return "Ataque Rápido";
    }

    public String defesa() {
        return "Desvio";
    }

    public String especial() {
        return "Tri-Ataque";
    }
}
