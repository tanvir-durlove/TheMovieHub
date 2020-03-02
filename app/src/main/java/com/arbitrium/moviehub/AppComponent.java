package com.arbitrium.moviehub;

import com.arbitrium.moviehub.details.DetailsComponent;
import com.arbitrium.moviehub.details.DetailsModule;
import com.arbitrium.moviehub.favorites.FavoritesModule;
import com.arbitrium.moviehub.listing.ListingComponent;
import com.arbitrium.moviehub.listing.ListingModule;
import com.arbitrium.moviehub.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author arunsasidharan
 * @author pulkitkumar
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
