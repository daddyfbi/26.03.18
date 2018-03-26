package startandroid.androidcalc;

import android.provider.ContactsContract;
import android.support.v4.content.IntentCompat;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public  class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAct12;
    Button btnAct13;


    final int MENU_RESET_ID = 1;
    final int MENU_QUIT_ID = 2;

    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    String oper = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum1 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);


        tvResult = (TextView) findViewById(R.id.tvResult);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        btnAct12 = (Button) findViewById(R.id.btnAct12);
        btnAct12.setOnClickListener(this);
        btnAct13 = (Button) findViewById(R.id.btnAct13);
        btnAct13.setOnClickListener(this);



    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnAct12:
                Intent intent12  = new Intent(this, MainActivityTwo.class);
                startActivity(intent12);
                break;
            default:
                break;

        }

        switch (v.getId()) {

            case R.id.btnAct13:
                Intent intent13 = new Intent(this, MainActivityThree.class);
                startActivity(intent13);
                break;
            default:
                break;

        }



        float num1 = 0;
        float num2 = 0;
        float result = 0;;


        // Проверяем поля на пустоту
        if (TextUtils.isEmpty(etNum1.getText().toString())
                || TextUtils.isEmpty(etNum2.getText().toString())) {
            return;
        }

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (v.getId()) {

            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
        }

        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result );





    }




    // создание меню
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_RESET_ID, 0, "Reset");
        menu.add(0, MENU_QUIT_ID, 0, "Quit");
        return super.onCreateOptionsMenu(menu);
    }

    // обработка нажатий на пункты меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_RESET_ID:
                // очищаем поля
                etNum1.setText("");
                etNum2.setText("");
                tvResult.setText("");
                break;
            case MENU_QUIT_ID:
                // выход из приложения
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
