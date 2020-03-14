package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String key = "textKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Метод обработки нажатия на кнопку и перехода на SecondActivity
    public void goToSecondActivity(View v){

        Intent intent=new Intent(this,SecondActivity.class);
        // Получаем доступ к текстовому полю в MainActivity
        EditText editText = findViewById(R.id.editText);
        //Получаем текст который ввели в editText
        String input = editText.getText().toString();
        // putExtra-положить в map кот. видят все Activity.
        // Первый параметр - ключ,
        // Второй параметр - значение этого объекта
        intent.putExtra(key, input);
        startActivity(intent);



    }
}
