package com.arbitrium.moviehub.listing.sorting;

/**
 * @author Tanvir Durlove
 */
class SortingDialogInteractorImpl implements SortingDialogInteractor {
    private SortingOptionStore sortingOptionStore;

    SortingDialogInteractorImpl(SortingOptionStore store) {
        sortingOptionStore = store;
    }

    @Override
    public int getSelectedSortingOption() {
        return sortingOptionStore.getSelectedOption();
    }

    @Override
    public void setSortingOption(SortType sortType) {
        sortingOptionStore.setSelectedOption(sortType);
    }
}
