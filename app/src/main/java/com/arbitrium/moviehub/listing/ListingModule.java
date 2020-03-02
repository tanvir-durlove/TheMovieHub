package com.arbitrium.moviehub.listing;

import com.arbitrium.moviehub.favorites.FavoritesInteractor;
import com.arbitrium.moviehub.listing.sorting.SortingOptionStore;
import com.arbitrium.moviehub.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 *
 * @author Tanvir Durlove
 */
@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
