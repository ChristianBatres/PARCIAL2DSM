package sv.edu.udb.parcial2dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class tacos extends AppCompatActivity {
    int c;
    String ordenes[][];
    private EditText eCantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacos);
        Bundle bundle = getIntent().getExtras();
        c=bundle.getInt("c");
        ordenes=(String [][])bundle.get("ordenes");
        this.ordenes = (String [][])bundle.get("ordenes");
    }

    public void tacos (View v) {

        eCantidad=(EditText)findViewById(R.id.txtCantidad);
        if((eCantidad.getText().toString())==null   ||  Integer.parseInt((eCantidad.getText().toString()))<=0 ){
            Toast.makeText(getApplicationContext(), "La cantidad no puede ser 0", Toast.LENGTH_LONG).show();
        }
        else{
            int i=0;
            if (c==0){
                i=0;
            }else {
                i=c+1;
            }

            ordenes[i][0]="Tacos";
            ordenes[i][1]=eCantidad.getText().toString();
            ordenes[i][2]="5";
            Toast.makeText(getApplicationContext(), "Orden Agregada", Toast.LENGTH_LONG).show();
            eCantidad.setText("");
            c++;
        }

    }

    public void menu (View v) {
        Intent i=new Intent(this, DashboardActivity.class);
        i.putExtra("ordenTacos", ordenes);
        i.putExtra("c", c);
        startActivity(i);
    }
}