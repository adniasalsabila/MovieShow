package org.adnia.jetpack_movie.ui.movie

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.movie_fragment.*
import org.adnia.jetpack_movie.R
import org.adnia.jetpack_movie.ui.adapter.DataAdapter

class MovieFragment : Fragment() {

    companion object {
        const val CLICK_MOVIE = 1
    }

    private lateinit var viewModel: MovieViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movie_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MovieViewModel::class.java)

        if (activity != null) {
            val movieViewModel = ViewModelProvider(
                    this,
                    ViewModelProvider.NewInstanceFactory()
            )[MovieViewModel::class.java]
            val movie = movieViewModel.getMovie()
            val adapter = DataAdapter(CLICK_MOVIE)
            adapter.setData(movie)

            recylerview_movie.apply {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }
}