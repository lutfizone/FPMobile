package com.lutfizone.moviesion.ui.tvshow;

import com.lutfizone.moviesion.model.TvShowItem;

import java.util.ArrayList;

public interface TvShowView {
    void showLoad();

    void finishLoad();

    void showList(ArrayList<TvShowItem> listTvShow);

    void noData();
}

