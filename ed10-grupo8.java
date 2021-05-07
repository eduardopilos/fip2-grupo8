import java.util.ArrayList; 
import java.util.List; 
public class Biblioteca { 
    private List<Livro> livros = new ArrayList<>(); 
    private List<Livro> livros = new ArrayList<Livro>(); 
    public List<Livro> getLivros() { 
        return livros; 
    } 
    public void setLivros(List<Livro> livros) { 
        this.livros = livros; 
    } 
    public void save(Livro livro) { 
        livros.add(livro); 
    } 
    public int size() { 
        return livros.size(); 
    } 
}

public class Livro { 
    String isbn; 
    String titulo; 
    String autor; 
    public Livro(String isbn, String titulo, String autor) { 
        super(); 
        this.isbn = isbn; 
        this.titulo = titulo; 
        this.autor = autor; 
    } 
    public Livro() { 
        } 
    public String getIsbn() { 
        return isbn;
    } 
    public void setIsbn(String isbn) { 
        this.isbn = isbn; 
    } 
    public String getTitulo() { 
        return titulo; 
    } 
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    } 
    public String getAutor() { 
        return autor; 
    } 
    public void setAutor(String autor) { 
        this.autor = autor; 
    } 
}


@Test 
void ct01_quando_dados_validos_cadastra_com_sucesso() { 
    Biblioteca biblioteca = new Biblioteca(); 
    Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman"); 
    biblioteca.add(umLivro); assertEquals (1, biblioteca.size()); 
}

@Test void ct03_cadastrar_livro_com_isbn_em_branco() { 
    Biblioteca biblioteca = new Biblioteca(); 
    Livro umLivro = new Livro("", "Engenharia de Software", "Pressman"); 
    biblioteca.add(umLivro); 
    List<Livro> lista  = biblioteca.getLivros(); 
    assertEquals("", lista.get(0).getIsbn()); 
}