package com.example.class2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bottomNavigationView = findViewById(R.id.bottomNavigation_mainActivity);


        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container_frameLayout_mainActivity, new HomeFragment());
        fragmentTransaction.commit();

        bottomNavigationView.setSelectedItemId(R.id.home_bottomNavigationMenu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.home_bottomNavigationMenu:

                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container_frameLayout_mainActivity, new HomeFragment());
                        fragmentTransaction.commit();

                    return true;

                    case R.id.cart_bottomNavigationMenu:

                            fragmentTransaction = getSupportFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.container_frameLayout_mainActivity, new SearchFragment());
                            fragmentTransaction.commit();
                        return true;

                    case R.id.profile_bottomNavigationMenu:

                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container_frameLayout_mainActivity, new HomeFragment());
                        fragmentTransaction.commit();
                        return true;

                    case R.id.search_bottomNavigationMenu:

                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.container_frameLayout_mainActivity, new SearchFragment());
                        fragmentTransaction.commit();
                        return true;
                    default:
                        return false;

                }
            }
        });

    }
}
