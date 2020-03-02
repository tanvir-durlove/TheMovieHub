package com.arbitrium.moviehub.listing;

import com.arbitrium.moviehub.listing.sorting.SortingDialogFragment;
import com.arbitrium.moviehub.listing.sorting.SortingModule;

import dagger.Subcomponent;

/**
 * @author Tanvir Durlove
 */
@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
