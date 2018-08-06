package com.juangabrielgomila.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Variable para sostener el valor entero que vamos a mostrar
    private int value = 0;

    //Variables para los 6 botones y la text view
    private TextView textView;
    private Button btnAdd, btnTake, btnGrow, btnShrink, btnHide, btnReset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_view);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnTake = (Button) findViewById(R.id.btnTake);
        btnGrow = (Button) findViewById(R.id.btnGrow);
        btnShrink = (Button) findViewById(R.id.btnShrink);
        btnHide = (Button) findViewById(R.id.btnHide);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnAdd.setOnClickListener(this);
        btnTake.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnHide.setOnClickListener(this);
        btnReset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.i("Main Activity", "onClick: "+view.getId());

        float scale;

        switch (view.getId()){
            case R.id.btnAdd:
                value++;
                textView.setText(""+value);
                break;

            case R.id.btnTake:
                value--;
                textView.setText(""+value);
                break;

            case R.id.btnReset:
                value = 0;
                textView.setText(""+value);
                break;


            case R.id.btnGrow:
                scale = textView.getTextScaleX();
                scale = scale +1;
                textView.setTextScaleX(scale);
                break;


            case R.id.btnShrink:
                scale = textView.getTextScaleX();
                scale = scale -1;
                textView.setTextScaleX(scale);
                break;


            case R.id.btnHide:
                if (textView.getVisibility() == View.VISIBLE){
                    //En este caso, la vista está visible y debemos ocultarla....
                    textView.setVisibility(View.INVISIBLE);
                    btnHide.setText("Mostrar");
                }else {
                    //En este caso, la vista está invisible, debemos mostrarla...
                    textView.setVisibility(View.VISIBLE);
                    btnHide.setText("Ocultar");
                }
                break;
        }
    }
}
