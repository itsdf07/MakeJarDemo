package com.sdf.aso.makejar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.sdf.aso.common.TestUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("dfsu", "测试Log ：" + TestUtils.getTestMsg());
    }
}
