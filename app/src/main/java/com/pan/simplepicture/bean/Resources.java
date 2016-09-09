/**
 * Copyright 2015 aTool.org
 */
package com.pan.simplepicture.bean;


import android.os.Parcel;
import android.os.Parcelable;

import com.pan.simplepicture.inter.AbsVideoRes;
import com.pan.simplepicture.utils.StringUtils;

/**
 * Auto-generated: 2015-12-21 12:51:35
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Resources extends AbsVideoRes implements Parcelable {
    public int type = 1;
    public String rsId;//资源id
    public Modules modules;
    public String title;//标题
    public String link;//视频地址
    public String thumbnail;//
    public String thumbnailV2;//和thumbnail一样
    public String duration;//播放时长
    public String published;//上传时间
    public String uptime;//更新时间
    public String description;//描述
    public String player;
    public String streamtypes;
    public String flag;
    public int viewCount;//播放次数
    public int favoriteCount;
    public int upcount;
    public int downcount;
    public int commentcount;
    public String tag;
    public int allRecommend;
    public int albumHot;
    public int enable;

    public Resources() {
    }

    protected Resources(Parcel in) {
        type = in.readInt();
        rsId = in.readString();
        title = in.readString();
        link = in.readString();
        thumbnail = in.readString();
        thumbnailV2 = in.readString();
        duration = in.readString();
        published = in.readString();
        uptime = in.readString();
        description = in.readString();
        player = in.readString();
        streamtypes = in.readString();
        flag = in.readString();
        viewCount = in.readInt();
        favoriteCount = in.readInt();
        upcount = in.readInt();
        downcount = in.readInt();
        commentcount = in.readInt();
        tag = in.readString();
        allRecommend = in.readInt();
        albumHot = in.readInt();
        enable = in.readInt();
    }

    public static final Creator<Resources> CREATOR = new Creator<Resources>() {
        @Override
        public Resources createFromParcel(Parcel in) {
            return new Resources(in);
        }

        @Override
        public Resources[] newArray(int size) {
            return new Resources[size];
        }
    };

    @Override
    public String getVideoTitle() {
        return title;
    }

    @Override
    public String getVideoDes() {
        return description;
    }

    @Override
    public String getVideoDuration() {
        return StringUtils.timeFormatter(duration);
    }

    @Override
    public String getVideoThumbnail() {
        return thumbnailV2;
    }

    @Override
    public String getSmallVideoThumbnail() {
        return thumbnail;
    }

    @Override
    public String getVideoId() {
        return rsId;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getUrl() {
        return link;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(type);
        parcel.writeString(rsId);
        parcel.writeString(title);
        parcel.writeString(link);
        parcel.writeString(thumbnail);
        parcel.writeString(thumbnailV2);
        parcel.writeString(duration);
        parcel.writeString(published);
        parcel.writeString(uptime);
        parcel.writeString(description);
        parcel.writeString(player);
        parcel.writeString(streamtypes);
        parcel.writeString(flag);
        parcel.writeInt(viewCount);
        parcel.writeInt(favoriteCount);
        parcel.writeInt(upcount);
        parcel.writeInt(downcount);
        parcel.writeInt(commentcount);
        parcel.writeString(tag);
        parcel.writeInt(allRecommend);
        parcel.writeInt(albumHot);
        parcel.writeInt(enable);
    }

    @Override
    public String toString() {
        return "Resources{" +
                "type=" + type +
                ", rsId='" + rsId + '\'' +
                ", modules=" + modules +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", thumbnailV2='" + thumbnailV2 + '\'' +
                ", duration='" + duration + '\'' +
                ", published='" + published + '\'' +
                ", uptime='" + uptime + '\'' +
                ", description='" + description + '\'' +
                ", player='" + player + '\'' +
                ", streamtypes='" + streamtypes + '\'' +
                ", flag='" + flag + '\'' +
                ", viewCount=" + viewCount +
                ", favoriteCount=" + favoriteCount +
                ", upcount=" + upcount +
                ", downcount=" + downcount +
                ", commentcount=" + commentcount +
                ", tag='" + tag + '\'' +
                ", allRecommend=" + allRecommend +
                ", albumHot=" + albumHot +
                ", enable=" + enable +
                '}';
    }
}