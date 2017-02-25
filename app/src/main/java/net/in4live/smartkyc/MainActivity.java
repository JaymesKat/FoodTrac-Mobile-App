package net.in4live.smartkyc;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.goka.walker.WalkerFragment;

import net.in4live.farmersdata.R;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private int currentPosition;
    private ImageView leftButton;
    private ImageView rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WalkerFragment firstPageFragment = FarmerFragment.newInstance();
        final WalkerFragment secondPageFragment = AddressFragment.newInstance();
        final WalkerFragment thirdPageFragment = FarmFragment.newInstance();

        final ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public WalkerFragment getItem(int position) {
                switch (position) {
                    case FarmerFragment.PAGE_POSITION:
                        return firstPageFragment;
                    case AddressFragment.PAGE_POSITION:
                        return secondPageFragment;
                    case FarmFragment.PAGE_POSITION:
                        return thirdPageFragment;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });

        viewPager.addOnPageChangeListener(firstPageFragment);
        viewPager.addOnPageChangeListener(secondPageFragment);
        viewPager.addOnPageChangeListener(thirdPageFragment);
        viewPager.addOnPageChangeListener(this);

        currentPosition = FarmerFragment.PAGE_POSITION;
        leftButton = (ImageView) findViewById(R.id.left);
        leftButton.setVisibility(View.GONE);
        rightButton = (ImageView) findViewById(R.id.right);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(currentPosition - 1, true);
            }
        });
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(currentPosition + 1, true);
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        currentPosition = position;
        switch (currentPosition) {
            case FarmerFragment.PAGE_POSITION:
                leftButton.setVisibility(View.GONE);
                rightButton.setVisibility(View.VISIBLE);
                break;
            case FarmFragment.PAGE_POSITION:
                leftButton.setVisibility(View.VISIBLE);
                rightButton.setVisibility(View.GONE);
                break;
            default:
                leftButton.setVisibility(View.VISIBLE);
                rightButton.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
