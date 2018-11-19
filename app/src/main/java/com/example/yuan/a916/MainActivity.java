package com.example.yuan.a916;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final boolean[] flag = {true};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取布局文件中的添加的线性布局管理器
        LinearLayout ll = (LinearLayout)findViewById(R.id.ll);
        //获取AnimationDrawable对象
        final AnimationDrawable animationDrawable = (AnimationDrawable)ll.getBackground();
        //为线性布局管理器添加单击事件监听器
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flag[0]){
                    animationDrawable.start();
                }else {
                    animationDrawable.stop();
                    flag[0] =true;
                }
            }
        });
    }
}
