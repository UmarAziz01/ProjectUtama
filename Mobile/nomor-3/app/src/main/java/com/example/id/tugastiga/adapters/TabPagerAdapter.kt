package com.example.id.tugastiga.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.id.tugastiga.fragments.LikesFragment
import com.example.id.tugastiga.fragments.MediaFragment
import com.example.id.tugastiga.fragments.RepliesFragment
import com.example.id.tugastiga.fragments.TweetsFragment

class TabPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 4  // Jumlah tab

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TweetsFragment()
            1 -> RepliesFragment()
            2 -> MediaFragment()
            3 -> LikesFragment()
            else -> TweetsFragment()
        }
    }
}