package startandroid.androidcalc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivityThree extends AppCompatActivity implements View.OnClickListener {


    Button btnAct31;
    Button btnAct32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAct31 = (Button) findViewById(R.id.btnAct31);
        btnAct31.setOnClickListener( this);
        btnAct32 = (Button) findViewById(R.id.btnAct32);
        btnAct32.setOnClickListener( this);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnAct31:
                Intent intent31 = new Intent(this, MainActivity.class);
                startActivity(intent31);
                break;
            default:
                break;
        }

        switch (view.getId()) {
            case R.id.btnAct32:
                Intent intent32 = new Intent(this, MainActivityTwo.class);
                startActivity(intent32);
                break;
            default:
                break;
        }


    }
}

