package com.yxliu.androidutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yxliu.androidutil.util.PermissionPageUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_jump_permission_page).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PermissionPageUtil permissionPageUtil = new PermissionPageUtil(MainActivity.this);
                permissionPageUtil.jumpPermissionPage();
            }
        });


    }
}
