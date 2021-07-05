plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    jcenter()
    maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
}

val dokka_version: String by project

dependencies {
    compileOnly("org.jetbrains.dokka:dokka-core:$dokka_version")
    implementation("org.jetbrains.dokka:dokka-base:$dokka_version")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
