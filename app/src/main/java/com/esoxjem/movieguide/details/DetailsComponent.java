package com.esoxjem.movieguide.details;

import dagger.Subcomponent;

/**
 * @author td
 */
@DetailsScope
@Subcomponent(modules = {DetailsModule.class})
public interface DetailsComponent {
    void inject(MovieDetailsFragment target);

}