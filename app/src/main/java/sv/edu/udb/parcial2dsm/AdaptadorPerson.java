package sv.edu.udb.parcial2dsm;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import sv.edu.udb.parcial2dsm.datos.Orden;

public class AdaptadorPerson extends ArrayAdapter<Orden> {
    List<Orden> ordens;
    private Activity context;

    public AdaptadorPerson(@NonNull Activity context, @NonNull List<Orden> ordens) {
        super(context, R.layout.activity_person, ordens);
        this.context = context;
        this.ordens = ordens;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        // Método invocado tantas veces como elementos tenga la coleccion personas
        // para formar a cada item que se visualizara en la lista personalizada
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowview=null;
        // optimizando las diversas llamadas que se realizan a este método
        // pues a partir de la segunda llamada el objeto view ya viene formado
        // y no sera necesario hacer el proceso de "inflado" que conlleva tiempo y
        // desgaste de bateria del dispositivo
        if (view == null)
            rowview = layoutInflater.inflate(R.layout.activity_person,null);
        else rowview = view;
        TextView tvOrden = rowview.findViewById(R.id.tvOrden);
        TextView tvCantidad = rowview.findViewById(R.id.tvCantidad);
        TextView tvPrecio = rowview.findViewById(R.id.tvPrecio);


        tvOrden.setText("Orden de : "+ordens.get(position).getOrden());
        tvCantidad.setText("Cantidad : " + ordens.get(position).getCantidad());
        tvPrecio.setText("Precio Unitario : $" + ordens.get(position).getPrecio());

        return rowview;
    }
}
