package ir.hotelairport.androidapp.airportHotels.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ir.hotelairport.androidapp.airportHotels.DailyStay.DailyStayBookRoomFragment;
import ir.hotelairport.androidapp.airportHotels.PreferenceManager.MyPreferenceManager;
import ir.hotelairport.androidapp.airportHotels.ShortStay.StayBookRoomFragment;


public class DailyRoomPagerAdapter extends FragmentStatePagerAdapter {
    Context context;
    int size=0;
    public DailyRoomPagerAdapter(FragmentManager fm , Context context ) {
        super(fm);
        this.context = context;

        size = MyPreferenceManager.getInstace( context ).getRoom().size();
    }

    @Override
    public Fragment getItem(int position) {

        if (position< size){
            return new DailyStayBookRoomFragment().newInstance(position);
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return size;
    }


}
