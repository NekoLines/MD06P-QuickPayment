package com.nekolines.expresspay;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import android.os.Handler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();

        attributes.dimAmount = 0.5f; //设置窗口之外部分透明程度
        attributes.x = 0;
        attributes.y = 0;
        attributes.width = 576;
        getWindow().setAttributes(attributes);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);


    }

    @Override
    protected void onResume() {
        ImageView iv1 = findViewById(R.id.imageView);
        ImageView iv2 = findViewById(R.id.imageView2);
        ImageView iv3 = findViewById(R.id.imageView3);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getString(R.string.alipay_scan),Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=10000007");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                System.exit(0);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getString(R.string.alipay_qr),Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=20000056");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                System.exit(0);
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),getString(R.string.wechat_scan),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
                intent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
                intent.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TOP );
                intent.setAction("android.intent.action.VIEW");
                startActivity(intent);
                System.exit(0);

            }
        });

        super.onResume();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_1) {
            Toast.makeText(getApplicationContext(),getString(R.string.alipay_scan),Toast.LENGTH_SHORT).show();
            Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=10000007");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
            System.exit(0);
        } else if (keyCode == KeyEvent.KEYCODE_2) {
            Toast.makeText(getApplicationContext(),getString(R.string.alipay_qr),Toast.LENGTH_SHORT).show();
            Uri uri = Uri.parse("alipayqr://platformapi/startapp?saId=20000056");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
            System.exit(0);
        } else if (keyCode == KeyEvent.KEYCODE_3) {
            Toast.makeText(getApplicationContext(),getString(R.string.wechat_scan),Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
            intent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
            intent.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_ACTIVITY_CLEAR_TOP );
            intent.setAction("android.intent.action.VIEW");
            startActivity(intent);
            System.exit(0);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onPause() {
        System.exit(0);
        super.onPause();
    }
}