package com.arbitrium.moviehub.listing.sorting;

/**
 * @author Tanvir Durlove
 */
public interface SortingDialogInteractor {
    int getSelectedSortingOption();

    void setSortingOption(SortType sortType);
}
