package com.example.time;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                CountDownButtonHelper helper = new CountDownButtonHelper(btn,
                        "发送验证码", 20, 1);
                helper.setOnFinishListener(new CountDownButtonHelper.OnFinishListener() {

                    @Override
                    public void finish() {
                        Toast.makeText(MainActivity.this, "倒计时结束",
                                Toast.LENGTH_SHORT).show();
                    }
                });
                helper.start();

            }
        });
    }
}
