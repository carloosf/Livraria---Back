public abstract class Livro {
    //Definindo valores que o livro deve ter
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    //Informando que o autor é obrigatorio em todo livro
    public Livro(Autor autor){
        this();
        this.autor = autor;
    }

    //Informando que o ISBN, é obrigatorio em todo livro
    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    //Indicando todos os detalhes do livro
    void mostrarDetalhes(){
        System.out.println("Mostrando Detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) { //Verificando se tem algum autor no livro
            autor.mostrarDetalhes(); //se tiver autor entao poderá mostrar os detalhes dele tb
        }
        System.out.println("--");
    }

    //Regras de desconto
    public boolean aplicaDescontoDe(double porcentagem){
        if (porcentagem > 0.3){ //caso o desconto do livro fisico seja maior que 30% entao nao será valido
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    //Verificação da existencia do autor
    boolean temAutor(){
        return this.autor != null;
    }

    //setters e getters que é para manter nosso codigo privado, definindo um acesso a ele.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    void setValor(double valor){
        this.valor = valor;
    }
    double getValor(){
        return this.valor;
    }

    //FIM DO CODIGO
}
