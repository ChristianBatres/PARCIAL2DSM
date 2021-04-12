package sv.edu.udb.parcial2dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class carrito extends AppCompatActivity {
    int c;
    double total=0;
    String ordenes[][];
    ArrayAdapter vectorAdapter;
    private ListView listview;
    private ArrayList<String> listaOrden;
    private TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
        Bundle bundle = getIntent().getExtras();
        c=bundle.getInt("c");
        ordenes=(String [][])bundle.get("ordenes");
        listaOrden=new ArrayList<String>();
        for(int i=0; i<ordenes.length;i++){
            if(ordenes[i][0]==null){

            }else{
                double subt=Double.parseDouble(ordenes[i][1])*Double.parseDouble(ordenes[i][2]);
                listaOrden.add("Orden de:  "+ordenes[i][0]+", Cantidad: "+ordenes[i][1]+", Precio unitario: $"+ordenes[i][2]+", subTotal: $"+String.valueOf(subt));
                total=total+subt;
            }


        }
        listview = (ListView) findViewById(R.id.listOrdenes);
        vectorAdapter = new ArrayAdapter(carrito.this,     android.R.layout.simple_list_item_1, listaOrden);
        listview.setAdapter(vectorAdapter);
        tvTotal=(TextView)findViewById(R.id.total);
        tvTotal.setText( "Total: $"+String.valueOf( total));
    }
    public void menu (View v) {
        Intent i=new Intent(this, DashboardActivity.class);
        i.putExtra("ordenBurrito", ordenes);
        i.putExtra("c", c);
        startActivity(i);
    }

}