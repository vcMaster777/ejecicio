package com.example.et_c113.sema03imagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//defino mis variables
    ImageView imagen;
    RadioGroup migrupo;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// aqui se relaciona las varibles
        imagen=findViewById(R.id.imageView);
        migrupo=findViewById(R.id.radioGroup);
        rb1=findViewById(R.id.rb1peru);
        rb2=findViewById(R.id.rb2francia);
        rb3=findViewById(R.id.rb3dinamarca);
        rb4=findViewById(R.id.rb4australia);

        migrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_SHORT).show();
               // se scoge una lista de opciones

                switch (i)
                {
                    case R.id.rb1peru:
                    imagen.setImageResource(R.drawable.peru);
                    break;
                    case R.id.rb2francia:
                        imagen.setImageResource(R.drawable.francia);
                        break;
                    case R.id.rb3dinamarca:
                        imagen.setImageResource(R.drawable.dinamarca);
                        break;
                    case R.id.rb4australia:
                        imagen.setImageResource(R.drawable.australia);
                        break;
                        default:

                }
            }
        });




    }
}
