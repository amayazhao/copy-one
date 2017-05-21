package com.zhao.copyone.ui.home;

import com.zhao.copyone.BasePresenter;
import com.zhao.copyone.BaseView;
import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.model.bean.ItemList;

import java.util.List;

/**
 * Created by 39424 on 2017/3/12.
 */

public interface HomeContract {
    public interface View extends BaseView<Presenter> {
        void showOnday(DayInfo info);
        void showItemList(ItemList itemList);
        void onLoadListId(List<String> list);
        void showErrorMessage(String message);
        void setLoadIndicator(boolean active);
    }

    public interface Presenter extends BasePresenter{
        void loadOneday(String id);
        void loadListId();
        void loadItemList(String type);
    }
}
