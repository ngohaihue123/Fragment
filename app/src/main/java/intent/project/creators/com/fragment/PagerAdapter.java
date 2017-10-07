package intent.project.creators.com.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import intent.project.creators.com.fragment.fragments.Fragment1;
import intent.project.creators.com.fragment.fragments.Fragment2;
import intent.project.creators.com.fragment.fragments.Fragment3;
import intent.project.creators.com.fragment.fragments.Fragment4;
import intent.project.creators.com.fragment.fragments.Fragment5;

/**
 * Created by ngohaihue on 10/7/17.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment1 tab1 = new Fragment1();
                return tab1;
            case 1:
                Fragment2 tab2 =new Fragment2();
                return tab2;
            case 2:
                Fragment3 tab3=new Fragment3();
                return tab3;
            case 3:
                Fragment4 tab4=new Fragment4();
                return tab4;
            case 4:
                Fragment5 tab5=new Fragment5();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

}
