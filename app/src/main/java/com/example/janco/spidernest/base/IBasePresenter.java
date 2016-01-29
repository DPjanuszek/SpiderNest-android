package com.example.janco.spidernest.base;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by janco on 29.01.2016.
 */
public interface IBasePresenter <V extends MvpView> extends MvpPresenter<V> {
}
