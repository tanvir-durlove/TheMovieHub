package com.arbitrium.moviehub.favorites;

import com.arbitrium.moviehub.Movie;

import java.util.List;

/**
 * @author Tanvir Durlove
 */
public interface FavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
