package com.example.messenger;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link historias# newInstance} factory method to
 * create an instance of this fragment.
 */
public class historias extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_historias, parent, false);
    }
    //ArrayAdapter<String> itemsAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, Pizza.pizzaMenu);

    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        GridView hist = (GridView) view.findViewById(R.id.hist);
        hist.setAdapter(itemsAdapter);
    }

    private lista.OnItemSelectedListener listener;*/
    }
}