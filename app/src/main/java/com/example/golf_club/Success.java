package com.example.golf_club;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class Success extends AppCompatActivity {
    private ArrayList<Clubs_Class> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //--> Creating a list
        list = new ArrayList<>();
        list.add(new Clubs_Class (R.drawable.ic_img_01, "Kenya", "Welcome to our team"));
        list.add(new Clubs_Class (R.drawable.ic_img_02, "China", "Join Us now for more Infos"));
        list.add(new Clubs_Class (R.drawable.ic_img_03, "Canada", "Let's start this journey together"));
        list.add(new Clubs_Class (R.drawable.ic_img_04, "France", "Click and join to not miss your chance"));
        list.add(new Clubs_Class (R.drawable.ic_img_05, "South Africa", "It all starts with on click"));
        list.add(new Clubs_Class (R.drawable.ic_img_06, "India", "Join on time and let's do it"));
        list.add(new Clubs_Class (R.drawable.ic_img_07, "United Kingdom", "Join one, join all. Welcome!"));
        list.add(new Clubs_Class (R.drawable.ic_img_08, "Egypt", "You are at the right place. Join Now!"));
        list.add(new Clubs_Class (R.drawable.ic_img_09, "Uganda", "Impossible does not exist. Just Try it... "));


        RecyclerView recyclerView = findViewById (R.id.id_RecyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter(list);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.OnRecyclerViewClickListener(position -> {

            Intent intent = new Intent(Success.this, DetailsActivity.class);
            intent.putExtra("imagINTENT", list.get(position).getImg() );
            intent.putExtra("nameINTENT", list.get(position).getName());
            intent.putExtra("descriptionINTENT", list.get(position).getDescription());
            startActivity(intent);
        });

    }
}
