package com.arbitrium.moviehub.details;

import com.arbitrium.moviehub.Movie;
import com.arbitrium.moviehub.Review;
import com.arbitrium.moviehub.Video;

import java.util.List;

/**
 * @author arun
 */
interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
