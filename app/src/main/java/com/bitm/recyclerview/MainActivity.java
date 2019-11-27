package com.bitm.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> users;
    private RecyclerView userRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getUsers();
        initRecyclerView();
    }

    private void initRecyclerView() {
        UserAdapter userAdapter = new UserAdapter(users);
        userRV.setLayoutManager(new LinearLayoutManager(this));
        userRV.setAdapter(userAdapter);

    }


    private void init() {
        users = new ArrayList<>();
        userRV = findViewById(R.id.recyclerView);
    }

    private void getUsers() {
        users.add(new User("Arifur Rahman", R.drawable.arif, "01770178342"));
        users.add(new User("Abdullah al mamun", R.drawable.mamun, "01770178656"));

    }
}
