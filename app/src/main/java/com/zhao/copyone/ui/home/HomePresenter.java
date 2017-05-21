package com.zhao.copyone.ui.home;

import com.zhao.copyone.model.bean.ListInfo;
import com.zhao.copyone.model.impl.OneDataRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 39424 on 2017/3/12.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mView;
    private OneDataRepository mOneRepository;
    public static final String ONE_READING = "reading";
    public static final String ONE_MUSIC = "music";
    public static final String ONE_MOVIE = "movie";

    public HomePresenter(HomeContract.View view,OneDataRepository data){
        mView = view;
        mOneRepository = data;
        mView.setPresenter(this);
    }

    @Override
    public void loadOneday(String id) {
        mOneRepository.getDayInfo(id)
                .firstOrError()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        next -> mView.showOnday(next),
                        r -> mView.showErrorMessage(r.getMessage())
                );
    }

    public void loadItemList(String type){
        mOneRepository.getItemList(type)
                .firstOrError()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    next -> mView.showItemList(next),
                    r -> mView.showErrorMessage(r.getMessage())
                );
    }

    @Override
    public void loadListId() {
        mOneRepository.getListInfo()
                .map(new Function<ListInfo, List<String>>() {
                    @Override
                    public List<String> apply(ListInfo listInfo) throws Exception {
                        return listInfo.getData();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        //onNext
                        list -> mView.onLoadListId(list),
                        //onError
                        r -> mView.showErrorMessage(r.getMessage())
                );
    }

    @Override
    public void subscibe() {

    }

    @Override
    public void onSubscibe() {

    }
}
