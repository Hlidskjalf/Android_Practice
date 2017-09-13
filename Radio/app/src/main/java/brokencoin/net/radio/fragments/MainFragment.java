package brokencoin.net.radio.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import brokencoin.net.radio.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    /*
        This is the one code block that's been edited. The return statement has been modified to
        return v, which is now a new View object. v inflates the inflater, sets the fragment, the
        container, and the savedInstanceState to false. The FragmentManager is then instantiated,
        and calls getActivity().getSupportFragmentManager(). Instances of the Stations class are then
        created (3 of them, for the fragment_stations.xml file. The stationsFragment instances
        (1, 2, and 3), defined by top, middle, and bottom rows, are then used in the FragmentManager.
         To complete this you must beginTransaction, .add(), and .commit(). The .add() function takes
         the @/id and the Stations class instance.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        FragmentManager fm = getActivity().getSupportFragmentManager();
        Stations stationsFragment1;
        Stations stationsFragment2;
        Stations stationsFragment3;

        stationsFragment1 = Stations.newInstance(Stations.STATION_TYPE_FEATURED);
        fm.beginTransaction().add(R.id.container_top_row, stationsFragment1).commit();

        stationsFragment2 = Stations.newInstance(Stations.STATION_TYPE_RECENT);
        fm.beginTransaction().add(R.id.container_middle_row, stationsFragment2).commit();

        stationsFragment3 = Stations.newInstance(Stations.STATION_TYPE_OTHER);
        fm.beginTransaction().add(R.id.container_bottom_row, stationsFragment3).commit();

        return v;
    }

}
