public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelun.com.br");
        autor.setCpf("123.456.789-10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.setAutor(autor);
        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("Paulo.silveira@caelun.com.br");
        outroAutor.setCpf("123.456.789-10");

        Livro outrolivro = new LivroFisico(outroAutor);
        outrolivro.setNome("Lógica de programação");
        outrolivro.setDescricao("Crie seus primeiros programas");
        outrolivro.setValor(59.90);
        outrolivro.setIsbn("978-85-66250-22-0");

        outrolivro.setAutor(outroAutor);
        outrolivro.mostrarDetalhes();
    }
}
