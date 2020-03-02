package com.arbitrium.moviehub.listing;

import com.arbitrium.moviehub.Movie;

import java.util.List;

/**
 * @author Tanvir Durlove
 */
interface MoviesListingView {
    void showMovies(List<Movie> movies);

    void loadingStarted();

    void loadingFailed(String errorMessage);

    void onMovieClicked(Movie movie);
}
