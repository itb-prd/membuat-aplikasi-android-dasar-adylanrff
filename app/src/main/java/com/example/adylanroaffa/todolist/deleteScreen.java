package com.example.adylanroaffa.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;



public class deleteScreen extends AppCompatActivity {

    Intent lastIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String ListPicked = "To Do deleted";
        Toast.makeText(this, ListPicked, Toast.LENGTH_LONG).show();


        lastIntent = getIntent();

        int index = lastIntent.getExtras().getInt("Index of ToDoList");

        Intent goBack = new Intent();
        goBack.putExtra("Index of ToDoList",index);
        setResult(RESULT_OK, goBack);

        finish();
    }
}