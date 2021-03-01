package org.adnia.jetpack_movie.ui.activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.adnia.jetpack_movie.R
import org.adnia.jetpack_movie.utils.DataDummy
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    private val moviesData = DataDummy.getMovie()
    private val tvShowsData = DataDummy.getTvshow()

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.recylerview_movie)).apply {
            check(matches(isDisplayed()))
            perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(moviesData.size))
        }
    }

    @Test
    fun loadMovieDetail(){
        onView(withId(R.id.recylerview_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.view_title)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(moviesData[0].tittle)))
        }
        onView(withId(R.id.rating)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(moviesData[0].rating)))
        }
        onView(withId(R.id.genre)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(moviesData[0].genre)))
        }
        onView(withId(R.id.overview)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(moviesData[0].overview)))
        }
        onView(withId(R.id.collapseToolbar)).perform(click())
    }

    @Test
    fun loadTvShow(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.recyclerView_tvShow)).apply {
            check(matches(isDisplayed()))
            perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tvShowsData.size))
        }
    }

    @Test
    fun loadTvShowDetail(){
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.recyclerView_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.view_title)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(tvShowsData[0].tittle)))
        }
        onView(withId(R.id.rating)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(tvShowsData[0].rating)))
        }
        onView(withId(R.id.genre)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(tvShowsData[0].genre)))
        }
        onView(withId(R.id.overview)).apply {
            check(matches(isDisplayed()))
            check(matches(withText(tvShowsData[0].overview)))
        }
        onView(withId(R.id.collapseToolbar)).perform(click())
    }
}