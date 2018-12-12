package win.prashant.fragmenttesting;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragmentlogin extends Fragment {

    @Nullable
    @Override

    // layout inflater to make sure with layout need to be connected
    //OnCreateview is for fragment call for activity is for onCreate

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //to access the fragment from Resource inside layout then name of fragment
        View view = inflater.inflate(R.layout.fragmentlogin,container,false);
        return view;
    }
}
