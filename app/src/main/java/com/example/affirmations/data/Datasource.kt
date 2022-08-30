package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {



    /**
     * Function that is used to load the affirmations and
     * prepare them for use for the app.
     */
    fun loadAffirmations(): List<Affirmation>{

        // getting the affirmations
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10),

        )
    }
}