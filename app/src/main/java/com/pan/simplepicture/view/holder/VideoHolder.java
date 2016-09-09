package com.pan.simplepicture.view.holder;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.pan.simplepicture.R;
import com.pan.simplepicture.bean.Series;
import com.pan.simplepicture.inter.AbsVideoRes;
import com.pan.simplepicture.inter.ParallaxViewController;
import com.pan.simplepicture.utils.FrecsoUtils;
import com.pan.simplepicture.view.activity.PlayActivity;

import butterknife.Bind;

/**
 * Video的item布局实现（res_item.xml）
 * Created by sysadminl on 2015/12/11.
 */
public class VideoHolder extends BaseHolder<AbsVideoRes> {
    public VideoHolder(View view) {
        super(view);
    }

    @Bind(R.id.iv_pic)
    public SimpleDraweeView iv_pic;
    @Bind(R.id.tv_title)
    public TextView tv_title;
    @Bind(R.id.tv_duration)
    public TextView tv_duration;
    Object mInt;

    @Override
    public void init() {
        super.init();
        Object mObject = mView.getTag(R.id.tag_first); //获取第一个视图标记的对象  在VideoFragment中的setAdapter（）方法中被标记
        mInt = mView.getTag(R.id.tag_second);//获取第二个视图标记的对象  在VideoFragment中的setAdapter（）方法中被标记
        if (mObject != null && mObject instanceof ParallaxViewController) {
            ((ParallaxViewController) mObject).imageParallax(iv_pic);//添加加载控件
        }
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mData.setVideoInfo();
                if (mInt != null && mData instanceof Series) {
                    switch ((int) mInt) {
                        case 6:
                            ((Series) mData).type = 100;
                            break;
                        case 5:
                        case 7:
                            ((Series) mData).type = 2;
                            break;
                    }
                }
                Intent intent = new Intent(mContext, PlayActivity.class);
                intent.putExtra("video", mData);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public void setData(AbsVideoRes mData) {  //在BaseRecyclerAdapter<T> 中调用并被赋值
        super.setData(mData);
        tv_duration.setText(mData.getVideoDuration());//持续时间
        tv_title.setText(mData.getVideoTitle()); //标题
        FrecsoUtils.loadImage(mData.getVideoThumbnail(), iv_pic);//加载图片链接
    }
}
