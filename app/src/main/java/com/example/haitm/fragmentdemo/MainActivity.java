package com.example.haitm.fragmentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        fm = getSupportFragmentManager();

        btn = (Button) findViewById(R.id.btn_add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction ft_add = fm.beginTransaction();
                ft_add.add(R.id.frame_layout, new MyFragment1());
                ft_add.commit();
            }
        });
    }
}
