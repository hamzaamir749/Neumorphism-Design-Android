package com.coderpakistan.neumorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.coderpakistan.neumorphism.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        animation = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_in);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.loginMain.setVisibility(View.VISIBLE);
                binding.loginMain.setAnimation(animation);
            }
        }, 1000);

        findViewById(R.id.login_btnForgetPassword).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
                Animatoo.animateDiagonal(LoginActivity.this);
            }
        });


        findViewById(R.id.login_btnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                Animatoo.animateDiagonal(LoginActivity.this);
            }
        });

        findViewById(R.id.login_btnSignin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                Animatoo.animateDiagonal(LoginActivity.this);
            }
        });
    }
}