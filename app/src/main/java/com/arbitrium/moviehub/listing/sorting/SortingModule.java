package com.arbitrium.moviehub.listing.sorting;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Tanvir Durlove
 */
@Module
public class SortingModule {
    @Provides
    SortingDialogInteractor providesSortingDialogInteractor(SortingOptionStore store) {
        return new SortingDialogInteractorImpl(store);
    }

    @Provides
    SortingDialogPresenter providePresenter(SortingDialogInteractor interactor) {
        return new SortingDialogPresenterImpl(interactor);
    }
}
