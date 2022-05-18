package com.example.messenger;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link lista# newInstance} factory method to
 * create an instance of this fragment.
 */
public class lista extends Fragment {
    ArrayAdapter<String> itemsAdapter;
    ArrayAdapter<String> itemsAdapter2;
    ArrayAdapter<String> itemsAdapter3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaMenu);
        itemsAdapter2 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.fecha);
        itemsAdapter3 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.fotos);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ListView lvItems = (ListView) view.findViewById(R.id.lvItems);
        lvItems.setAdapter(itemsAdapter);
        ListView lvItems2 = (ListView) view.findViewById(R.id.lvItems2);
        lvItems2.setAdapter(itemsAdapter2);
        ListView lvItems3 = (ListView) view.findViewById(R.id.lvItems3);
        lvItems3.setAdapter(itemsAdapter3);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onPizzaItemSelected(position);
            }
        });
        lvItems2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onPizzaItemSelected(position);
            }
        });
        lvItems3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.onPizzaItemSelected(position);
            }
        });
    }

    private OnItemSelectedListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener) {
            this.listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement PizzaMenuFragment.OnItemSelectedListener");
        }
    }

    public interface OnItemSelectedListener {
        void onPizzaItemSelected(int position);
    }
}