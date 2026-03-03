import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "fr.acyll.convention.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    implementation(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    implementation(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
    implementation(libs.compose.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "fr.acyll.convention.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }

        register("androidComposeApplication") {
            id = "fr.acyll.convention.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("cmpApplication") {
            id = "fr.acyll.convention.cmp.application"
            implementationClass = "CmpApplicationConventionPlugin"
        }

        register("kmpLibrary") {
            id = "fr.acyll.convention.kmp.library"
            implementationClass = "KmpLibraryConventionPlugin"
        }

        register("cmpLibrary") {
            id = "fr.acyll.convention.cmp.library"
            implementationClass = "CmpLibraryConventionPlugin"
        }

        register("cmpFeature") {
            id = "fr.acyll.convention.cmp.feature"
            implementationClass = "CmpFeatureConventionPlugin"
        }
    }
}