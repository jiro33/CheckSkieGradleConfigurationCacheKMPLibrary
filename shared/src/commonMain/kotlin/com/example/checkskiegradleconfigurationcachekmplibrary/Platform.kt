package com.example.checkskiegradleconfigurationcachekmplibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform