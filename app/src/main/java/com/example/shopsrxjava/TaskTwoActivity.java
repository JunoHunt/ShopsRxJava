package com.example.shopsrxjava;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TaskTwoActivity extends AppCompatActivity {

    /***
     * Это задание имитирует загрузку родуктов, и поиск среди них.
     *
     * Вам необходимо реализовать следующее поведение:
     * 1. При старте активити сделать закрузку продуктов initProducts() в фоне
     * и после загрузки отобразить данные в act_task_two_answers_rv.
     * На время загрузки необходимо показывать прогресс
     * (можно использовать showProgress() и hideProgress())
     * 2. При вводе текста в act_task_two_query_et, если 2 секунды не было изменений,
     * то начинать поиск в массиве, который был проинициализированн в начале.
     * Условие для поиска, если название начинается с введенной строки
     * Результат поиска отобразить в act_task_two_answers_rv.
     * На время загрузки необходимо показывать прогресс
     * (можно использовать showProgress() и hideProgress())
     */

    private View progressView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_task_two);
        progressView = findViewById(R.id.act_task_two_search_progress);
    }

    private List<String> initProducts() {
        ArrayList<String> alphabet = new ArrayList<>();
        char alphabetStart = 'a';
        char alphabetEnd = 'z';
        while (alphabetStart <= alphabetEnd) {
            alphabet.add(String.valueOf(alphabetStart));
            alphabetStart++;
        }
        ArrayList<String> products = new ArrayList<>();
        for (String let1 : alphabet) {
            for (String let2 : alphabet) {
                for (String let3 : alphabet) {
                    for (String let4 : alphabet) {
                        products.add(let1 + let2 + let3 + let4);
                    }
                }
            }
        }
        return products;
    }

    private void showProgress() {
        progressView.setVisibility(View.VISIBLE);
    }

    private void hideProgress() {
        progressView.setVisibility(View.GONE);
    }
}
