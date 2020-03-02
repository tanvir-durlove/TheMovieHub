package com.arbitrium.moviehub.details;

import com.arbitrium.moviehub.favorites.FavoritesInteractor;
import com.arbitrium.moviehub.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * @author Tanvir Durlove
 */
@Module
public class DetailsModule {
    @Provides
    @DetailsScope
    MovieDetailsInteractor provideInteractor(TmdbWebService tmdbWebService) {
        return new MovieDetailsInteractorImpl(tmdbWebService);
    }

    @Provides
    @DetailsScope
    MovieDetailsPresenter providePresenter(MovieDetailsInteractor detailsInteractor,
                                           FavoritesInteractor favoritesInteractor) {
        return new MovieDetailsPresenterImpl(detailsInteractor, favoritesInteractor);
    }
}
