package com.example.git_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //안녕? 나는 로봇
    //인간이 수정하였다.
    //이간이 수정하였다.2
    //어라? 로봇이 손을 댔네? 나도 고칠거 있다
    //로봇이 수정 1
    //로좃이 수정2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("마스터 입니다.","마스터라구요");
    }
}