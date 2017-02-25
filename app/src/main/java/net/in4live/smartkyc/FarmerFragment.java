package net.in4live.smartkyc;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;

import com.goka.walker.WalkerFragment;
import com.goka.walker.WalkerLayout;

import net.in4live.farmersdata.R;

import java.util.Arrays;
/**
 * Created by Jaymo on 02/07/2016.
 */
public class FarmerFragment extends WalkerFragment {

    public static final String TAG = FarmerFragment.class.getSimpleName();

    public static final int PAGE_POSITION = 0;
    private WalkerLayout walkerLayout;

    public static FarmerFragment newInstance() {
        Bundle args = new Bundle();
        FarmerFragment fragment = new FarmerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.farmer_form, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AutoCompleteTextView firstName = (AutoCompleteTextView) view.findViewById(R.id.FirstName);
        AutoCompleteTextView lastName = (AutoCompleteTextView) view.findViewById(R.id.LastName);
        walkerLayout = (WalkerLayout) view.findViewById(R.id.walker);
        walkerLayout.setSpeedVariance(new PointF(0.0f, 2.0f));
        walkerLayout.setAnimationType(WalkerLayout.AnimationType.InOut);
        walkerLayout.setIgnoredViewTags(Arrays.asList("1", "2"));
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

