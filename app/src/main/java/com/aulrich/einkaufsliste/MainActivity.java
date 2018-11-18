package com.aulrich.einkaufsliste;

import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.aulrich.einkaufsliste.Adapter.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> names;
    private CoordinatorLayout rootLayout;
    private ProductListAdapter adapter;

    public MainActivity()
    {
        names = new ArrayList<>();
    }

    private void loadList()
    {
        names.add("Test1");
        names.add("Test2");
        names.add("Test3");
        names.add("Test4");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadList();

        recyclerView = findViewById(R.id.mainList);
        rootLayout = findViewById(R.id.root_layout);
        adapter = new ProductListAdapter(this, names);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);


    }
}
