package chapman.coders.crummunication.models;

import java.util.UUID;

/**
 * Created by tommy on 4/13/18.
 */

public class User {
    private UUID mUserId;
    private String[] mPermissions;           // to be defined
    private String mName;
    private String mImgPath;
    private String mEmail;
    private String mPhoneNum;

    public User() {
        // Should never get here

        this.mUserId = null;
        this.mPermissions = null;
        this.mName = "";
        this.mImgPath = "";
        this.mEmail = "";
        this.mPhoneNum = "";
    }

    public User(int permissionLevel, String name, String imgPath, String email, String phoneNum) {
        this.mUserId = UUID.randomUUID();
        this.mPermissions = new String[5];      // Just dummy number to figure out later
        this.mName = name;
        this.mImgPath = imgPath;
        this.mEmail = email;
        this.mPhoneNum = phoneNum;
    }

    public UUID getId() {
        return mUserId;
    }

    public String[] getPermissions() {
        return mPermissions;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getImgPath() {
        return mImgPath;
    }

    public void setImgPath(String imgPath) {
        this.mImgPath = imgPath;
    }

    public String getPhoneNum() {
        return mPhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.mPhoneNum = phoneNum;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }
}
