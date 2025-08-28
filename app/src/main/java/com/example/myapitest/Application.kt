package com.example.myapitest

import com.example.myapitest.database.DatabaseBuilder

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    /**
     * fun para inicializar nossas dependências através do nosso Context
     */
    private fun init() {
        DatabaseBuilder.init(this)
    }
}