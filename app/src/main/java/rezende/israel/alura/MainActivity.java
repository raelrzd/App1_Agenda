package rezende.israel.alura;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // BALÃO INFERIOR AO ABRIR O APP
        Toast.makeText(this, "Seja bem vindo!! App em construção...", Toast.LENGTH_LONG).show();
        // APRESENTA ARQUIVO DE ACTIVITY
        setContentView(R.layout.activity_main);
        setTitle("Lista De Alunos");

        List<String> alunos = new ArrayList<>(
                Arrays.asList("Raelzera", "Guizera", "Teteuzera", "Harold"));
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alunos));

    }
}