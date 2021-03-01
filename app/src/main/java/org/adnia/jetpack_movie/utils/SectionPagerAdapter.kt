package org.adnia.jetpack_movie.utils

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import org.adnia.jetpack_movie.R
import org.adnia.jetpack_movie.ui.movie.MovieFragment
import org.adnia.jetpack_movie.ui.tv_show.TvShowFragment

class SectionPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    @StringRes
    private val tabTitles = intArrayOf(R.string.movie, R.string.tv_show)

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = MovieFragment()
            1 -> fragment = TvShowFragment()
        }
        return fragment as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? =
            mContext.resources.getString(tabTitles[position])

    override fun getCount(): Int = 2
}