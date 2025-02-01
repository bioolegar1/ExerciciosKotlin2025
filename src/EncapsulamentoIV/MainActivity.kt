package EncapsulamentoIV


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var txtTitulo : TextView
    lateinit var txtAutor : TextView
    lateinit var txtEditora : TextView
    lateinit var txtLocalizacao : TextView
    lateinit var txtPaginas : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()

        criarObejtos()

    }

    private fun iniciarComponentesDoLayout() {

        txtTitulo = findViewById(R.id.txtTituloLivro)
        txtAutor = findViewById(R.id.txtAutor)
        txtEditora = findViewById(R.id.txtEditora)
        txtLocalizacao = findViewById(R.id.txtLocalizacao)
        txtPaginas = findViewById(R.id.txtPaginas)

    }

    private fun criarObejtos() {
        var livro = Livro(
            "Kotlin",
            "Maddo",
            "Mundial POO",
            "L1L1",
            140
        )

        val titulo = livro.titulo
        val autor = livro.autor
        val editora = livro.editora
        val localizacao = livro.localizacao
        val paginas = livro.paginas

        Log.i("POO", "Obj Livro: Autor: " +autor);
        Log.i("POO", "Obj Livro: Titulo: " +titulo);
        Log.i("POO", "Obj Livro: Editora: " +editora);
        Log.i("POO", "Obj Livro: Pag: " +paginas);
        Log.i("POO", "Obj Livro: Localizacao: " +localizacao);


        txtTitulo.setText(livro.titulo)
        txtAutor.setText(livro.autor)
        txtEditora.setText(livro.editora)
        txtLocalizacao.setText(livro.localizacao)
        txtPaginas.setText(livro.paginas.toString())


    }
