package com.arbitrium.moviehub.details;

import com.arbitrium.moviehub.Review;
import com.arbitrium.moviehub.Video;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
