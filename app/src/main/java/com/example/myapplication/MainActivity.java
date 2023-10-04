package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//     //создание TextView
//      TextView textView = new TextView(this);
//        // установка текста в TextView
//        textView.setText("Hello Android");
//        // установка высоты текста
//        textView.setTextSize(26);
//        // устанавливаем параметры размеров и расположение элемента
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        // выравнивание по левому краю ConstraintLayout
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        // выравнивание по верхней границе ConstraintLayout
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        // устанавливаем параметры для textView
//        textView.setLayoutParams(layoutParams);
//        // добавляем TextView в ConstraintLayout
//        constraintLayout.addView(textView);
//        // в качестве корневого
//        setContentView(constraintLayout);
// загрузка интерфейса из файла activity_main.xml

        setContentView(R.layout.second_layout);
TextView textView= findViewById(R.id.header);
textView.setText("Hello");

    }
}