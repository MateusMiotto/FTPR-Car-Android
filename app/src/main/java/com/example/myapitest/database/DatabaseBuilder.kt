package com.example.myapitest.database

import android.content.Context
import androidx.room.Room

object DatabaseBuilder {
    @Volatile private var instance: AppDatabase? = null

    fun init(context: Context) {
        if (instance == null) synchronized(this) {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
            }
        }
    }

    fun get(): AppDatabase =
        requireNotNull(instance) { "Chame DatabaseBuilder.init(context) no Application" }
}
