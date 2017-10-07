package intent.project.creators.com.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            // new Tab, set Tab
            tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            tabLayout.addTab(tabLayout.newTab().setText("Image 1"));
            tabLayout.addTab(tabLayout.newTab().setText("Image 2"));
            tabLayout.addTab(tabLayout.newTab().setText("Image 3"));
            tabLayout.addTab(tabLayout.newTab().setText("Image 4"));
            tabLayout.addTab(tabLayout.newTab().setText("Image 5"));
            tabLayout.setTabGravity(TabLayout.MODE_SCROLLABLE);

            viewPager = (ViewPager) findViewById(R.id.pager);
            // new adapter
            adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

            // set tab when user click
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

        } catch (Exception e) {

        }


    }

}
