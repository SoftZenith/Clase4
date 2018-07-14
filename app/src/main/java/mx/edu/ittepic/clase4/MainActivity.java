package mx.edu.ittepic.clase4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView txvResultado;
    EditText edtNumero, edtLimite;
    Button btnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvResultado = findViewById(R.id.txvResultado);
        edtNumero = findViewById(R.id.edtNumero);
        edtLimite = findViewById(R.id.edtLimite);
        btnMulti = findViewById(R.id.btnMulti);

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num=0, limite=0;

                try {
                    num = Integer.parseInt(edtNumero.getText().toString());
                    limite = Integer.parseInt(edtLimite.getText().toString());
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Debes ingresar ambos datos", Toast.LENGTH_SHORT).show();
                }
                int i = 1;

                String resultado = "";

                /*
                for(int i = 1; i<=limite; i++){
                    resultado = resultado + i + "*" + num + " = " + (i*num) + "\n";
                }*/

                while(i<=limite){
                    resultado = resultado + i + "*" + num + " = " + (i*num) + "\n";
                    i++;
                }

                txvResultado.setText(resultado);
            }
        });

    }
}
