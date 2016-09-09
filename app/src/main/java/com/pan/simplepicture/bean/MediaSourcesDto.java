package com.pan.simplepicture.bean;

import android.os.Parcel;
import android.os.Parcelable;

import com.pan.simplepicture.inter.AbsVideoRes;

/**
 * Created by toto on 2016/9/8.
 */
public class MediaSourcesDto  extends AbsVideoRes implements Parcelable {

    public String id;
    /**
     * 标题
     */
    public String title;
    /**
     * 发布时间（创建时间）
     */
    public String publishTime;
    /**
     * 观看费用/次
     */
    public Double fees;
    /**
     * 分类
     */
    public String type;
    /**
     * 级别
     */
    public String level;
    /**
     * 观看次数
     */
    public int times;
    /**
     * 时长
     */
    public String length;
    /**
     * 介绍
     */
    public String introduction;
    /**
     * 视频缩略图（附件）
     */
    private String attachmentId;

    /**
     * 视频文件(附件)
     */
    private String attachmentMediaId;


    protected MediaSourcesDto(Parcel in) {
        id = in.readString();
        title = in.readString();
        publishTime = in.readString();
        fees = in.readDouble();
        type = in.readString();
        level = in.readString();
        times = in.readInt();
        length = in.readString();
        introduction = in.readString();
        attachmentId = in.readString();
        attachmentMediaId = in.readString();
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getAttachmentMediaId() {
        return attachmentMediaId;
    }

    public void setAttachmentMediaId(String attachmentMediaId) {
        this.attachmentMediaId = attachmentMediaId;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeString(publishTime);
        dest.writeDouble(fees);
        dest.writeString(type);
        dest.writeString(level);
        dest.writeInt(times);
        dest.writeString(length);
        dest.writeString(introduction);
        dest.writeString(attachmentId);
        dest.writeString(attachmentMediaId);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MediaSourcesDto> CREATOR = new Creator<MediaSourcesDto>() {
        @Override
        public MediaSourcesDto createFromParcel(Parcel in) {
            return new MediaSourcesDto(in);
        }

        @Override
        public MediaSourcesDto[] newArray(int size) {
            return new MediaSourcesDto[size];
        }
    };

    @Override
    public String getVideoTitle() {
        return title;
    }

    @Override
    public String getVideoDes() {
        return introduction;
    }

    @Override
    public String getVideoDuration() {
        return "";
    }

    @Override
    public String getVideoThumbnail() {
        return attachmentId;
    }

    @Override
    public String getSmallVideoThumbnail() {
        return attachmentId;
    }

    @Override
    public String getVideoId() {
        return id;
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public String getUrl() {
        return attachmentMediaId;
    }

    @Override
    public String toString() {
        return "MediaSources{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", fees=" + fees +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", times=" + times +
                ", length='" + length + '\'' +
                ", introduction='" + introduction + '\'' +
                ", attachmentId='" + attachmentId + '\'' +
                ", attachmentMediaId='" + attachmentMediaId + '\'' +
                '}';
    }
}
