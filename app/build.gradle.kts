plugins {
    id("com.android.application")
}

android {
    compileSdk = 34
    buildToolsVersion = "34.0.4"
    namespace = "jkas.datagridviewsample"
    
    defaultConfig {
        applicationId = "jkas.datagridviewsample"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
    }
    
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles("proguard-rules.pro")
        }
    }
    
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":DataGridView"))
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
}