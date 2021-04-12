package sv.edu.udb.parcial2dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class DashboardActivity extends AppCompatActivity {
    String ordenes[][]=new String[20][3];
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        Bundle bundle = getIntent().getExtras();
        String correo=bundle.getString("txtcorreo");
        if ((String [][])bundle.get("ordenBurrito")!=null){
            ordenes=(String [][])bundle.get("ordenBurrito");
        }
        if ((String [][])bundle.get("ordenEnchilada")!=null){
            ordenes=(String [][])bundle.get("ordenEnchilada");
        }
        if ((String [][])bundle.get("ordenGuacamole")!=null){
            ordenes=(String [][])bundle.get("ordenGuacamole");
        }
        if ((String [][])bundle.get("ordenQuesadillas")!=null){
            ordenes=(String [][])bundle.get("ordenQuesadillas");
        }
        if ((String [][])bundle.get("ordenTacos")!=null){
            ordenes=(String [][])bundle.get("ordenTacos");
        }
        if ((String [][])bundle.get("ordenTortas")!=null){
            ordenes=(String [][])bundle.get("ordenTortas");
        }
        if ((String [][])bundle.get("ordenFajita")!=null){
            ordenes=(String [][])bundle.get("ordenFajita");
        }
        if ((String [][])bundle.get("ordenCocacola")!=null){
            ordenes=(String [][])bundle.get("ordenCocacola");
        }
        if ((String [][])bundle.get("ordenLimonada")!=null){
            ordenes=(String [][])bundle.get("ordenLimonada");
        }
        if ((String [][])bundle.get("ordenNaranjada")!=null){
            ordenes=(String [][])bundle.get("ordenNaranjada");
        }
        c=bundle.getInt("c");
    }

    public void ordenes (View v) {
        Intent i=new Intent(this, carrito.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void burritos (View v) {
        Intent i=new Intent(this, burritos.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void enchiladas (View v) {
        Intent i=new Intent(this, enchiladas.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }

    public void guacamole (View v) {
        Intent i=new Intent(this, guacamole.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }

    public void quesadillas (View v) {
        Intent i=new Intent(this, quesadillas.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void tacos (View v) {
        Intent i=new Intent(this, tacos.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void Tortas (View v) {
        Intent i=new Intent(this, tortas.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void Fajitas (View v) {
        Intent i=new Intent(this, fajitas.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void Cocacola (View v) {
        Intent i=new Intent(this, cocacola.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void Limonada (View v) {
        Intent i=new Intent(this, limonada.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
    public void Naranjada (View v) {
        Intent i=new Intent(this, naranjada.class);
        //i.putExtra("txtNombre", etNombre.getText().toString());
        //i.putExtra("txtEdad", etEdad.getText().toString());
        i.putExtra("c", c);
        i.putExtra("ordenes", ordenes);
        startActivity(i);
    }
}