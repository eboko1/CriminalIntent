package fvi.at.ua.criminalintent;

import android.content.Context;

/**
 * Created by Vika on 21.05.2017.
 */

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private CrimeLab(Context context){

    }
    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

}
