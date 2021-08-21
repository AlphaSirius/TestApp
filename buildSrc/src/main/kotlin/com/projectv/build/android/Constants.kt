package com.projectv.build.android

sealed class Constants {

    companion object {
        const val compileSdkVersion = 31
        const val minSdkVersion = 21
        const val targetSdkVersion = 31
        const val testInstrumentRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val jvmTarget = "1.8"
    }

}
