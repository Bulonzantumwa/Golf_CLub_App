package com.example.golf_club;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView img = findViewById (R.id.id_img_details);
        TextView tv_name = findViewById (R.id.id_name_details);
        TextView tv_description = findViewById (R.id.id_description_details);


        img.setImageResource(getIntent().getIntExtra("imagINTENT", R.drawable.ic_img_01));
        tv_name.setText(getIntent().getStringExtra("nameINTENT"));
        tv_description.setText(getIntent().getStringExtra("descriptionINTENT"));
    }
}
