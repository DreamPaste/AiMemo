package mobile_project.memo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Main_calendar#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Main_calendar extends Fragment {


    public Main_calendar() {
        // Required empty public constructor
    }

    public static Main_calendar newInstance(String param1, String param2) {
        Main_calendar fragment = new Main_calendar();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_calendar, container, false);
    }
}