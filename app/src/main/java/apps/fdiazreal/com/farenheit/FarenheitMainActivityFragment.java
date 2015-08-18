package apps.fdiazreal.com.farenheit;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class FarenheitMainActivityFragment extends Fragment {

    public FarenheitMainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_farenheit_main, container, false);

        String[] forecasts = {
            "Today - Sunny - 30/32",
            "Tomorrow - Sunny - 30/32",
            "20.08 - Sunny - 30/32",
            "21.08 - Windy - 26/28",
            "22.08 - Sunny - 28/30",
            "23.08 - Storm - 15/20",
            "24.08 - Sunny - 20/22",
            "21.08 - Windy - 26/28",
            "22.08 - Sunny - 28/30",
            "23.08 - Storm - 15/20",
            "24.08 - Sunny - 20/22"
        };

        ArrayAdapter<String> forecastsAdapter =
                new ArrayAdapter<>(
                    getActivity(),
                    R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview,
                    forecasts);

        ListView forecastListView = (ListView) fragmentView.findViewById(R.id.listview_forecast);

        forecastListView.setAdapter(forecastsAdapter);

        return fragmentView;
    }
}
