package com.xio.manager.classui;


import android.os.Parcel;
import android.os.Parcelable;

import com.xio.manager.model.IconColor;

public class ClassInfoModel implements Parcelable {

    public String url;
    public int groupIconAlignment;
    public int groupGravity;
    public int groupAlignment;
    public IconColor icon;
    public  String classDescription;
    public  String classNumber;
    public  String classId;


    public ClassInfoModel(String classNumber, String classDescription,String classId) {
        this.classNumber = classNumber;
        this.classDescription = classDescription;
        this.classId = classId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeInt(this.groupIconAlignment);
        dest.writeInt(this.groupGravity);
        dest.writeInt(this.groupAlignment);
        dest.writeString(this.classDescription);
        dest.writeString(this.classNumber);
        dest.writeString(this.classId);
    }

    protected ClassInfoModel(Parcel in) {
        this.url = in.readString();
        this.groupIconAlignment = in.readInt();
        this.groupGravity = in.readInt();
        this.groupAlignment = in.readInt();
        this.classDescription = in.readString();
        this.classNumber = in.readString();
        this.classId = in.readString();
    }

    public static final Parcelable.Creator<ClassInfoModel> CREATOR = new Parcelable.Creator<ClassInfoModel>() {
        @Override
        public ClassInfoModel createFromParcel(Parcel source) {
            return new ClassInfoModel(source);
        }

        @Override
        public ClassInfoModel[] newArray(int size) {
            return new ClassInfoModel[size];
        }
    };
}
