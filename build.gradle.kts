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
        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
        classpath("com.github.dcendents:android-maven-gradle-plugin:2.1")
        // NOTE: Do not place your application dependencies here; they belong
    }
}

allprojects {
    ext {

        set("bintrayRepo", "EzRecyclerView")

        set("developerId", "amalhanaja")
        set("developerName", "Alfian Akmal Hanantio")
        set("developerEmail", "amalhanaja@gmail.com")

        set("siteUrl" , "https://github.com/amalhanaja/EzRecyclerView")
        set("gitUrl" , "https://github.com/amalhanaja/EzRecyclerView.git")

        set("publishedGroupId", project.groupId)
        set("libraryVersion", project.versionName)
        set("libraryDescription", "Eazier Recycler View.")

        set("licenseName", "The Apache License, Version 2.0")
        set("licenseUrl", "https://www.apache.org/licenses/LICENSE-2.0.txt")
        set("allLicenses", listOf("Apache-2.0"))

    }
    repositories {
        google()
        jcenter()
    }

    group = project.groupId
    version = project.versionName
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
