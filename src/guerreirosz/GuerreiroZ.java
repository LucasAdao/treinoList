package guerreirosz;

public abstract class GuerreiroZ {
    protected String nome;
    protected int idade;
    protected double poderDeLuta;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPoderDeLuta() {
        return poderDeLuta;
    }

    public void setPoderDeLuta(double poderDeLuta) {
        this.poderDeLuta += poderDeLuta;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " (" + this.getPoderDeLuta() + ")";
    }
}
