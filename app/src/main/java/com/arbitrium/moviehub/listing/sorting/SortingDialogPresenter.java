package com.arbitrium.moviehub.listing.sorting;

/**
 * @author Tanvir Durlove
 */
public interface SortingDialogPresenter {
    void setLastSavedOption();

    void onPopularMoviesSelected();

    void onHighestRatedMoviesSelected();

    void onFavoritesSelected();

    void onNewestMoviesSelected();

    void setView(SortingDialogView view);

    void destroy();
}
