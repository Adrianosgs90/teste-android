package devandroid.adriano.testesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}