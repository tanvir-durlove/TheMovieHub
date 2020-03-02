package com.arbitrium.moviehub.listing.sorting;

/**
 * @author Tanvir Durlove
 */
interface SortingDialogView {
    void setPopularChecked();

    void setNewestChecked();

    void setHighestRatedChecked();

    void setFavoritesChecked();

    void dismissDialog();

}
