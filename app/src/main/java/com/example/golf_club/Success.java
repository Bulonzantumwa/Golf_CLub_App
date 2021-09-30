package com.example.golf_club;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Success extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Clubs_Class> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //--> Creating a list
        list = new ArrayList<>();
        list.add(new Clubs_Class (R.drawable.ic_img_01, "Kenya", "Mario@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_02, "China", "John@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_03, "Canada", "Ian@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_04, "France", "Mario@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_05, "South Africa", "John@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_06, "India", "Ian@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_07, "United Kingdom", "Mario@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_08, "Egypt", "John@email.com"));
        list.add(new Clubs_Class (R.drawable.ic_img_09, "Uganda", "Ian@email.com"));


        recyclerView = findViewById(R.id.id_RecyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.OnRecyclerViewClickListener(new MyAdapter.OnRecyclerViewClickListener() {
            @Override
            public void OnItemClick(int position) {

                Intent intent = new Intent(Success.this, DetailsActivity.class);
                intent.putExtra("imagINTENT", list.get(position).getImg() );
                intent.putExtra("nameINTENT", list.get(position).getName());
                intent.putExtra("emailINTENT", list.get(position).getEmail());
                startActivity(intent);
            }
        });

    }
}
