package com.kbh.rungame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Master_setroom extends AppCompatActivity {
    public Button confirm,cancel;
    public TextView room_code;
    public int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_setroom);
        random = (int)(Math.random()*50000);
        room_code=(TextView)findViewById(R.id.room_code);
        room_code.setText(String.valueOf(random));
        confirm= (Button)findViewById(R.id.confirm);
        cancel=(Button)findViewById(R.id.cancel);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirm();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void confirm(){
        Intent intent = new Intent();
        intent.setClass(this,masteruse.class);
        startActivity(intent);
    }
}
