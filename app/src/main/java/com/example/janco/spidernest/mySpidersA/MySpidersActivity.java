package com.example.janco.spidernest.mySpidersA;

import android.widget.Button;
import android.widget.TextView;

import com.example.janco.spidernest.R;
import com.example.janco.spidernest.base.BaseActivity;
import com.example.janco.spidernest.utils.ActivityConfig;
import com.example.janco.spidernest.utils.ActivityConfigBuilder;

import butterknife.Bind;
import butterknife.OnClick;

public class MySpidersActivity extends BaseActivity<IMySpidersView, MySpidersPresenter>
        implements IMySpidersView {


    @Bind(R.id.textView) TextView textView;
    @Bind(R.id.spiderButton) Button spiderButton;
    @OnClick(R.id.spiderButton)
    public void onClick() {
        presenter.tarantula();

    }


    @Override
    protected ActivityConfig getConfig() {
        return new ActivityConfigBuilder(R.layout.activity_my_spiders).build();
    }

    @Override
    protected void addToCreate() {

    }

    @Override
    public void showTarantula(String name) {
        textView.setText(name);
    }


    @Override
    public MySpidersPresenter createPresenter() {
        return new MySpidersPresenter();
    }
}
