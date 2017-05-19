package fvi.at.ua.criminalintent;

import java.util.UUID;

/**
 * Created by Vika on 16.05.2017.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        //generation unique id
        mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
