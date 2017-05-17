package fvi.at.ua.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Vika on 17.05.2017.
 */

public class CrimeFragment extends Fragment{
    private  Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
