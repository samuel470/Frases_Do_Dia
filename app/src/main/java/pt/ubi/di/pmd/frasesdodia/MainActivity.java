package pt.ubi.di.pmd.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String [] frases = {
                "Você precisa fazer aquilo que pensa que não é capaz de fazer \n -Eleanor Roosevelt",
                "Sucesso é mais frequentemente alcançado por aqueles que não sabem que o fracasso é inevitável \n – Coco Chanel",
                "Sozinhos, pouco podemos fazer; juntos, podemos fazer muito \n – Helen Keller",
                "Só sei que nada sei \n Sócrates",
        };
        int num = new Random().nextInt(frases.length);

        TextView text = findViewById(R.id.textResultado);
        text.setText(frases[num]);
    }
}
