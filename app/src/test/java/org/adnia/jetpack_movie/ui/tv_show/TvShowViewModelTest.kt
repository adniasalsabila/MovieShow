package org.adnia.jetpack_movie.ui.tv_show

import org.adnia.jetpack_movie.R
import org.adnia.jetpack_movie.model.DataMovieTvshow
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var data: DataMovieTvshow

    @Before
    fun setUp() {
        tvShowViewModel = TvShowViewModel()
        data = DataMovieTvshow(
                7,
                "Gotham",
                "75%",
                "Drama, Fantasy, Crime",
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's " +
                        "greatest foes, a man whose reputation is synonymous with law and order. " +
                        "But what is known of Gordon's story and his rise from rookie detective " +
                        "to Police Commissioner? What did it take to navigate the multiple layers of " +
                        "corruption that secretly ruled Gotham City, the spawning ground of the world's " +
                        "most iconic villains? And what circumstances created them – the larger-than-life personas " +
                        "who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.poster_gotham
        )
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testGetTvshow() {
        Assert.assertNotNull(data)
        Assert.assertEquals(12, tvShowViewModel.getTvshow().size)
    }

    @Test
    fun testDetailTvShow() {
        assertEquals(data.id, tvShowViewModel.detailTvShow(7)?.id)
        assertEquals(data.tittle, tvShowViewModel.detailTvShow(7)?.tittle)
        assertEquals(data.rating, tvShowViewModel.detailTvShow(7)?.rating)
        assertEquals(data.genre, tvShowViewModel.detailTvShow(7)?.genre)
        assertEquals(data.overview, tvShowViewModel.detailTvShow(7)?.overview)
        assertEquals(data.poster, tvShowViewModel.detailTvShow(7)?.poster)
    }
}