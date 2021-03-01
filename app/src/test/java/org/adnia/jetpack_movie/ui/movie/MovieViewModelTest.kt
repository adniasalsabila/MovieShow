package org.adnia.jetpack_movie.ui.movie

import org.junit.Assert.*
import org.adnia.jetpack_movie.R
import org.adnia.jetpack_movie.model.DataMovieTvshow
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var data: DataMovieTvshow

    @Before
    fun setUp() {
        movieViewModel = MovieViewModel()
        data = DataMovieTvshow(
                2,
                "Aquaman",
                "69%",
                "Action, Adventure, Fantasy",
                "Once home to the most advanced civilization on Earth, Atlantis is now an " +
                        "underwater kingdom ruled by the power-hungry King Orm. With a vast army at " +
                        "his disposal, Orm plans to conquer the remaining oceanic people and then " +
                        "the surface world. Standing in his way is Arthur Curry, Orms half-human, " +
                        "half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman
        )
    }

    @After
    fun tearDown() {
    }


    @Test
    fun testGetMovie() {
        Assert.assertNotNull(data)
        Assert.assertEquals(10, movieViewModel.getMovie().size)
    }

    @Test
    fun testDetailMovie() {
        assertEquals(data.id, movieViewModel.detailMovie(2)?.id)
        assertEquals(data.tittle, movieViewModel.detailMovie(2)?.tittle)
        assertEquals(data.rating, movieViewModel.detailMovie(2)?.rating)
        assertEquals(data.genre, movieViewModel.detailMovie(2)?.genre)
        assertEquals(data.overview, movieViewModel.detailMovie(2)?.overview)
        assertEquals(data.poster, movieViewModel.detailMovie(2)?.poster)
    }
}