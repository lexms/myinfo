package com.lexmanuel.myinfo.friend_list;


import android.app.Dialog;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lexmanuel.myinfo.R;


public class ListFriendsActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter<String> adapter;
    ListFriendsPresenter crud = new ListFriendsPresenter();
    Dialog d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_friends);

        lv = findViewById(R.id.lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(d != null) {
                    if(!d.isShowing())
                    {
                        displayInputDialog(i);
                    }else
                    {
                        d.dismiss();
                    }
                }
            }
        });
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayInputDialog(-1);
            }
        });
    }
    private void displayInputDialog(final int pos)
    {
        d=new Dialog(this);
        d.setTitle("LISTVIEW CRUD");
        d.setContentView(R.layout.input_dialog);
        final EditText nameEditTxt= (EditText) d.findViewById(R.id.nameEditText);
        Button addBtn= (Button) d.findViewById(R.id.addBtn);
        Button updateBtn= (Button) d.findViewById(R.id.updateBtn);
        Button deleteBtn= (Button) d.findViewById(R.id.deleteBtn);
        if(pos== -1)
        {
            addBtn.setEnabled(true);
            updateBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        }else
        {
            addBtn.setEnabled(true);
            updateBtn.setEnabled(true);
            deleteBtn.setEnabled(true);
            nameEditTxt.setText(crud.getNames().get(pos));
        }
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//GET DATA
                String name=nameEditTxt.getText().toString();
//VALIDATE
                if(name.length()>0 && name != null)
                {
//save
                    crud.save(name);
                    nameEditTxt.setText("");
                    adapter=new ArrayAdapter<String>(ListFriendsActivity.this,android.R.layout.simple_list_item_1,crud.getNames());
                    lv.setAdapter(adapter);
                }else
                {
                    Toast.makeText(ListFriendsActivity.this, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//GET DATA
                String newName=nameEditTxt.getText().toString();
//VALIDATE
                if(newName.length()>0 && newName != null)
                {
//save
                    if(crud.update(pos,newName))
                    {
                        nameEditTxt.setText(newName);
                        adapter=new ArrayAdapter<String>(ListFriendsActivity.this,android.R.layout.simple_list_item_1,crud.getNames());
                        lv.setAdapter(adapter);
                    }
                }else
                {
                    Toast.makeText(ListFriendsActivity.this, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//DELETE
                if( crud.delete(pos))
                {
                    nameEditTxt.setText("");
                    adapter=new ArrayAdapter<String>(ListFriendsActivity.this,android.R.layout.simple_list_item_1,crud.getNames());
                    lv.setAdapter(adapter);
                }
            }
        });
        d.show();
    }
}
