// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.3")
        classpath(kotlin("gradle-plugin", Version.KOTLIN))
        // NOTE: Do not place your application dependencies here; they belong
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
