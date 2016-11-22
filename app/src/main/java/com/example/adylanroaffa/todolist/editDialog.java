package com.example.adylanroaffa.todolist;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.adylanroaffa.todolist.deleteScreen;
import com.example.adylanroaffa.todolist.editScreen;

public class editDialog extends DialogFragment {
    int mNum;
    String mName;

    static editDialog newInstance(int num, String name) {
        editDialog f = new editDialog();

        Bundle args = new Bundle();
        args.putInt("num",num);
        args.putString("name",name);

        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mNum = getArguments().getInt("num");
        mName = getArguments().getString("name");

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setMessage(Html.fromHtml("Apa yang ingin Anda lakukan dengan to do <b>'"+mName+"'</b> ?"))
                .setPositiveButton("UBAH",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent getNewNameIntent = new Intent(getActivity(), editScreen.class);
                        final int result = 1;
                        getNewNameIntent.putExtra("Index of ToDoList", mNum);
                        getNewNameIntent.putExtra("Name of ToDoList", mName);

                        getActivity().startActivityForResult(getNewNameIntent, result);

                    }
                })
                .setNegativeButton("HAPUS",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent deleteIntent = new Intent(getActivity(), deleteScreen.class);
                        final int result = 3;
                        deleteIntent.putExtra("Index of ToDoList", mNum);

                        getActivity().startActivityForResult(deleteIntent, result);

                    }
                })
                .create();
    }
}