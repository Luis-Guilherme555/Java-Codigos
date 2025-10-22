package questao02;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, String codigo, String autor) {
        super(titulo, codigo);
        this.autor=autor;
    }

    @Override
    public double calcularMultaAtraso(int diasAtraso) {
        return diasAtraso*2.0;
    } 
    
    public String getAutor(){
        return autor;
    }
}
