import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.library")
    id("kotlin-android")

}

ext {
    set("libraryName", "ezrecyclerview-adapter")
    set("bintrayName", "ezrecyclerview-adapter")
    set("artifact", "ezrecyclerview-adapter")

}

android {
    compileSdkVersion(project.compileSdk)
    defaultConfig {
        minSdkVersion(project.minSdk)
        targetSdkVersion(project.targetSdk)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    implementation(Library.ANDROIDX_RECYCLER_VIEW)
}

tasks.withType<Javadoc> {
    enabled = false
}

if (project.rootProject.file("local.properties").exists()) {
    apply(from = "https://raw.githubusercontent.com/nuuneoi/JCenter/master/installv1.gradle")
    apply(from = "https://raw.githubusercontent.com/nuuneoi/JCenter/master/bintrayv1.gradle")
}