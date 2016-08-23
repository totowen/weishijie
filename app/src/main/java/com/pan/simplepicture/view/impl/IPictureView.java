package com.pan.simplepicture.view.impl;

import com.pan.simplepicture.bean.Juzimi;

import java.util.List;

/**
 * Created by sysadminl on 2015/12/9.
 */
public interface IPictureView extends IBaseView {

    //设置适配器
    void setAdapter(List<Juzimi> list);
    //加载更多图片
    void loadMore(List<Juzimi> list);
    //刷新完成
    void onRefreshComplete();
    //加载完成
    void onLoadMoreComplete();

    void showSuccess();

    void showEmpty();

    boolean checkNet();

    void showFaild();

    void showNoNet();
}
