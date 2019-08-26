package com.netology.androidcherepanov121;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String txt = "Текст 1";
        //TextView txtMain = (TextView)this.findViewById(R.id.textMain);
        //txtMain.setText(txt);

        //String txtForUser = getString(R.string.superUser);
        //txtMain.setText(txt);

        // Инициализируем компонент
        //TextView textView = findViewById(R.id.textMain);

       // String s = getString(R.string.textOut1) + " " + getString(R.string.textOut2) + " ";
        // задаём текст
       // textView.setText(s);


    }

    // Метод обработки кнопки "ОК"
    public void buttenOkClick (View butten) {

        // Инициализируем компонент
        TextView textView1 = findViewById(R.id.editTextName);
        String textOutName = textView1.getText().toString(); // берем текст и приводим к типу String

        TextView textView2 = findViewById(R.id.editTextEmail);
        String textOutEmail = textView2.getText().toString();

        // Выводим тост
        Toast.makeText(this, "Подписка прошла успешно", Toast.LENGTH_SHORT).show();

        // Инициализируем компонент
        TextView textView = findViewById(R.id.textMain);

        // Составляем сообщение
        String s = getString(R.string.textOut1) + " " + textOutName + " " +
                getString(R.string.textOut2) + " " + textOutEmail;

        // Выводим сообщение в textView
        textView.setText(s);
    }

    // Метод обработки кнопки "Очистить"
    public void buttenClearClick (View butten) {

        Toast.makeText(this, "Форма ввода очищена", Toast.LENGTH_SHORT).show();

        // Инициализируем компонент
        TextView textView = findViewById(R.id.textMain);

        // Выводим пустое сообщение в textMain
        textView.setText(R.string.emptiness);

        // Инициализируем компонент
        TextView textViewName = findViewById(R.id.editTextName);

        // Выводим пустое сообщение в editTextName
        textViewName.setText(R.string.emptiness);

        // Инициализируем компонент
        TextView textViewEmail = findViewById(R.id.editTextEmail);

        // Выводим пустое сообщение в editTextName
        textViewEmail.setText(R.string.emptiness);


    }
}
