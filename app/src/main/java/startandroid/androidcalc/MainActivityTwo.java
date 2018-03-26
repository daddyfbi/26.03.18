package startandroid.androidcalc;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivityTwo extends AppCompatActivity implements View.OnClickListener {

    Button button21;
    Button button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(this);
        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(this);






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
            case R.id.button21:
                Intent intent21 = new Intent(this, MainActivity.class);
                startActivity(intent21);
                break;
            default:
                break;

        }
        switch (view.getId()) {
            case R.id.button23:
                Intent intent23 = new Intent(this, MainActivityThree.class);
                startActivity(intent23);
                break;
            default:
                break;
        }



    }
}
