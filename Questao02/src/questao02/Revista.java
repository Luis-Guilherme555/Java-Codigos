package questao02;

public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista(String titulo, String codigo, int edicao) {
        super(titulo, codigo);
        this.edicao=edicao;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso*1.0;
    }
    
    public int getEdicao(){
        return edicao;
    }
}
