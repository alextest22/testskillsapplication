package com.example.alex.testskillsapplication.http.model;

import android.databinding.BaseObservable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 04.03.18.
 */

public class BaseResponse extends BaseObservable implements Serializable, Parcelable {
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("catseo")
    @Expose
    private String catseo;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("cat")
    @Expose
    private Integer cat;
    @SerializedName("reg")
    @Expose
    private Integer reg;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("special")
    @Expose
    private Boolean special;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("PageTitle")
    @Expose
    private String pageTitle;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("ipp")
    @Expose
    private Integer ipp;
    @SerializedName("more")
    @Expose
    private Boolean more;
    @SerializedName("tops")
    @Expose
    private List<Top> tops = new ArrayList<Top>();
    @SerializedName("Details")
    @Expose
    private Boolean details;
    @SerializedName("Transition")
    @Expose
    private Boolean transition;
    public final static Parcelable.Creator<BaseResponse> CREATOR = new Creator<BaseResponse>() {


        @SuppressWarnings({
                "unchecked"
        })
        public BaseResponse createFromParcel(Parcel in) {
            return new BaseResponse(in);
        }

        public BaseResponse[] newArray(int size) {
            return (new BaseResponse[size]);
        }

    }
            ;
    private final static long serialVersionUID = 365294008265830857L;

    protected BaseResponse(Parcel in) {
        this.lang = ((String) in.readValue((String.class.getClassLoader())));
        this.catseo = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.cat = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.reg = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.version = ((String) in.readValue((String.class.getClassLoader())));
        this.special = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.pageTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.page = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.ipp = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.more = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.tops, (Top.class.getClassLoader()));
        this.details = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.transition = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public BaseResponse() {
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public BaseResponse withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getCatseo() {
        return catseo;
    }

    public void setCatseo(String catseo) {
        this.catseo = catseo;
    }

    public BaseResponse withCatseo(String catseo) {
        this.catseo = catseo;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseResponse withType(String type) {
        this.type = type;
        return this;
    }

    public Integer getCat() {
        return cat;
    }

    public void setCat(Integer cat) {
        this.cat = cat;
    }

    public BaseResponse withCat(Integer cat) {
        this.cat = cat;
        return this;
    }

    public Integer getReg() {
        return reg;
    }

    public void setReg(Integer reg) {
        this.reg = reg;
    }

    public BaseResponse withReg(Integer reg) {
        this.reg = reg;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BaseResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    public Boolean getSpecial() {
        return special;
    }

    public void setSpecial(Boolean special) {
        this.special = special;
    }

    public BaseResponse withSpecial(Boolean special) {
        this.special = special;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BaseResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public BaseResponse withPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public BaseResponse withPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getIpp() {
        return ipp;
    }

    public void setIpp(Integer ipp) {
        this.ipp = ipp;
    }

    public BaseResponse withIpp(Integer ipp) {
        this.ipp = ipp;
        return this;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public BaseResponse withMore(Boolean more) {
        this.more = more;
        return this;
    }

    public List<Top> getTops() {
        return tops;
    }

    public void setTops(List<Top> tops) {
        this.tops = tops;
    }

    public BaseResponse withTops(List<Top> tops) {
        this.tops = tops;
        return this;
    }

    public Boolean getDetails() {
        return details;
    }

    public void setDetails(Boolean details) {
        this.details = details;
    }

    public BaseResponse withDetails(Boolean details) {
        this.details = details;
        return this;
    }

    public Boolean getTransition() {
        return transition;
    }

    public void setTransition(Boolean transition) {
        this.transition = transition;
    }

    public BaseResponse withTransition(Boolean transition) {
        this.transition = transition;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(lang);
        dest.writeValue(catseo);
        dest.writeValue(type);
        dest.writeValue(cat);
        dest.writeValue(reg);
        dest.writeValue(version);
        dest.writeValue(special);
        dest.writeValue(title);
        dest.writeValue(pageTitle);
        dest.writeValue(page);
        dest.writeValue(ipp);
        dest.writeValue(more);
        dest.writeList(tops);
        dest.writeValue(details);
        dest.writeValue(transition);
    }

    public int describeContents() {
        return 0;
    }

}
