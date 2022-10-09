package com.example.affirmations.data

import com.example.affirmations.model.Affirmation
import com.example.affirmations.R

class Datasource {

    fun loadAffirmation(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.drawable.sistemas),
            Affirmation(R.string.affirmation2,R.drawable.ambiental),
            Affirmation(R.string.affirmation3,R.drawable.electrica),
            Affirmation(R.string.affirmation4,R.drawable.electronica),
            Affirmation(R.string.affirmation5,R.drawable.geociencias),
            Affirmation(R.string.affirmation6,R.drawable.gestion),
            Affirmation(R.string.affirmation7,R.drawable.industrial),
            Affirmation(R.string.affirmation8,R.drawable.mecanica),
            Affirmation(R.string.affirmation9,R.drawable.petrolera),
            Affirmation(R.string.affirmation10,R.drawable.quimica)
        )
    }
}