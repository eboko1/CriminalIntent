package fvi.at.ua.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Vika on 16.05.2017.
 */

public class Crime {
    
    private UUID mId;
    private String mTitle;

    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //generation unique id
        mId = UUID.randomUUID();
        mDate = new Date();
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

    public Date getmDate() {
        return mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
