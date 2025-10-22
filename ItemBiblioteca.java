package questao02;

abstract class ItemBiblioteca {
    private String titulo;
    private String codigo;
    private boolean emprestado;
    
    public ItemBiblioteca(String titulo, String codigo){
        this.titulo=titulo;
        this.codigo=codigo;
        this.emprestado=false;
    }
    
    public abstract double calcularMultaAtraso(int diasAtraso);
    
    public boolean emprestar(){
        if(!emprestado){
            emprestado = true;
            return true;
        }else{
            return false;
        }
    }
    
    public void devolver(){
        emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }
   
    public boolean isEmprestado() {
        return emprestado;
    }
}
