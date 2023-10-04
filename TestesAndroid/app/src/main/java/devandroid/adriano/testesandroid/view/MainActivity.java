package devandroid.adriano.testesandroid.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.adriano.testesandroid.R;
import devandroid.adriano.testesandroid.controller.PessoaController;
import devandroid.adriano.testesandroid.model.Pessoa;


public class MainActivity extends AppCompatActivity {


    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PessoaController controller;

        Pessoa pessoa;

        




        pessoa = new Pessoa();
        // Atribuir Conteudo dados Valores ao Objeto
        // Conforme a seu MODEL, TEMPLATE
        pessoa.setPrimeiroNome("Adriano");
        pessoa.setSobreNome("Santos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-123456789");



    }
}