package com.arbitrium.moviehub.listing.sorting;

/**
 * @author arun
 */
public interface SortingDialogInteractor {
    int getSelectedSortingOption();

    void setSortingOption(SortType sortType);
}
