plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(project.compileSdk)
    defaultConfig {
        applicationId = "com.amalcodes.ezrecyclerview.sample"
        minSdkVersion(project.minSdk)
        targetSdkVersion(project.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7", Version.KOTLIN))
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation(project(":ezrecyclerview-adapter"))
    implementation(Library.ANDROIDX_RECYCLER_VIEW)
}
