package com.arbitrium.moviehub.details;

import com.arbitrium.moviehub.Review;
import com.arbitrium.moviehub.ReviewsWrapper;
import com.arbitrium.moviehub.Video;
import com.arbitrium.moviehub.VideoWrapper;
import com.arbitrium.moviehub.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author Tanvir Durlove
 */
class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
