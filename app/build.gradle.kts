import com.projectv.build.dependencies.applyAndroidTestImplementationDependencies
import com.projectv.build.dependencies.applyImplementationDependencies
import com.projectv.build.dependencies.applyTestImplementationDependencies
import com.projectv.build.dependencies.Dependency.*
import com.projectv.build.android.Constants

plugins {

    id(com.projectv.build.Plugins.ANDROID_PLUGIN)
    id(com.projectv.build.Plugins.KOTLIN_ANDROID)
}



android {

    compileSdk = Constants.compileSdkVersion
    defaultConfig {

        minSdk = Constants.minSdkVersion
        targetSdk = Constants.targetSdkVersion
        testInstrumentationRunner = Constants.testInstrumentRunner
    }

    buildTypes {

        getByName("release") {

            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {

        jvmTarget = Constants.jvmTarget
    }
}


applyImplementationDependencies(CORE_KTX,

    APPCOMPAT,
    MATERIAL,
    CONSTRAINT_LAYOUT
    )


applyAndroidTestImplementationDependencies()
applyTestImplementationDependencies()
