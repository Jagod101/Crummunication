package chapman.coders.crummunication.models;

import java.util.ArrayList;

/**
 * Created by tommy on 4/13/18.
 */

public class Channel {
    private int mChannelId;
    private String mChannelName;
    private String mChannelDesc;
    private ArrayList<User> mUsers;

    public Channel() {
        // Should never get here

        this.mChannelId = -1;
        this.mChannelName = "";
        this.mChannelDesc = "";
        this.mUsers = null;
    }

    public Channel(int channelId, String channelName, String channelDesc) {
        this.mChannelId = channelId;
        this.mChannelName = channelName;
        this.mChannelDesc = channelDesc;

        this.mUsers = new ArrayList<User>(20);
    }

    public int getmChannelId() {
        return mChannelId;
    }

    public String getmChannelName() {
        return mChannelName;
    }

    public void setmChannelName(String mChannelName) {
        this.mChannelName = mChannelName;
    }

    public String getmChannelDesc() {
        return mChannelDesc;
    }

    public void setmChannelDesc(String mChannelDesc) {
        this.mChannelDesc = mChannelDesc;
    }
}
