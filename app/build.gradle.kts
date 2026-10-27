plugins {
    id("com.android.application")
}

android {
    namespace = "com.atallam.fun"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.atallam.fun"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    lint {
        abortOnError = false
    }
}
