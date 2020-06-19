package mx.edu.tesoem.isc.aysp.finaltesoem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre,txtmatricula,txtcorreo,txtcalificacion,txtjson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
        txtmatricula = findViewById(R.id.txtmatricula);
        txtcorreo = findViewById(R.id.txtcorreo);
        txtcalificacion = findViewById(R.id.txtcalificacion);
        txtjson = findViewById(R.id.txtjson);
    }
    public void CJSON (View v){
        Datos dato =new Datos();
        Gson gson =new Gson();

        dato.setNombre(txtnombre.getText().toString());
        dato.setMatricula(txtmatricula.getText().toString());
        dato.setCorreo(txtcorreo.getText().toString());
        dato.setCalificacion(txtcalificacion.getText().toString());

        txtjson.setText(gson.toJson(dato));


    }

}