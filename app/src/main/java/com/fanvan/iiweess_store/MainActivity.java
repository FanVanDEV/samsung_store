package com.fanvan.iiweess_store;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button confirm = findViewById(R.id.confirm);
        Button clear = findViewById(R.id.clear);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Доставим через 15 минут!", Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "АААААА, МЫ НЕ УМЕЕМ СОХРАНЯТЬ ДАННЫЕ! ВЫ ВСЕ ПОТЕРЯЛИ", Toast.LENGTH_LONG).show();
    }

    private void clear() {
        RadioGroup radioGroup = findViewById(R.id.RG1);
        CheckBox checkBox0 = findViewById(R.id.check_0);
        CheckBox checkBox1 = findViewById(R.id.check_1);
        CheckBox checkBox2 = findViewById(R.id.check_2);
        CheckBox checkBox3 = findViewById(R.id.check_3);
        CheckBox checkBox4 = findViewById(R.id.check_4);
        CheckBox checkBox5 = findViewById(R.id.check_5);
        EditText editText = findViewById(R.id.ET);

        editText.setText("");
        radioGroup.clearCheck();
        checkBox0.setChecked(false);
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        checkBox5.setChecked(false);
    }
}