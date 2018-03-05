package com.example.alex.testskillsapplication.http.model;

import android.databinding.BaseObservable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by alex on 04.03.18.
 */

public class Top extends BaseObservable implements Serializable, Parcelable {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("ClusterId")
    @Expose
    private Integer clusterId;
    @SerializedName("NewsId")
    @Expose
    private Integer newsId;
    @SerializedName("DateCreated")
    @Expose
    private Integer dateCreated;
    @SerializedName("SeoTitle")
    @Expose
    private String seoTitle;
    @SerializedName("HasImage")
    @Expose
    private Boolean hasImage;
    @SerializedName("HasVideo")
    @Expose
    private Boolean hasVideo;
    @SerializedName("TopValue")
    @Expose
    private Boolean topValue;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("PartnerTitle")
    @Expose
    private String partnerTitle;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("DateLast")
    @Expose
    private Integer dateLast;
    @SerializedName("NewsCount")
    @Expose
    private Integer newsCount;
    @SerializedName("Details")
    @Expose
    private Boolean details;
    @SerializedName("Transition")
    @Expose
    private Boolean transition;
    @SerializedName("OriginalId")
    @Expose
    private Integer originalId;
    @SerializedName("PartnerId")
    @Expose
    private Integer partnerId;
    public final static Parcelable.Creator<Top> CREATOR = new Creator<Top>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Top createFromParcel(Parcel in) {
            return new Top(in);
        }

        public Top[] newArray(int size) {
            return (new Top[size]);
        }

    }
            ;
    private final static long serialVersionUID = 3685341393872216081L;

    protected Top(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.clusterId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.newsId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dateCreated = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.seoTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.hasImage = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasVideo = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.topValue = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.partnerTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.dateLast = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.newsCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.details = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.transition = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.originalId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.partnerId = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Top() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Top withId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public Top withClusterId(Integer clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Top withNewsId(Integer newsId) {
        this.newsId = newsId;
        return this;
    }

    public Integer getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Top withDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
    }

    public Top withSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle;
        return this;
    }

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
    }

    public Top withHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
        return this;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public Top withHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
        return this;
    }

    public Boolean getTopValue() {
        return topValue;
    }

    public void setTopValue(Boolean topValue) {
        this.topValue = topValue;
    }

    public Top withTopValue(Boolean topValue) {
        this.topValue = topValue;
        return this;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Top withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPartnerTitle() {
        return partnerTitle;
    }

    public void setPartnerTitle(String partnerTitle) {
        this.partnerTitle = partnerTitle;
    }

    public Top withPartnerTitle(String partnerTitle) {
        this.partnerTitle = partnerTitle;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Top withUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getDateLast() {
        return dateLast;
    }

    public void setDateLast(Integer dateLast) {
        this.dateLast = dateLast;
    }

    public Top withDateLast(Integer dateLast) {
        this.dateLast = dateLast;
        return this;
    }

    public Integer getNewsCount() {
        return newsCount;
    }

    public void setNewsCount(Integer newsCount) {
        this.newsCount = newsCount;
    }

    public Top withNewsCount(Integer newsCount) {
        this.newsCount = newsCount;
        return this;
    }

    public Boolean getDetails() {
        return details;
    }

    public void setDetails(Boolean details) {
        this.details = details;
    }

    public Top withDetails(Boolean details) {
        this.details = details;
        return this;
    }

    public Boolean getTransition() {
        return transition;
    }

    public void setTransition(Boolean transition) {
        this.transition = transition;
    }

    public Top withTransition(Boolean transition) {
        this.transition = transition;
        return this;
    }

    public Integer getOriginalId() {
        return originalId;
    }

    public void setOriginalId(Integer originalId) {
        this.originalId = originalId;
    }

    public Top withOriginalId(Integer originalId) {
        this.originalId = originalId;
        return this;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Top withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(clusterId);
        dest.writeValue(newsId);
        dest.writeValue(dateCreated);
        dest.writeValue(seoTitle);
        dest.writeValue(hasImage);
        dest.writeValue(hasVideo);
        dest.writeValue(topValue);
        dest.writeValue(title);
        dest.writeValue(partnerTitle);
        dest.writeValue(url);
        dest.writeValue(dateLast);
        dest.writeValue(newsCount);
        dest.writeValue(details);
        dest.writeValue(transition);
        dest.writeValue(originalId);
        dest.writeValue(partnerId);
    }

    public int describeContents() {
        return 0;
    }
}
