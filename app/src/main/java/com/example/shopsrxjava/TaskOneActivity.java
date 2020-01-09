package com.example.shopsrxjava;

import android.os.Bundle;
import android.util.Patterns;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TaskOneActivity extends AppCompatActivity {

    /**
     * В этом задании вам необходимо реализовать валидацию
     * полей для авторизации с помощью RxJava
     * Необходимл реализовать следующее поведение:
     * Кнопка act_task_one_login_btn становиться активной только если:
     * текст из act_task_one_email_et проходит проверку isEmailValid
     * и текст из act_task_one_password_et проходит проверку isPasswordValid
     * <p>
     * Дополнительно: показывать ошибку в случае если поле не проходит проверку
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_task_one);
    }

    private boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }
}
