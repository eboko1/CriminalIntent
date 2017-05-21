package fvi.at.ua.criminalintent;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;


public class CrimeActivity extends FragmentActivity  {
    private  FragmentManager fm;
    private Fragment fragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragmentConteiner);


        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragmentConteiner, fragment).commit();

        }

    }

}
