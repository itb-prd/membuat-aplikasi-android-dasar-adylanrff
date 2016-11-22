package com.example.adylanroaffa.todolist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;


public class AboutDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("About");
        theDialog.setMessage("To Do List v. 1.0.2\nMade by Adylan");
        theDialog.setPositiveButton("OK", null);

        /*return super.onCreateDialog(savedInstanceState);*/
        return theDialog.create();
    }
}