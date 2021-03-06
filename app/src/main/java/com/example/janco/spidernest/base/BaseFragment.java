package com.example.janco.spidernest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.delegate.BaseMvpDelegateCallback;

import butterknife.ButterKnife;

/**
 * Created by janco on 19.05.2016.
 */
public abstract class BaseFragment<VIEW extends IBaseView, PRESENTER extends BasePresenter<VIEW>>
        extends MvpFragment<VIEW, PRESENTER>
        implements BaseMvpDelegateCallback<VIEW, PRESENTER>, IBaseView {

    private IBaseView hostActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflateView(inflater, container);
        super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, view);
        prepareView(savedInstanceState);
        return view;
    }

    protected View inflateView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(getResourceId(), container, false);
    }

    protected abstract int getResourceId();

    protected abstract void prepareView(Bundle savedInstanceState);

    @Override
    @Nullable
    public BaseActivity getInstance() {
        return hostActivity.getInstance();
    }

}
