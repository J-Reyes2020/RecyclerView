package com.android.proyecto014eliminaragregarrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Creamos un ibjeto array list con los parametros de perosnas
    ArrayList<Persona> personas;

    private RecyclerView rv1;

    //LLamamos a un atributo de clase
    AdaptadorPersona ap;

    private EditText etxtNombre;
    private EditText etxTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv1 = findViewById(R.id.rv_vista);

        etxtNombre = findViewById(R.id.txt_nombre);
        etxTelefono = findViewById(R.id.txt_telefono);

        //Creeamos el objeto personas

        personas=new ArrayList<Persona>();
        personas.add(new Persona("Juan","093820398"));
        personas.add(new Persona("Miguel","824765"));
        personas.add(new Persona("Sucely","8457389"));
        personas.add(new Persona("Pamela","08482"));
        personas.add(new Persona("Pedro","348953"));
        personas.add(new Persona("Isaías","0850923"));
        personas.add(new Persona("Mishell","00235702"));
        personas.add(new Persona("Lourdes","23384"));
        personas.add(new Persona("Jorge","9817303"));
        personas.add(new Persona("Maria","230948"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv1.setLayoutManager(linearLayoutManager);
        ap = new AdaptadorPersona();
        rv1.setAdapter(ap);
    }


    //Creamos una clase que herede la clase "Adapter" declarada en la clase RecyclerView
    private class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.AdaptadorPersonaHolder>{


        //Conectamos el item con la vista
        @NonNull
        @Override
        public AdaptadorPersona.AdaptadorPersonaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new AdaptadorPersonaHolder(getLayoutInflater().inflate(R.layout.item_perosna,parent,false));
        }

        //Cada uno irá en su posicion
        @Override
        public void onBindViewHolder(@NonNull AdaptadorPersona.AdaptadorPersonaHolder holder, int position) {
            holder.imprimir(position);
        }

        //Colocara todos y cada unos de los datos
        @Override
        public int getItemCount() {
            return personas.size();
        }

        public class AdaptadorPersonaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView txtV1;
            TextView txtV2;
            public AdaptadorPersonaHolder(@NonNull View itemView) {
                super(itemView);
                txtV1 = itemView.findViewById(R.id.id_txt_nombre);
                txtV2 = itemView.findViewById(R.id.id_txt_telefono);
                itemView.setOnClickListener(this);
            }

            //Recibira todos los datos
            public void imprimir(int position) {
                txtV1.setText("Nombre: " + personas.get(position).getNombre());
                txtV2.setText("Teléfono: " + personas.get(position).getTelefono());
            }

            @Override
            public void onClick(View view) {
                //MostrarGetLayoutPosition
            }
        }
    }
}