package net.in4live.smartkyc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.goka.walker.WalkerFragment;
import com.goka.walker.WalkerLayout;

import net.in4live.farmersdata.R;

/**
 * Created by Jaymo on 02/07/2016.
 */
public class FarmFragment extends WalkerFragment {

    public static final String TAG = FarmFragment.class.getSimpleName();

    public static final int PAGE_POSITION = 3;
    private WalkerLayout walkerLayout;
    public String[] names = {};

    public static FarmFragment newInstance() {
        Bundle args = new Bundle();
        FarmFragment fragment = new FarmFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.farm_detail_form, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Spinner farmCatSpinner = (Spinner) view.findViewById(R.id.farmCategory);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.farm_category_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        farmCatSpinner.setAdapter(categoryAdapter);

        Spinner farmTypeSpinner = (Spinner) view.findViewById(R.id.farmType);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> typeAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.farm_type_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        farmTypeSpinner.setAdapter(typeAdapter);

        Spinner farmAcreageSpinner = (Spinner) view.findViewById(R.id.acreage);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> acreageAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.acreage_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        acreageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        farmAcreageSpinner.setAdapter(acreageAdapter);

        Spinner farmProduceSpinner = (Spinner) view.findViewById(R.id.produce);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> farmProduceAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.produce_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        farmProduceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        farmProduceSpinner.setAdapter(farmProduceAdapter);

        walkerLayout = (WalkerLayout) view.findViewById(R.id.walker);
        walkerLayout.setAnimationType(WalkerLayout.AnimationType.Custom);
        walkerLayout.setCustomAnimationListener(new WalkerLayout.CustomAnimationListener() {
            @Override
            public void animate(int index, float offset, WalkerLayout.Direction direction) {
                View child = walkerLayout.getChildAt(index);
                String tag = String.valueOf(child.getTag());
                switch (tag) {
                    case "1":
                        child.setRotation((180.0f) * (1.0f - offset));
                        break;
                    case "2":
                        child.setTranslationX(0.0f);
                        child.setTranslationY((1.0f - offset) * 200);
                        break;
                }
            }
        });
        walkerLayout.setup();
    }

    @Override
    protected int getPagePosition() {
        return PAGE_POSITION;
    }

    @Override
    protected WalkerLayout getWalkerLayout() {
        return walkerLayout;
    }
}
