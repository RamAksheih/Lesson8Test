package com.example.lesson18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hi everyone!");
        System.out.println("Im ok");
        System.out.println("I like trees");
        String string = "My best string";
    }
}


/*
git init
git status
git add Путь к проекту
git config --global user.email "you@example.com"
git config --global user.name "yourName"
git commit -m "Message about project"
git remote add origin Initial commit ссылка на гитхаб репозиторий
git push --set-upstream origin master
Авторизация данных с гитхабаккаунта


 */