package br.com.evandro.atividade2.model;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;

public class Comment implements Parcelable {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    private Comment(Parcel parcel) {
        this.postId = parcel.readInt();
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.email = parcel.readString();
        this.body = parcel.readString();
    }

    public static final Parcelable.Creator<Comment> CREATOR = new Parcelable.Creator<Comment>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public Comment createFromParcel(Parcel in) { return new Comment(in); }

        @Override
        public Comment[] newArray(int size) { return new Comment[size]; }
    };

    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    @Override
    public int describeContents() { return 0; }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.postId);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.body);
    }

}