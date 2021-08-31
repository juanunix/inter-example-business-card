package br.ortega.businesscard

import android.app.Application
import br.ortega.businesscard.data.AppDatabase
import br.ortega.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}