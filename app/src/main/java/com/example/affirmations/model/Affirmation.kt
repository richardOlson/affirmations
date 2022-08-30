package com.example.affirmations.model

// These annotations are to make it
// make sure that the correct Int is entered in
// to the correct parameter
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int) {

}