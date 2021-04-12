package sv.edu.udb.parcial2dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import sv.edu.udb.parcial2dsm.datos.Orden;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorOrden extends AppCompatActivity {
    public static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static DatabaseReference refordenes = database.getReference("ordenes");

    // Ordenamiento
    Query consultaOrdenada = refordenes.orderByChild("orden");

    List<Orden> ordens;
    ListView listaOrden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptador_orden);

        inicializar();
    }



    private void inicializar() {
        listaOrden = findViewById(R.id.listaOrdenes);
        ordens = new ArrayList<>();

        // Cambiarlo refProductos a consultaOrdenada para ordenar lista
        consultaOrdenada.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Procedimiento que se ejecuta cuando hubo algun cambio
                // en la base de datos
                // Se actualiza la coleccion de ordenes
                ordens.removeAll(ordens);
                for (DataSnapshot dato : dataSnapshot.getChildren()) {
                    Orden orden = dato.getValue(Orden.class);
                    orden.setKey(dato.getKey());
                    ordens.add(orden);
                }

                AdaptadorPerson adapter = new AdaptadorPerson(AdaptadorOrden.this,
                        ordens );
                listaOrden.setAdapter(adapter);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}