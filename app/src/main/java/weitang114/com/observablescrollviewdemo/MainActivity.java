package weitang114.com.observablescrollviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.ksoichiro.android.observablescrollview.samples.FlexibleSpaceWithImageScrollViewActivity;
import com.github.ksoichiro.android.observablescrollview.samples.ViewPagerTabScrollViewActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick1(View v) {
        Intent intent = new Intent();
        intent.setClass(this, ViewPagerTabScrollViewActivity.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent();
        intent.setClass(this, FlexibleSpaceWithImageScrollViewActivity.class);
        startActivity(intent);
    }

}
