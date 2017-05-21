package com.zhao.copyone.ui.reading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.zhao.copyone.R;
import com.zhao.copyone.network.Network;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class EssayDetailActivity extends AppCompatActivity {

    @BindView(R.id.webview)
    WebView webview;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.author)
    TextView author;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private String mItemId;
    String linkcss = "<link rel=\"stylesheet\" type=\"text/css\" href=\"details.css\" />";
    String css = "<div class=\"content\">";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_detail);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        mItemId = getIntent().getStringExtra("ItemId");
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAppCachePath(getCacheDir().getAbsolutePath() + "/webViewCache");
        settings.setAppCacheEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webview.setWebChromeClient(new WebChromeClient());
        loadDetail(mItemId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (webview != null) {
            ((ViewGroup) webview.getParent()).removeView(webview);
            webview.destroy();
            webview = null;
        }
    }

    void loadDetail(String id) {
        Network.getOneApiClient().getEssayDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        next -> {
                            tvTitle.setText(next.getData().getHp_title());
                            author.setText(next.getData().getHp_author());
                            String content = linkcss  + next.getData().getHp_content() ;
                            webview.loadDataWithBaseURL("file:///android_asset/", content, "text/html", "utf-8", null);
                        },
                        r -> Toast.makeText(this, r.getMessage(), Toast.LENGTH_SHORT)
                );
    }
}
