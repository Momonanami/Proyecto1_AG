package com.example.a19134355_7.proyecto1_ag;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

import static java.net.Proxy.Type.HTTP;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
    private ImageButton btn8;
    private ImageButton btnf;
    private final String saludo = "hola desde otro activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (ImageButton) findViewById(R.id.ButtonLike1);
        btn2= (ImageButton) findViewById(R.id.imageButton3);
        btn3= (ImageButton) findViewById(R.id.imageButton6);
        btn4= (ImageButton) findViewById(R.id.imageButton7);
        btn5= (ImageButton) findViewById(R.id.imageButton5);
        btn8= (ImageButton) findViewById(R.id.imageButton8);
        btnf= (ImageButton) findViewById(R.id.imageButton9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"Me gusta ;)",Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"No me gusta :( ",Toast.LENGTH_LONG).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"Me gusta ;) ",Toast.LENGTH_LONG).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this,"No me gusta :( ",Toast.LENGTH_LONG).show();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
                    startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
                startActivity(intent);
            }
        });
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("saludo",saludo);
                startActivity(intent);
            }
        });
    }
    public void miMetodo(View v)
    {
        Toast.makeText(MainActivity.this,";)",Toast.LENGTH_LONG).show();
    }

}
