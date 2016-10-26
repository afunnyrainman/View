package com.example.user.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    YuanView yuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yuan = (YuanView) findViewById(R.id.yuan);
        yuan.start();
        yuan
                .setCountDownTimerListener(new YuanView.CountDownTimerListener() {
            @Override
            public void onStartCount () {// 开始
            }

            @Override
            public void onFinishCount () {// 结束
            }
        });
    }
}
