/*

 This is the source code of exteraGram for Android.

 We do not and cannot prevent the use of our code,
 but be respectful and credit the original author.

 Copyright @immat0x1, 2023

*/

package com.reversegram.messenger;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.reversegram.messenger.icons.BaseIconSet;

public class ReverseResources extends Resources {

    private final Resources mResources;
    private BaseIconSet current = ReverseConfig.getIconPack();

    public void getActiveIconPack() {
        current = ReverseConfig.getIconPack();
    }

    public ReverseResources(@NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        mResources = resources;
    }

    @Nullable
    @Override
    public Drawable getDrawableForDensity(int id, int density, @Nullable Theme theme) {
        return mResources.getDrawableForDensity(current.getIcon(id), density, theme);
    }

}
