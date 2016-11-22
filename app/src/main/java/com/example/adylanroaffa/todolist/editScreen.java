package com.example.adylanroaffa.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.adylanroaffa.todolist.R;


public class editScreen extends AppCompatActivity{

    Intent lastIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.edit_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lastIntent = getIntent();

        EditText newNameET = (EditText) findViewById(R.id.new_name_list);
        newNameET.setText(lastIntent.getExtras().getString("Name of ToDoList"));

    }

    public void onSendNewTaskName(View view) {

        EditText newNameET = (EditText) findViewById(R.id.new_name_list);
        String newName = String.valueOf(newNameET.getText());

        int index = lastIntent.getExtras().getInt("Index of ToDoList");

        Intent goBack = new Intent();
        goBack.putExtra("New Name",newName);
        goBack.putExtra("Index of ToDoList",index);
        setResult(RESULT_OK, goBack);

        finish();
    }
}