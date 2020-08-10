package com.kostya_zinoviev.recyclreviewfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private ArrayList<Person> persons = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view,container,false);
        recyclerView = v.findViewById(R.id.rv);
        persons.add(new Person("Kostya","15"));
        persons.add(new Person("Polina","10"));
        persons.add(new Person("Danya","9"));
        persons.add(new Person("Kostya","15"));
        persons.add(new Person("Polina","10"));
        persons.add(new Person("Danya","9"));
        persons.add(new Person("Kostya","15"));
        persons.add(new Person("Polina","10"));
        persons.add(new Person("Danya","9"));
        persons.add(new Person("Kostya","15"));
        persons.add(new Person("Polina","10"));
        persons.add(new Person("Danya","9"));
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new RecyclerViewAdapter(persons);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Fragment fragment;
                switch (position){
                    case 0:
                        fragment = new KostyaFragmment();
                        break;
                    case 1:
                        fragment = new PolinaFragmment();
                        break;
                    case 2:
                        fragment = new DanyaFragmment();
                        break;
                    case 3:
                        fragment = new KostyaFragmment();
                        break;
                    case 4:
                        fragment = new PolinaFragmment();
                        break;
                    case 5:
                        fragment =  new DanyaFragmment();
                        break;
                    case 6:
                        fragment = new KostyaFragmment();
                        break;
                    case 7:
                        fragment = new PolinaFragmment();
                        break;
                    case 8:
                        fragment = new DanyaFragmment();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + position);
                }
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container,fragment).commit();
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }

        }));
        return v;
    }
}
