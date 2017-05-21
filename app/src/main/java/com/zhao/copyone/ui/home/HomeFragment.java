package com.zhao.copyone.ui.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhao.copyone.R;
import com.zhao.copyone.adapter.OneItemAdapter;
import com.zhao.copyone.model.bean.DayInfo;
import com.zhao.copyone.model.bean.ItemList;
import com.zhao.copyone.model.impl.OneDataRepository;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 39424 on 2017/3/12.
 */

public class HomeFragment extends Fragment implements HomeContract.View{
    public static final String TAG = "HomeFragment";
    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;
    private static final String FRAGMENT_CATEGORY = "category";
    private HomeContract.Presenter mPresenter;
    private OneItemAdapter mAdapter;
    private List<String> idList;
    private String mCategory = null;

    public HomeFragment(){

    }

    public static HomeFragment newInstance(String category) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(FRAGMENT_CATEGORY, category);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mCategory = getArguments().getString(FRAGMENT_CATEGORY);
        }
        Log.d(TAG,"onCreate" + mCategory);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_day, container, false);
        ButterKnife.bind(this, root);
        mAdapter = new OneItemAdapter(getContext(),new ArrayList<>());
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerview.setAdapter(mAdapter);
        mPresenter = new HomePresenter(this, OneDataRepository.getInstance());
        try {
            loadContent();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return root;
    }

    private void loadContent() throws UnsupportedEncodingException{
        Log.d(TAG,"Category" + mCategory);
        if(mCategory == null){
            return;
        }
        if( mCategory == getString(R.string.one_day)){
            Log.d(TAG,"one_day");
            mPresenter.loadListId();
        }else{
            mPresenter.loadItemList(mCategory);
        }
    }

    @Override
    public void showOnday(DayInfo info) {
        if(info.getRes() == 0){
            mAdapter.setContents(info.getData().getContent_list());
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showItemList(ItemList itemList) {
        if(itemList.getRes() == 0){
            mAdapter.setContents(itemList.getData());
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showErrorMessage(String message) {
        Log.d(TAG,message);
    }

    @Override
    public void setLoadIndicator(boolean active) {

    }

    @Override
    public void onLoadListId(List list) {
        Log.d(TAG,list.toString());
        idList = list;
        mPresenter.loadOneday(idList.get(0));
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {

    }
}
