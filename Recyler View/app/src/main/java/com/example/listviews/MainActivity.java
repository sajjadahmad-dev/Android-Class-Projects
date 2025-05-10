package com.example.listviews;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listviews.Models.Adapters.FlagAdapter;
import com.example.listviews.Models.FlagModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FlagAdapter flagAdapter;
    ArrayList<FlagModel> flagList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recyler);
        flagList = new ArrayList<>();

        // ✅ Add all three flags with country names
        flagList.add(new FlagModel(R.drawable.bur1, "Beef Burgur"));
        flagList.add(new FlagModel(R.drawable.bur2, "Loaded Burgur"));
        flagList.add(new FlagModel(R.drawable.bur3, "Turkish Burgur"));
        flagList.add(new FlagModel(R.drawable.bur4, "Deal Offer"));
        flagList.add(new FlagModel(R.drawable.bur5, "Italian Burgar"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        flagAdapter = new FlagAdapter(flagList);
        recyclerView.setAdapter(flagAdapter);

        // Optional: Handle window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
