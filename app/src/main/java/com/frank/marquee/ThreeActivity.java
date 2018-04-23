package com.frank.marquee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ThreeActivity extends AppCompatActivity {

    private String flag = "log_message";

    /**
     * 设置显示的view
     */
    List<View> views = new ArrayList<View>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        UPMarqueeView ts_activity = (UPMarqueeView) findViewById(R.id.sl_activity);
        setView();
        ts_activity.setViews(views);

    }

    /**
     * 设置布局文件
     */

    private void setView() {
        for (int i = 0; i < 3; i++) {
            final int position = i;
            // 设置滚动的单个布局
            LinearLayout moreView = (LinearLayout) LayoutInflater.from(ThreeActivity.this).inflate(R.layout.item_view, null);
            // 初始化布局的控件
            TextView tv1 = (TextView) moreView.findViewById(R.id.tv1);
            // 进行对控件赋值
            tv1.setText("Pony第" + i + "个信息");
            // 添加到循环滚动数组里面去
            views.add(moreView);
        }
    }

}
