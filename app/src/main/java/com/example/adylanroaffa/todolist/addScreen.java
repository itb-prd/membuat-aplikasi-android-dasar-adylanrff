package com.example.adylanroaffa.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.adylanroaffa.todolist.R;


public class addScreen extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onSendNewTask(View view) {

        EditText newTaskET = (EditText) findViewById(R.id.add_todo_list);
        String newTask = String.valueOf(newTaskET.getText());

        Intent goBack = new Intent();
        goBack.putExtra("New Task",newTask);
        setResult(RESULT_OK, goBack);

        finish();

    }
}